#!usr/local/bin/julia

@doc doc"""
Approximation de la solution du problème ``\min_{x \in \mathbb{R}^{n}} f(x)`` en utilisant l'algorithme de Newton

# Syntaxe
```julia
x_min,f_min,flag,nb_iters = Algorithme_de_Newton(f,gradf,hessf,x0,option)
```

# Entrées :
   * **f**       : (Function) la fonction à minimiser
   * **gradf**   : (Function) le gradient de la fonction f
   * **hessf**   : (Function) la Hessienne de la fonction f
   * **x0**      : (Array{Float,1}) première approximation de la solution cherchée
   * **options** : (Array{Float,1})
       * **max_iter**      : le nombre maximal d'iterations
       * **Tol_abs**       : la tolérence absolue
       * **Tol_rel**       : la tolérence relative

# Sorties:
   * **xmin**    : (Array{Float,1}) une approximation de la solution du problème  : ``\min_{x \in \mathbb{R}^{n}} f(x)``
   * **f_min**   : (Float) ``f(x_{min})``
   * **flag**     : (Integer) indique le critère sur lequel le programme à arrêter
      * **0**    : Convergence
      * **1**    : stagnation du xk
      * **2**    : stagnation du f
      * **3**    : nombre maximal d'itération dépassé
   * **nb_iters** : (Integer) le nombre d'itérations faites par le programme

# Exemple d'appel
```@example
using Optinum
f(x)=100*(x[2]-x[1]^2)^2+(1-x[1])^2
gradf(x)=[-400*x[1]*(x[2]-x[1]^2)-2*(1-x[1]) ; 200*(x[2]-x[1]^2)]
hessf(x)=[-400*(x[2]-3*x[1]^2)+2  -400*x[1];-400*x[1]  200]
x0 = [1; 0]
options = []
xmin,f_min,flag,nb_iters = Algorithme_De_Newton(f,gradf,hessf,x0,options)
```
"""
function Algorithme_De_Newton(f::Function,gradf::Function,hessf::Function,x0,options)

    "# Si options == [] on prends les paramètres par défaut"
    if options == []
        max_iter = 100
        Tol_abs = sqrt(eps())
        Tol_rel = 1e-15
    else
        max_iter = options[1]
        Tol_abs = options[2]
        Tol_rel = options[3]
    end

    "#Initialisation de variables"
    n = length(x0)
    xk = x0
    xk1 = zeros(n)
    fk1 = 0
    fk = 0
    norm_grad_f0 = norm(gradf(x0))
    flag = 0
    nb_iters = 0

    "# Itération Zéro"
    xk1 = xk - hessf(xk)\gradf(xk)
    norm_grad_f = norm(gradf(xk1))
    norm_hess_f = norm(hessf(xk1))

    fk1 = f(xk1)
    fk = f(xk)
    # Si notre point de départ peut être considéré comme minimum
    if norm(xk1-xk) < max(Tol_rel*norm(xk1),Tol_abs)
       flag = 1
    end
    
    while flag == 0  # Tant que le test de convergence est non satisfait
        nb_iters += 1
        dk = hessf(xk)\gradf(xk) # Calcul du déplacement dk
        xk1 = xk - dk # mise à jour du xk
        norm_grad_f = norm(gradf(xk1))
        norm_hess_f = norm(hessf(xk1))

        fk1 = f(xk1)
        fk = f(xk)

        # Gestion des flags (tests de convergence)
        if norm(gradf(xk1)) < max(Tol_rel*norm_grad_f0,Tol_abs)
            break
        elseif norm(xk1-xk) < max(Tol_rel*norm(xk),Tol_abs)
            flag = 1
        elseif norm(fk1-fk) < max(Tol_rel*norm(fk),Tol_abs)
            flag = 2
        elseif nb_iters >= max_iter 
            flag = 3
        end
        xk = xk1
    end

    xmin = xk1
    f_min = fk1
    return xmin,f_min,flag,nb_iters

end
