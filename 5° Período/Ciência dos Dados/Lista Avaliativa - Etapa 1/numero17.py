'''
Plote um histograma com o resultado do exercício anterior.
'''
import matplotlib.pyplot as graf

try:
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

    letras = dicionario.keys() #Gráfico (17)
    valores = dicionario.values()
    graf.bar(letras, valores)
    graf.title("Repeticoes")
    graf.xlabel("Letras")
    graf.ylabel("Número de repetições")
    graf.show()

except:
    print("Arquivo inexistente!")