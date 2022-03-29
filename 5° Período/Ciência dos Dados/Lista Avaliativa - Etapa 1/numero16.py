'''
Leia um texto de um arquivo e crie um dicionário que conte o número de 
vezes que cada letra apareceu no texto. Crie seu próprio arquivo de teste.
'''
texto = open("Lista Avaliativa - Etapa 1/teste16.txt", "r")
dicionario = dict()
for linha in texto:
    linha = linha.rstrip()
    for char in linha:
        if char not in dicionario:
            dicionario[char] = 1
        else:
            dicionario[char]= dicionario[char] + 1

print(dicionario)