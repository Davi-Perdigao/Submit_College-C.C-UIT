'''Escreva um programa que lê duas notas de vários alunos e armazena tais notas em um
dicionário, onde a chave é o nome do aluno. A entrada de dados deve terminar quando for lida
uma string vazia como nome. Escreva uma função que retorna a média do aluno, dado seu
nome.'''

def calcularMedia(aluno):
    return (dicionario[aluno]["1"] + dicionario[aluno]["2"]) / 2

dicionario = {}
while True:
    aluno = input()
    if aluno == "":
        break
    if aluno in dicionario:
        print("Aluno ja inserido")
        continue
    notas = {}
    notas["1"] = float(input())
    notas["2"] = float(input())
    dicionario[aluno] = notas
