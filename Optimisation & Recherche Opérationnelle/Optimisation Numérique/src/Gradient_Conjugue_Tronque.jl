@doc doc"""
Minimise le problème : ``min_{||s||< \delta_{k}} q_k(s) = s^{t}g + (1/2)s^{t}Hs``
                        pour la ``k^{ème}`` itération de l'algorithme des régions de confiance

# Syntaxe
```julia
sk = Gradient_Conjugue_Tronque(fk,gradfk,hessfk,option)
```

# Entrées :   
   * **gradfk**           : (Array{Float,1}) le gradient de la fonction f appliqué au point xk
   * **hessfk**           : (Array{Float,2}) la Hessienne de la fonction f appliqué au point xk
   * **options**          : (Array{Float,1})
      - **delta**    : le rayon de la région de confiance
      - **max_iter** : le nombre maximal d'iterations
      - **tol**      : la tolérance pour la condition d'arrêt sur le gradient


# Sorties:
   * **s** : (Array{Float,1}) le pas s qui approche la solution du problème : ``min_{||s||< \delta_{k}} q(s)``

# Exemple d'appel:
```julia
gradf(x)=[-400*x[1]*(x[2]-x[1]^2)-2*(1-x[1]) ; 200*(x[2]-x[1]^2)]
hessf(x)=[-400*(x[2]-3*x[1]^2)+2  -400*x[1];-400*x[1]  200]
xk = [1; 0]
options = []
s = Gradient_Conjugue_Tronque(gradf(xk),hessf(xk),options)
```
"""
function q(s,g,H)
    return s'*g + 1/2*s'*H*s
end
function Gradient_Conjugue_Tronque(gradfk,hessfk,options)

    "# Si option est vide on initialise les 3 paramètres par défaut"
    if options == []
        deltak = 2
        max_iter = 100
        tol = 1e-6
    else
        deltak = options[1]
        max_iter = options[2]
        tol = options[3]
    end
    n = length(gradfk)
    s = zeros(n)
    # Initialisations
    sj = s
    gj = gradfk
    g0 = gj
    pj = -gradfk
    Hj = hessfk
    nb_iters = 0
    
    while norm(gj) > tol*norm(g0)
        Kj = pj'*Hj*pj
        
        # Résolutions de la minimisation de s dans q(s) avec ||s|| < \Delta_k
        if Kj <= 0
            sigma1 = (-2*transpose(sj)*pj+((2*transpose(sj)*pj)^(2)-4*(norm(pj)^2)*(norm(sj)^2-deltak^2))^(1/2))/(2*norm(pj)^2)
            sigma2 = (-2*transpose(sj)*pj-((2*transpose(sj)*pj)^(2)-4*(norm(pj)^2)*(norm(sj)^2-deltak^2))^(1/2))/(2*norm(pj)^2)
            s1 = sj + sigma1*pj
            s2 = sj + sigma2*pj

            if q(s1,gj,Hj) > q(s2,gj,Hj)
                s = s2
            else 
                s = s1
            end

            return s
        end

        alphaj = gj'*gj/Kj

        if norm(sj+alphaj*pj)>=deltak
            sigma1 = (-2*transpose(sj)*pj+((2*transpose(sj)*pj)^(2)-4*(norm(pj)^2)*(norm(sj)^2-deltak^2))^(1/2))/(2*norm(pj)^2)
            sigma2 = (-2*transpose(sj)*pj-((2*transpose(sj)*pj)^(2)-4*(norm(pj)^2)*(norm(sj)^2-deltak^2))^(1/2))/(2*norm(pj)^2)
            
            if sigma1 < 0 
                s = sj + sigma2*pj
            else 
                s = sj + sigma1*pj
            end

            return s
        end
        
        # Mises à jour des paramètres
        sj1 = sj + alphaj*pj
        gj1 = gj + alphaj*Hj*pj
        betaj = gj1'*gj1/(gj'*gj)
        pj1 = -gj1+betaj*pj

        pj = pj1
        sj = sj1
        gj = gj1
        nb_iters = nb_iters+1
        if nb_iters > max_iter
            break
        end
    end

    return sj
end
