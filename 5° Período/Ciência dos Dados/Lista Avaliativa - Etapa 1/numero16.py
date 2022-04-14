'''
Leia um texto de um arquivo e crie um dicionário que conte o número de 
vezes que cada letra apareceu no texto. Crie seu próprio arquivo de teste.
'''

texto = open("Lista Avaliativa - Etapa 1/teste16.txt", "r") 
dicionario = dict()
for linha in texto:
    linha = linha.rstrip()
    for letra in linha:
        if letra not in dicionario:
            dicionario[letra] = 1
        else:
            dicionario[letra]= dicionario[letra] + 1
print(dicionario)

