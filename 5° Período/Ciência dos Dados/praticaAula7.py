import pandas as pd #importando a biblioteca pandas
import numpy as np
import matplotlib.pyplot as plt
import scipy.stats as stats

#--------------- SERIES PANDAS ------------#
#Criando uma Serie
primeiraSerie = pd.Series([1, 2, 3, 4])
print(primeiraSerie)

#Criando uma Serie
segundaSerie = pd.Series([1, 2, 3, 4], ['a', 'b', 'c', 'd'])
print(segundaSerie)

#Média dos valores
print(segundaSerie.mean())

#Maior elemento
print(segundaSerie.max())

#Menor elemento
print(segundaSerie.min())

#Soma dos elementos
print(segundaSerie.sum())

#Alterando os índices de uma Serie
primeiraSerie.index = ['a', 'b', 'c', 'd']
print(primeiraSerie)

#printando um elemento pelo index
print(primeiraSerie['c'])

#Alterando o valor de um elemento pelo index
primeiraSerie['c'] = 6
print(primeiraSerie)

#convertendo dicionario para Series 
dictionary = {'A' : 10, 'B' : 20, 'C' : 30}
series = pd.Series(dictionary)
print(series)

#--------------- DATAFRAME PANDAS ------------#
#Criando um DataFrame vazio
df = pd.DataFrame()
print(df)

df = pd.DataFrame([1, 2, 3, 4, 5])
print(df)

df = pd.DataFrame([['Alex', 10], ['Rafael', 15], ['Bruno', 17]])
print(df)

#Mudando o index das colunas
df.columns = ['Nome', 'Idade']
print(df)

df.index = ['Aluno1', 'Aluno2', 'Aluno3']
print(df)

#Criar DataFrame a partir de um dicionário 
dicionario = {
    'Name' : ['Ankit', 'Aishwarya', 'Shaurya', 'Shivangi'],
    'Age' : [23, 21, 22, 21],
    'University' : ['BHU', 'JNU', 'DU', 'BHU'],
}
df = pd.DataFrame(dicionario)
print(df)

#--------------- FUNÇÕES ÚTEIS ------------#

idade = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
peso = [3.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 20.0, 30.0, 40.0]
indices = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J"]
df = pd.DataFrame({"idade": idade, "peso": peso}, index=indices)
print(df)

#FUNÇÃO reset_index()
#Reset no índice, volta a ser numérico e cria uma nova coluna com os índices usados
print(df.reset_index())

#Reset no índice, volta a ser numérico e não cria uma nova coluna com os índices usados
print(df.reset_index(drop=True))

#Define o índice com uma das colunas
print(df.set_index("idade"))

#FUNÇÃO Transpose - inverte linhas e colunas
print(df)
print(df.transpose())
print(df.T)

#FUNÇÃO sample - n elementos de forma aleatória - Amostra Aleatória
print(df.sample(n=2))

#Utiliza modelos matemáticos para gerar dados aleatórios que contém o seed
#Se eu defino o random state, vai sempre retornar a mesma amostra
print(df.sample(n=4, random_state=52))
print(df.sample(n=4, random_state=52))

#Gerar uma amostra com uma porcentagem dos dados
print(df.sample(frac=0.1)) #10% da minha base

print(df.sample(frac=0.1, replace=True)) #10% da minha base com reposição

#FUNÇÃO value_count() - conta quantas vezes o elemento aparece - leva em consideração a linha inteira
df = pd.DataFrame({'num_pernas': [2, 4, 4, 6],
                   'num_asas': [2, 0, 0, 0]},
                  index=['falcao', 'cachorro', 'gato', 'formiga'])
print(df)
print(df.value_counts())


#FUNÇÃO head() - retorna os n primeiros elementos
idade = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
peso = [3.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 20.0, 30.0, 40.0]
indices = ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J"]
df = pd.DataFrame({"idade": idade, "peso": peso}, index=indices)
df.head(2)

#N negativo - ignora as N últimas linhas
print(df.head(-5))

#Encadeamento da função head
print(df.head(10).head(5).head(1))

#FUNÇÃO info() - Pegar informações da base de dados
print(df.info())

#FUNÇÃO describe()
#include - tipo de dados a verificar
#percentiles - buscar o percentil dos dados
print(df.describe(include=[np.number]))
print(df.describe(include=[np.int64]))
#print(df.describe(include=[np.object]))
print(df.describe(percentiles=[0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.8, 0.9, 0.99]))


#------------------- ARQUIVOS ----------------- #
#Lendo arquivos sem cabeçalhos = header=None
df = pd.read_csv("exemploCSV.csv", sep=";", header=None, names=["Numero", "Letra"])
print(df)

