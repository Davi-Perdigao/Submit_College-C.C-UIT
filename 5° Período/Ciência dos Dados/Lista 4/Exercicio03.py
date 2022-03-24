'''Escreva uma função que conta a quantidade de vogais em um texto (leia o texto de um
arquivo) e armazena tal quantidade em um dicionário, onde a chave é a vogal considerada.
Crie seu próprio arquivo de teste.
'''

arquivo = open("teste.txt", "r")
dicionario = {}
for linha in arquivo:
    for letra in linha:
        if letra in "aeiou":
            dicionario[letra] = dicionario.get(letra, 0) + 1
print(dicionario)
