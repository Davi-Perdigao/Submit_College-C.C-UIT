'''Plote um gráfico de dispersão com os resultados do exercício anterior'''

from matplotlib import pyplot
import numpy as np

lista = list(input("Digite apenas numeros inteiros: "))
lista1 = list(set(lista))
lista1.sort()
print("Lista Original:",lista)
print("Lista Sem Repetição:",lista1) 

pyplot.scatter(lista,lista1)
pyplot.title("Grafico")
pyplot.show()