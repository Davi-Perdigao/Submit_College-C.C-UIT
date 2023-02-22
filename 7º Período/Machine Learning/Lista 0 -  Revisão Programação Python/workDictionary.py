#Crie um dicionário com 4 registros, onde o nome é a chave e a idade é o valor
nome_idade = {'Mateus': 25, 'Fernanda': 22, 'Tamires': 26, 'Cristiano': 25}
#Print todo o dicionário
print(nome_idade)
#Print a idade do Mateus
print(nome_idade["Mateus"])
#Adicione a chave Pedro com idade 27
nome_idade['Pedro'] = 27
#Print a idade de Pedro
print(nome_idade)
#Apague o registro Tamires
del nome_idade['Tamires']
#Print o tamanho do dicionário
print(len(nome_idade))