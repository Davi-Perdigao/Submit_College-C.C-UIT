'''
Faça um programa que leia um número n e em seguida leia n inteiros. Crie uma lista ordenada sem elementos repetidos a 
partir da lista original e mostre a lista original e a lista ordenada sem elementos repetidos na tela
'''
tamanho = int(input("Informe o tamanho da lista: \n"))
lista = []
print("Informe os números da lista: ")
for valor in range(0,tamanho):
    lista.append(int(input()))
lista1 = sorted(lista)

for x in lista1:
    repeticoes = lista1.count(x)
    if repeticoes>1:
        lista1.remove(x)
print("Lista Original:", lista)
print("Lista Ordenada (sem repetição):", lista1)
