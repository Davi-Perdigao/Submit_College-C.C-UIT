import pandas as pd
import numpy as np
capitais = {
'Estado': {0: 'Acre', 1: 'Amapá', 2: 'Amazonas', 3: 'Pará', 4: 'Rondônia', 5: 'Roraima', 6: 'Tocantins',7:'Minas Gerais'},
'Sigla': {0: 'AC', 1: 'AP', 2: 'AM', 3: 'PA', 4: 'RO', 5: 'RR', 6: 'TO', 7:'MG'},
'População (milhoes)': {0: '0.8035', 1: '0.776', 2: '3.9', 3: '8,1', 4: '1.7', 5: '0.505', 6: '1,5', 7: np.nan}, 
'Capital': {0: 'Rio Branco', 1: 'Macapá', 2: 'Manaus', 3: 'Belém', 4: 'Porto Velho', 5: 'Boa Vista', 6: 'Palmas',7: 'Belo Horizonte'}}
df = pd.DataFrame(capitais)
df = df[df['População (milhoes)'].notna()]
df['População (milhoes)'] = pd.to_numeric(df['População (milhoes)'].str.replace(',', '.'))
mean = df['População (milhoes)'].mean()
print("Média da coluna 'População (milhoes)': ", mean)