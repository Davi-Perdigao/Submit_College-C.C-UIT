'''Leia um arquivo chamado entrada.txt. Esse arquivo conterá dados de pessoas que
foram cadastradas como alunos da Universidade de Itaúna. Os dados estão organizados de
forma que cada cadastro esteja em uma linha e que cada linha seja composta pelos dados:

nome;idade;sexo;

Leia os dados e crie um dicionário com os dados dos novos alunos. 

ATENÇÃO: alguns alunos foram cadastrados de forma duplicada, caso encontre nomes iguais, o segundo 
cadastro deve ser ignorado e não inserido no dicionário. Com o arquivo já armazenado no dicionário, 
ploteum gráfico de linhas em que o eixo X seja a idade e o eixo Y quantos alunos possuem aquelaidade. 

Uma dica: utilize outro dicionário, pode ajudar. Com o gráfico plotado, por fim, crie umarquivo saida.txt 
contendo os dados do arquivo de entrada em ordem alfabética'''

import matplotlib.pyplot as plt
arquivo = open("entrada.txt", "r")
dicionario = {}
for linha in arquivo:
    linha = linha.rstrip()
    dados = linha.split(";")
    if nome in dicionario:
        continue
    dicionario[dados[0]] = {"idade" : dados[1], "sexo" : dados[2]}
arquivo.close()

grafico = {}
for chave in dicionario.keys():
    grafico[dicionario[chave]["idade"]] = grafico.get(dicionario[chave]["idade"], 0) + 1
    
idades = list(grafico.keys())
idades.sort()
contadores = []
for chave in idades:
    contadores.append(grafico[chave])
    
plt.bar(idades, contadores)
plt.xlabel("Idade")
plt.ylabel("Frequencia")
plt.title("Idade x Frequencia")
plt.show()

nomes = list(dicionario.keys())
nomes.sort()
arquivo = open("saida.txt", "w")
for nome in nomes:
    arquivo.write(nome + ";" + dicionario[nome]["idade"] + ";" + dicionario[nome]["sexo"] + "\n")
arquivo.close()