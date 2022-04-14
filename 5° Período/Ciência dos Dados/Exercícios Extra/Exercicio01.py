'''Escreva um programa Python para combinar dois dicionários 
adicionando valores para chaves comuns:
d1 = {'a': 100, 'b': 200, 'c':300}
d2 = {'a': 300, 'b': 200, 'd':400}
Contador({'a': 400, 'b': 400, 'd': 400, 'c': 300})'''

d1 = {'a': 100, 'b': 200, 'c':300}
d2 = {'a': 300, 'b': 200, 'd':400}
contador = {}

for n1 in d1:
    contador[n1] = d1[n1]
            
for n2 in d2:
    if n2 in contador:
        contador[n2] = d2[n2] + contador[n2]
    else:
        contador[n2] = d2[n2]
            
print(contador)