#Alguns casos posso querer substituir o nome das colunas
#Ignorando a primeira linha e colocando o nome das colunas
df = pd.read_csv("exemploCabecalho.csv", sep=";", header=0, names=["Numero", "Letra"])
print(df)

#Ignora as N primeiras linhas (skiprows)
df = pd.read_csv("exemploCSV.csv", sep=";", header=None, names=["Numero", "Letra"], skiprows=2)
print(df)

#Ignorando as N ultimas linhas (skipfooter) - ENGINE (C e PYTHON) só PYTHON SUPORTA skipfooter
df = pd.read_csv("exemploCSV.csv", sep=";", header=None, names=["Numero", "Letra"], skipfooter=2, engine="python")
print(df)

#Normalmente o python ignora linhas em branco, mas pode ser que eu queira buscá-las
df = pd.read_csv("exemploCSV.csv", sep=";", header=None, names=["Numero", "Letra"], skip_blank_lines=False)
print(df)

#Em alguns casos podemos quere DataFrames menores
#Dividindo o arquivo em vários DataFrames
dataFrameList = []
linhasPorDataFrame = 10
numeroDataFrames = 5
for i in range(0, linhasPorDataFrame * numeroDataFrames, linhasPorDataFrame):
    df = pd.read_excel("SampleSuperstore.xls", skiprows=i, nrows=linhasPorDataFrame, )
    dataFrameList.append(df)
print(dataFrameList)

#EXPORTANDO PARA CSV
#Se não colocar index=False vai exportar a coluna de índice
df.to_csv("teste.csv")
df = pd.read_csv("teste.csv", index_col=0)
df.to_csv("teste2.csv", index=False)
df = pd.read_csv("teste2.csv")

#EXPORTANDO PARA EXCEL
#Se não colocar index=False vai exportar a coluna de índice
df.to_excel("teste.xlsx")
df = pd.read_excel("teste.xlsx", index_col=0)
df.to_excel("teste2.xlsx", index=False)
df = pd.read_excel("teste2.xlsx")
#------------------------------------------------------




#-------------------- MAIS FUNÇÕES ----------------
#FUNÇÃO apply() e applymap()
#Remover o R$ com replace - NÃO FUNCIONA
df = pd.read_csv("houses_to_rent.csv")
print(df["hoa"].replace("R$", ""))
#FUNÇÃO lambda
'''
As funções Lambda são chamadas de funções anônimas, mas o que são elas?
Nada mais são do que funções que o usuário não precisa definir, ou seja, 
não vai precisar escrever a função e depois utilizá-la dentro do código.
'''
#APPLY - recebe uma função - lambda
print(df["hoa"].apply(lambda x: x.replace("R$", "").replace(",", "")))
#APPLY em mais de uma coluna - NÃO FUNCIONA
print(df[["hoa", "rent amount", "property tax"]].apply(lambda x: x.replace("R$", "").replace(",", "")))
#APPLYMAP - Um pouco mais lento, mas funciona
print(df[["hoa", "rent amount", "property tax"]].applymap(lambda x: x.replace("R$", "").replace(",", "")))

#FUNÇÃO rename()
#Renomeando colunas - não preciso passar todas
print(df.rename(columns={"rent amount": "rent_amout", "property tax": "property_tax"}).head())

#FUNÇÃO append()
#Criando coluna com o append - Repare que somente a última linha tem o valor
#Bom para casos em que você já tem uma linha inteira para inserir
print(df.append({"Teste": 0}, ignore_index=True))

#FUNÇÃO assign()
#Criando coluna com método assing - não altera base original
print(df.assign(nova_coluna = 15))
print(df)

#Criando coluna com método assing - não altera base original
print(df.assign(soma_lambda = lambda x: x.rooms + x.bathroom).head())
#Criando DUAS colunas com método assing - não altera base original
def diferenca(df):
    return df.rooms - df.bathroom
print(df.assign(soma_lambda = lambda x: x.rooms + x.bathroom, diferenca_funcao = diferenca).head())

#ATRIBUTO shape - retorna como está organizada a estrutura do arquivo (linhas, colunas)
print(df.sample(frac=1, replace=True).shape)

#ATRIBUTO columns - Retornar o nome das colunas
print(df.columns.to_list)

#ATRIBUTO dtypes - retorna o tipo de dados de cada coluna
print(df.dtypes)

#--------------- LOC -----------------------#
'''
Seleciona a partir do rótulo do índice - label
'''
#Método LOC [linhas, colunas]
df = pd.read_excel("iloc.xls", sheet_name=0)
#Retorna um objeto da linha passada como parâmatro
print(df.loc[0])

#Retorna um intervalo de linhas - fatiamento - último incluso
print(df.loc[0:3])
print(df.loc[[1, 3, 5]]) #Não precisa ser um intervalo contínuo
print(df.loc[0:3, ["FirstName"]]) #Segundo parâmetro - selecionar as colunas
print(df.loc[0:3, "FirstName":"LastName"]) #Segundo parâmetro - selecionar as colunas


