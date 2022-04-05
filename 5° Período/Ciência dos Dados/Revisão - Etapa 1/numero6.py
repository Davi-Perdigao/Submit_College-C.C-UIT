'''Faça um programa que leia um número N, em seguida leia N números e os
adicione em uma lista. A seguir crie uma outra lista com os elementos que
são múltiplos de 3 a 5 utilizando compreensão de lista'''

lista = []
N = int(input("Digite N: "))
for i in range(N):
    lista.append(int(input("Digite um numero: ")))
multiplos = [x for x in lista if x%3 == 0 and x%5 == 0]
print (multiplos)