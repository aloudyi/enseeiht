@doc doc"""
Résolution des problèmes de minimisation sous contraintes d'égalités

# Syntaxe
```julia
Lagrangien_Augmente(algo,fonc,contrainte,gradfonc,hessfonc,grad_contrainte,
			hess_contrainte,x0,options)
```

# Entrées
  * **algo** 		   : (String) l'algorithme sans contraintes à utiliser:
    - **"newton"**  : pour l'algorithme de Newton
    - **"cauchy"**  : pour le pas de Cauchy
    - **"gct"**     : pour le gradient conjugué tronqué
  * **fonc** 		   : (Function) la fonction à minimiser
  * **contrainte**	   : (Function) la contrainte [x est dans le domaine des contraintes ssi ``c(x)=0``]
  * **gradfonc**       : (Function) le gradient de la fonction
  * **hessfonc** 	   : (Function) la hessienne de la fonction
  * **grad_contrainte** : (Function) le gradient de la contrainte
  * **hess_contrainte** : (Function) la hessienne de la contrainte
  * **x0** 			   : (Array{Float,1}) la première composante du point de départ du Lagrangien
  * **options**		   : (Array{Float,1})
    1. **epsilon** 	   : utilisé dans les critères d'arrêt
    2. **tol**         : la tolérance utilisée dans les critères d'arrêt
    3. **itermax** 	   : nombre maximal d'itération dans la boucle principale
    4. **lambda0**	   : la deuxième composante du point de départ du Lagrangien
    5. **mu0,tho** 	   : valeurs initiales des variables de l'algorithme

# Sorties
* **xmin**		   : (Array{Float,1}) une approximation de la solution du problème avec contraintes
* **fxmin** 	   : (Float) ``f(x_{min})``
* **flag**		   : (Integer) indicateur du déroulement de l'algorithme
   - **0**    : convergence
   - **1**    : nombre maximal d'itération atteint
   - **(-1)** : une erreur s'est produite
* **niters** 	   : (Integer) nombre d'itérations réalisées

# Exemple d'appel
```julia
using LinearAlgebra
f(x)=100*(x[2]-x[1]^2)^2+(1-x[1])^2
gradf(x)=[-400*x[1]*(x[2]-x[1]^2)-2*(1-x[1]) ; 200*(x[2]-x[1]^2)]
hessf(x)=[-400*(x[2]-3*x[1]^2)+2  -400*x[1];-400*x[1]  200]
algo = "gct" # ou newton|gct
x0 = [1; 0]
options = []
contrainte(x) =  (x[1]^2) + (x[2]^2) -1.5
grad_contrainte(x) = [2*x[1] ;2*x[2]]
hess_contrainte(x) = [2 0;0 2]
output = Lagrangien_Augmente(algo,f,contrainte,gradf,hessf,grad_contrainte,hess_contrainte,x0,options)
```
"""
function Lagrangien_Augmente(algo,fonc::Function,contrainte::Function,gradfonc::Function,
	hessfonc::Function,grad_contrainte::Function,hess_contrainte::Function,x0,options)

	if options == []
		epsilon = 1e-8
		tol = 1e-5
		itermax = 1000
		lambda0 = 2
		mu0 = 100
		tho = 2
	else
		epsilon = options[1]
		tol = options[2]
		itermax = options[3]
		lambda0 = options[4]
		mu0 = options[5]
		tho = options[6]
	end

  n = length(x0)
  xmin = zeros(n)

	fxmin = 0
	flag = 0
	iter = 0
	
  # variables : 
  lambdak = lambda0
  xk = x0
  nu_hat_0 = 0.1258925
  alpha = 0.1
  beta = 0.9
  epsilon0 = 1/mu0
  nu_0 = nu_hat_0/(mu0^alpha)
  iter = 0
  muk = mu0
  nuk = nu_0
  epsilonk = epsilon0
  # constantes
  gradxL0 = gradfonc(x0) + lambdak'*grad_contrainte(x0)
  tol_abs = epsilon
  tol_rel = tol
  c0 = contrainte(x0)
  
  f_min = 0

  # Première initialisation du \/xL(x_0,lambda_0,0)
  gradxL0 = gradfonc(x0) + lambda0'*grad_contrainte(x0)
  
# Tant qu'il n'y a pas convergence on boucle
  while !((norm(gradxL0)<max(tol_rel*norm(gradxL0),tol_abs)) && (norm(contrainte(xk))<max(tol_rel*norm(c0),tol_abs))) # NON(Critère de convergence global)

  # fonctions intermédiaires : (On les mets à l'intérieur pour avoir une variable à propager dans les Algos qu'on utilise et pour avoir 
  # les valeurs de \lambda_k et \mu_k à jour)
    function L(x)
      return fonc(x) + lambdak'*contrainte(x) + muk/2*norm(contrainte(x))
    end

    function gradxL(x)
      return gradfonc(x) + lambdak'*grad_contrainte(x) + muk*grad_contrainte(x)*contrainte(x)
    end

    function hessxL(x)
      return hessfonc(x) + lambdak'*hess_contrainte(x) + muk*grad_contrainte(x)*grad_contrainte(x)' + muk*hess_contrainte(x)*contrainte(x)
    end

    if algo == "newton"
      xk,f_min,flag,nb_iters = Algorithme_De_Newton(L, gradxL, hessxL, xk, [itermax, epsilon, tol])
    else
      xk,f_min,flag,nb_iters = Regions_De_Confiance(algo, L, gradxL, hessxL, xk, [])
    end


    # Mises à jour des multiplicateurs (ou pénalisation)
    if norm(contrainte(xk))<nuk
      lambdak = lambdak + muk*contrainte(xk)
      muk = muk
      epsilonk = epsilonk/muk
      nuk = nuk/muk^beta
      iter = iter + 1
    else
      lambdak = lambdak
      muk = tho*muk
      epsilonk = epsilon0/muk
      nuk = nu_hat_0/muk^alpha
      iter = iter + 1
    end

    gradxL0 = gradfonc(xk) + lambdak'*grad_contrainte(xk)

  end

	return xk,fonc(xk),flag,iter
end