#--------------- ILOC -----------------------#
'''
Seleciona a partir do número do índice
'''
#Método ILOC
#Retorna um objeto da linha passada como parâmatro
print(df.iloc[0])

#Retorna um intervalo de linhas - fatiamento - último NÃO incluso
print(df.iloc[0:3])
print(df.iloc[[1, 3, 5]]) #Não precisa ser um intervalo contínuo
print(df.iloc[0:3, 3:5]) #Segundo parâmetro - selecionar as colunas
print(df.iloc[[1, 3, 5], [True, True, False, True, False, False, False, True, True]]) #usar uma lista de booleandos para selecionar as colunas

#ENCADEANDO LOC
print(df.loc[:10].loc[:5].loc[:0])


# --------------------- DATAFRAME -------------#
#Criando uma cópia do DataFrame
df_copia = df.copy(deep=True)


# ----------------- PREPARANDO OS DADOS --------------------#
df = pd.read_excel("SampleSuperstore.xls")
print(df.head())

#Observe que a coluna ID não representada nada, além de ser igual ao índice, portanto não precisamos
#dessa coluna
df.drop("Row ID", axis=1, inplace=True)

#Vamos verificar as dimensões do nosso DataFrame
print(df.shape)

#Subsetting - Criando um subconjunto dos dados
df_subset = df.loc[[i for i in range(5, 10)], ["Customer ID", "Customer Name", "City", "Postal Code", "Sales"]]
print(df_subset)

#Subsetting - utilizando o describe no subset
df_subset = df.loc[[i for i in range(100, 200)], ["Sales", "Profit"]]
print(df_subset.describe())

#Montando gráfico para visualizar os dados - Boa opção para visualizar outliers
df_subset.plot.box()
plt.title("BoxPlot de Sales e Profits", fontsize=15)
plt.ylim(0, 500)
plt.grid(True)
plt.show()

#Conditional Subsetting - Buscar dados somente onde o valor de Sale é maior que 100
df_subset = df.loc[[i for i in range(5, 10)], ["Customer ID", "Customer Name", "City", "Postal Code", "Sales"]]
df_subset1 = df_subset[df_subset["Sales"] > 100]
print(df_subset1)

#Grouping
df_subset = df.loc[[i for i in range(10)], ["Ship Mode", "State", "Sales"]]
print(df_subset)
byState = df_subset.groupby("State")
#ERRO - byState não é um DataFrame para ser printado
print(byState)

#Média do groupBy
print(byState.mean())

#Soma do groupBy
print(byState.sum())

#Agrupando por State e visualizando dados estatísticos de 'California'
print(pd.DataFrame(df_subset.groupby("State").describe().loc["California"]).transpose())

#Agrupando por ShipMode e visualizando dados estatísticos de 'Second Class' e 'Standard Class'
print(pd.DataFrame(df_subset.groupby("Ship Mode").describe().loc[["Second Class", "Standard Class"]]).transpose())

#Agrupando por 'State' e 'City'
df_subset = df.loc[[i for i in range(100)], ["Ship Mode", "State", "Sales", "City"]]
byStateCity = df_subset.groupby(["State", "City"])
print(byStateCity.describe())

#-------------- Detectando valores nulos------------------------#
df = pd.read_excel("SampleSuperstore.xls", sheet_name="Missing")

#Método isnull()
print(df.isnull())

#Verificando quantos elementos nulos cada coluna tem
#a função sum() em uma lista de booleanos, conta quantos true existem
for c in df.columns:
    miss = df[c].isnull().sum()
    if miss > 0:
        print("{} tem {} elementos nulos".format(c, miss))
    else:
        print("{} não tem elementos nulos".format(c))


#Método fillna - onde está null, preenche com o parâmetro passado
df = pd.read_excel("SampleSuperstore.xls", sheet_name="Missing")
print(df[["Customer", "Product"]].fillna("VAZIO").head(15))

#foward fill - coloca o valor da linha anterior na linha com null
df = pd.read_excel("SampleSuperstore.xls", sheet_name="Missing")
print(df[["Sales", "Discount", "Profit"]].fillna(method="ffill").head(15))

#before fill - coloca o valor da linha seguinte na linha com null
df = pd.read_excel("SampleSuperstore.xls", sheet_name="Missing")
print(df[["Sales", "Discount", "Profit"]].fillna(method="bfill").head(15))

#Substittui pela média dos valores
df = pd.read_excel("SampleSuperstore.xls", sheet_name="Missing")
print(df["Sales"].fillna(df.mean()["Sales"]).head(15))

