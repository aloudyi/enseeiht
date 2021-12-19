#!usr/local/bin/julia

@doc doc"""
Approximation de la solution du sous-problème ``q_k(s) = s^{t}g + (1/2)s^{t}Hs`` 
        avec ``s=-t g_k,t > 0,||s||< \delta_k ``


# Syntaxe
```julia
s1, e1 = Pas_De_Cauchy(gradient,Hessienne,delta)
```

# Entrées
 * **gradfk** : (Array{Float,1}) le gradient de la fonction f appliqué au point ``x_k``
 * **hessfk** : (Array{Float,2}) la Hessienne de la fonction f appliqué au point ``x_k``
 * **delta**  : (Float) le rayon de la région de confiance

# Sorties
 * **s** : (Array{Float,1}) une approximation de la  solution du sous-problème
 * **e** : (Integer) indice indiquant l'état de sortie:
        si g != 0
            si on ne sature pas la boule
              e <- 1
            sinon
              e <- -1
        sinon
            e <- 0

# Exemple d'appel
```julia
g1 = [0; 0]
H1 = [7 0 ; 0 2]
delta1 = 1
s1, e1 = Pas_De_Cauchy(g1,H1,delta1)
```
"""
function Pas_De_Cauchy(g,H,delta)
    "#Initialisations "
    e = 0
    n = length(g)
    s = zeros(n)
    t = 0
    norm_g = norm(g)
    norm_H = norm(H)
    
    quantite = transpose(g)*H*g
    
    if quantite > 0
        t_e = norm_g*norm_g/quantite
        if t_e < delta/norm_g
            t = t_e
            e = 1
        else
            t = delta/norm_g
            e = -1

        end
    else
        if norm(g) == 0
            t = 0
            e = 0
        else
            t = delta/norm_g
            e = -1
        end
    end
    
    s = -t*g   
    return s, e
end
