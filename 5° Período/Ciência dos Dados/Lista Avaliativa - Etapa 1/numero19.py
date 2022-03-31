'''
Crie uma função chamada inverteValor(). Essa função deve receber um inteiro e retornar o valor 
usando apenas operações aritméticas. Em seguida crie uma função que recebe o valor original e o 
valor invertido e retorna TRUE caso os dois números sejam igualmente pares ou igualmente ímpares 
e retorne FALSE caso contrário.
'''
#Função para inverter o valor
def  inverteValor(num):
    num = str(num)
    numInvertido = num[::-1]
    return int(numInvertido)

#Função para compara os valores
def comparar(num, numInvertido):
    if num%2==0 and numInvertido%2==0:
        return True
    elif num%2!=0 and numInvertido%2!=0:
        return True
    else:
        return False

num = int(input("Informe um numero inteiro: "))
numInvertido = inverteValor(num)
print("Valor invertido: " + str(numInvertido))
print("Os dois números são igualmente pares ou igualmente ímpares? " +  str(comparar(num,numInvertido)))