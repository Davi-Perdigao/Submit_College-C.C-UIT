'''
Faça um programa que leia um número n e em seguida leia n inteiros. Crie uma lista ordenada sem elementos repetidos a 
partir da lista original e mostre a lista original e a lista ordenada sem elementos repetidos na tela
'''
import numpy as np

lista = list(input("Digite apenas numeros inteiros: "))
lista1 = list(set(lista))
lista1.sort()
print("Lista Original:",lista)
print("Lista Sem Repetição:",lista1)