#Excluíndo valores nulos com método dropna() = axis é qual coluna levar em consideração
df = pd.read_excel("SampleSuperstore.xls", sheet_name="Missing")
print(df["Sales"].dropna(axis=0).head(15))

#parâmetro thresh - exclui a coluna com mais de X % faltando - NÂO MOSTRAR
df = pd.read_excel("SampleSuperstore.xls", sheet_name="Missing")
print(df.dropna(axis=0, thresh=90).head(15))

#--------------- Discretizando dados --------------------#
def categorizar_sales(preco):
    if preco < 50:
        return "Baixo"
    elif preco >= 50 and preco < 200:
        return "Médio"
    else:
        return "Alto"

df = pd.read_excel("SampleSuperstore.xls")
#Criando uma 'categoria' para os preços
df["Categoria Preco"] = df["Sales"].apply(categorizar_sales)
print(df)

#Utilizando a função apply com outras funções
df["Tamanho Nome"] = df["Customer Name"].apply(len)
print(df)



#--------------------- DETECTANDO OUTLIERS ------------------------#
#Método Z-score
#Fórmula - Z = (valor_linha - média) / desvio_padrao
data = np.array([6, 7, 7, 12, 13, 13, 15, 16, 19, 22])
print(stats.zscore(data))

data = np.array([[5, 6, 7, 7, 8],
                 [8, 8, 8, 9, 9],
                 [2, 2, 4, 4, 5]])
print(stats.zscore(data, axis=1))

#NORMALMENTE consideramos outliers valores de ZSCORE +-3
df = pd.read_csv("houses_to_rent.csv")
numeric_cols = df.select_dtypes(include=[np.number]).columns
print(df[numeric_cols].apply(stats.zscore))

#Gráficos
df = pd.read_excel("SampleSuperstore.xls")
df_subset = df.loc[[i for i in range(100, 200)], ["Sales", "Profit"]]
print(df_subset.describe())

#Montando gráfico para visualizar os dados - Boa opção para visualizar outliers
df_subset.plot.box()
plt.title("BoxPlot de Sales e Profits", fontsize=15)
plt.ylim(0, 500)
plt.grid(True)
plt.show()


# ---------------------- OTIMIZAÇÃO DE MEMÓRIA ------------#
df = pd.read_csv("houses_to_rent.csv")
#Verificar quanto de memória cada Serie está ocupando
print(df.memory_usage(deep=True))

#Por padrão, o pandas sempre abre os dados com o maior valor possível (int64, float64) e nem sempre
#precisamos de todo esse valor
df_copia = df.copy(deep=True)
df_copia["area"] = df_copia["area"].astype(np.int8)

#Dados categóricos
print(df_copia.select_dtypes(include=["object", "int64"]).nunique())
df_copia["city"] = df_copia["city"].astype("category")

print(df_copia.memory_usage(deep=True) / df.memory_usage(deep=True))

#CONCATENANDO DATAFRAMES
df = pd.read_excel("SampleSuperstore.xls")
df1 = df[["Customer Name", "Sales", "Profit"]].sample(n=4)
df2 = df[["Customer Name", "Sales", "Profit"]].sample(n=4)
df3 = df[["Customer Name", "Sales", "Profit"]].sample(n=4)
print(df1)
print(df2)
print(df3)
#Contatenando as linas - axis 0
df_concat = pd.concat([df1, df2, df3], axis=0)
#Contatenando as colunas - axis 1
df_concat1 = pd.concat([df1, df2, df3], axis=1)
print(df_concat)
print(df_concat1)

#Merging por uma chave comum
df = pd.read_excel("SampleSuperstore.xls")
df1 = df[["Customer Name", "Ship Date", "Ship Mode"]][0:4]
df2 = df[["Customer Name", "Product Name", "Quantity"]][2:6]
print(df1)
print(df2)

#Observe que existem linhas duplicadas
print(pd.merge(df1, df2, on="Customer Name", how="inner"))

#Exclui as linhas duplicadas
print(pd.merge(df1, df2, on="Customer Name", how="inner").drop_duplicates())

#Preenche com NaT (Not a Time) e NaN(Not a Number) as linhas nulas
print(pd.merge(df1, df2, on="Customer Name", how="outer"))

#JOIN - semelhante ao SQL
df1.set_index(["Customer Name"], inplace=True)
df2.set_index(["Customer Name"], inplace=True)

print(df1.join(df2, how="left").drop_duplicates())

print(df1.join(df2, how="right").drop_duplicates())

print(df1.join(df2, how="inner").drop_duplicates())

#Indexação por data
#MM/DD/YYYY - formato data
datas = pd.date_range('01/04/2021', periods=3)
print(datas)
dataFrame = pd.DataFrame(np.random.randn(3, 3), index=datas)
print(dataFrame)
