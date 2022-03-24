'''Faça um programa que lê do usuário o nome de um arquivo, lê as linhas desse arquivo e
escreve um novo arquivo “invertido.txt” com a informação de cada linha invertida, como
apresentado a seguir. Crie seu próprio arquivo de teste.'''

arquivoLeitura = open(input(), "r")
arquivoEscrita = open("invertido.txt", "w")
for linha in arquivoLeitura:
    arquivoEscrita.write(linha.rstrip()[::-1] + "\n")
arquivoLeitura.close()
arquivoEscrita.close()
