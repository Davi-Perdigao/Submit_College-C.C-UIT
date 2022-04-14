'''Escreva um programa em Python que print todos os valores únicos do dicionário:

Exemplo: [{"V":"S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, 
{"VII":"S005"}, {"V":"S009"},{"VIII":"S007"}]
Saída: {'S005', 'S002', 'S007', 'S001', 'S009'}'''

d = [{"V":"S001"}, {"V": "S002"}, {"VI": "S001"}, {"VI": "S005"}, {"VII":"S005"},
{"V":"S009"}, {"VIII":"S007"}]

resposta = (set(val for dic in d for val in dic.values())) 
print("Saída: " + str(resposta))