'''Escreva um programa que lê N inteiros, salva-os em uma lista e usa as funções de lista para
imprimir:
• A soma de todos os valores
• A média dos valores digitados
• O maior valor
• O menor valor
• A quantidade de zeros
Nota: O primeiro valor da entrada corresponde a N (número de entradas).
Nota 2: O loop deve exclusivamente fazer a leitura dos valores.'''

n = int(input())
lista = []
for i in range(n):
    lista.append(int(input()))
print(sum(lista))
print(sum(lista) / len(lista))
print(max(lista))
print(min(lista))
print(lista.count(0))
