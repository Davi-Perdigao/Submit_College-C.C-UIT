'''Escreva um programa em Python que print os três tens com valor mais alto do dicionário
dicionário: {'item1': 45.50, 'item2':35, 'item3': 41.30, 'item4':55, 'item5': 24}
Saída:
item4 55
item1 45.5
item3 41.3'''

from collections import Counter 

d = {'item1': 45.50, 'item2':35, 'item3': 41.30, 'item4':55, 'item5': 24}
c = Counter(d) 
maiores = c.most_common(3)  

for val in maiores: 
    print(val[0],val[1]) 