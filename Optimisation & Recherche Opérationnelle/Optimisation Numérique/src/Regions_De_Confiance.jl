#!usr/local/bin/julia
@doc doc"""
Minimise une fonction en utilisant l'algorithme des régions de confiance avec
    - le pas de Cauchy
ou
    - le pas issu de l'algorithme du gradient conjugue tronqué

# Syntaxe
```julia
xk, nb_iters, f(xk), flag = Regions_De_Confiance(algo,f,gradf,hessf,x0,option)
```

# Entrées :

   * **algo**        : (String) string indicant la méthode à utiliser pour calculer le pas
        - **"gct"**   : pour l'algorithme du gradient conjugué tronqué
        - **"cauchy"**: pour le pas de Cauchy
   * **f**           : (Function) la fonction à minimiser
   * **gradf**       : (Function) le gradient de la fonction f
   * **hessf**       : (Function) la hessiene de la fonction à minimiser
   * **x0**          : (Array{Float,1}) point de départ
   * **options**     : (Array{Float,1})
     * **deltaMax**      : utile pour les m-à-j de la région de confiance
                      ``R_{k}=\left\{x_{k}+s ;\|s\| \leq \Delta_{k}\right\}``
     * **gamma1,gamma2** : ``0 < \gamma_{1} < 1 < \gamma_{2}`` pour les m-à-j de ``R_{k}``
     * **eta1,eta2**     : ``0 < \eta_{1} < \eta_{2} < 1`` pour les m-à-j de ``R_{k}``
     * **delta0**        : le rayon de départ de la région de confiance
     * **max_iter**      : le nombre maximale d'iterations
     * **Tol_abs**       : la tolérence absolue
     * **Tol_rel**       : la tolérence relative

# Sorties:

   * **xmin**    : (Array{Float,1}) une approximation de la solution du problème : ``min_{x \in \mathbb{R}^{n}} f(x)``
   * **fxmin**   : (Float) ``f(x_{min})``
   * **flag**    : (Integer) un entier indiquant le critère sur lequel le programme à arrêter
      - **0**    : Convergence
      - **1**    : stagnation du ``x``
      - **2**    : stagnation du ``f``
      - **3**    : nombre maximal d'itération dépassé
   * **nb_iters** : (Integer)le nombre d'iteration qu'à fait le programme

# Exemple d'appel
```julia
algo="gct"
f(x)=100*(x[2]-x[1]^2)^2+(1-x[1])^2
gradf(x)=[-400*x[1]*(x[2]-x[1]^2)-2*(1-x[1]) ; 200*(x[2]-x[1]^2)]
hessf(x)=[-400*(x[2]-3*x[1]^2)+2  -400*x[1];-400*x[1]  200]
x0 = [1; 0]
options = []
xmin, fxmin, flag,nb_iters = Regions_De_Confiance(algo,f,gradf,hessf,x0,options)
```
"""

function Regions_De_Confiance(algo,f::Function,gradf::Function,hessf::Function,x0,options)

    if options == []
        deltaMax = 10
        gamma1 = 0.5
        gamma2 = 2.00
        eta1 = 0.25
        eta2 = 0.75
        delta0 = 2
        max_iter = 1000
        Tol_abs = sqrt(eps())
        Tol_rel = 1e-15
    else
        deltaMax = options[1]
        gamma1 = options[2]
        gamma2 = options[3]
        eta1 = options[4]
        eta2 = options[5]
        delta0 = options[6]
        max_iter = options[7]
        Tol_abs = options[8]
        Tol_rel = options[9]
    end

    n = length(x0)
    xmin = zeros(n)
    fxmin = f(xmin)
    flag = 0
    nb_iters = 0
    xk = x0
    deltak = delta0
    f0 = f(x0)
    g0 = gradf(x0)
    H0 = hessf(x0)
    q0 = f0
    pas_volontaire = true # booléen pour gérer la stagnation volontaire
    """ = qk(0)"""    
    
    """* **flag**    : (Integer) un entier indiquant le critère sur lequel le programme à arrêter
    - **0**    : Convergence
    - **1**    : stagnation du ``x``
    - **2**    : stagnation du ``f``
    - **3**    : nombre maximal d'itération dépassé"""

    while flag == 0 # Tant que le test de convergence est non statisfait

        fk = f(xk)
        gk = gradf(xk)
        Hk = hessf(xk)
        
        # Calcul approximative de sk
        if algo == "cauchy"
            sk, e = Pas_De_Cauchy(gk,Hk,deltak)
        else
            sk = Gradient_Conjugue_Tronque(gk,Hk,[deltak,max_iter,Tol_rel])
        end
        
        # Calcul du ratio gho_k (on note rk)
        denum = gk'*sk+1/2*sk'*Hk*sk
        num = fk-f(xk+sk)
        rk = abs(num/denum)

        # Mise à jour de xk
        if rk >= eta1
            xk1 = xk+sk
        else
            xk1 = xk
            pas_volontaire = false
        end

        fk1 = f(xk1)
        
        # Mise à jour de la région de confiance
        if rk >= eta2
            deltak1 = min(gamma2*deltak, deltaMax)
        elseif rk < eta1
            deltak1 = gamma1*deltak
        else
            deltak1 = deltak
        end
        
        if pas_volontaire # Si on choisi de garder le meme xk on sort pas par stagnation de la solution
            if (norm(xk1-xk) < max(Tol_rel*norm(xk1),Tol_abs))
                flag = 1
                "# si on rentre ici ça veut dire que cette nouvelle itération est redondant puisque xk+1 = xk"
                nb_iters -= 1
            elseif norm(fk1-fk) < max(Tol_rel*norm(fk),Tol_abs)
                flag = 2
            end
        else
            pas_volontaire = true
        end
        
        if nb_iters > max_iter 
            flag = 3
        end
        
        xk = xk1
        deltak = deltak1
        nb_iters = nb_iters + 1
    end

    xmin = xk
    fxmin = f(xmin)

    return xmin, fxmin, flag, nb_iters
end
