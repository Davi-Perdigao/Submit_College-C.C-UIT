"""
Faça um programa que leia um número n e em seguida leia n inteiros. Em seguida crie 
uma lista com o quadrado dos elementos da lista original utilizando compreensão de lista.
"""
tamanho = int(input("Tamanho da lista: \n"))
lista = []
print("Informe os números da lista: ")
for valor in range(tamanho):
    lista.append(int(input()))
quadrado = [num**2 for num in lista]
print("Números elevados ao quadrado:", quadrado)