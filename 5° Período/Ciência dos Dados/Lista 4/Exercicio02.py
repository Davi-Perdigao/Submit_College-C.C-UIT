'''Dada uma sequência de valores inteiros, imprima uma lista de cada contendo o quadrado
de cada um dos valores. Os valores serão digitados em uma única linha, use manipulação de
string para criar uma lista. Use compreensão de lista para converter os valores para inteiro e
calcular o seu quadrado.'''

lista = [1, 2, 5, 7, 11, 13]
quadrado = []
for n in lista:
    quadrado.append(n**2)
print (quadrado)