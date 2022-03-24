'''Escreva um programa que leia um número positivo N e imprima N linhas do triângulo
ordenado. Um triângulo ordenado pode ser visto abaixo, para o caso N = 6.
'''

n = int(input())
contador = 1
for i in range(0, n):
    for j in range(0, i + 1):
        print(contador, end=" ")
        contador += 1
    print()
