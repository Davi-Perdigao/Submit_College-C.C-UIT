"""Leia do usuário os nomes e preços de produtos eletrônicos. Crie uma lista com 
essas informações, de acordo com a estrutura a seguir"""

nome = []
preco = []
produto = []

lista = int(input("Digite o tamanho da Lista: "))

for n in range(lista):
  produto.append(input())

produto.sort()

for n in range(len(produto)):
  prod = produto[n].split()
  preco.append(prod.pop())
  nome.append(" ".join(prod))

for i in range(len(produto)):
  print(nome[n], preco[n])