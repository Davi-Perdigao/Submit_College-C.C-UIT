'''Dada uma sequência de valores inteiros, imprima uma lista de cada contendo o quadrado
de cada um dos valores. Os valores serão digitados em uma única linha, use manipulação de
string para criar uma lista. Use compreensão de lista para converter os valores para inteiro e
calcular o seu quadrado.'''

listaOriginal = ['1', '2', '3', '4', '5', '6']
quadrado = [int(i) ** 2 for i in listaOriginal]
print(quadrado)
