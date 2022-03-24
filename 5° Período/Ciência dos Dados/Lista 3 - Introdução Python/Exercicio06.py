'''Faça um programa que receba a altura e o peso de uma pessoa. De acordo com a tabela a
seguir, verifique e mostre qual a classificação dessa pessoa.'''

altura = float(input("Digite a altura: "))
peso = float(input("Digite o peso: "))
if altura < 1.5:
    if peso < 60:
        print("A")
    elif peso >= 60 and peso <= 90:
        print("D")
    else:
        print("G")
elif altura >= 1.5 and altura <= 1.8:
    if peso < 60:
        print("B")
    elif peso >= 60 and peso <= 90:
        print("E")
    else:
        print("H")
else:
    if peso < 60:
        print("C")
    elif peso >= 60 and peso <= 90:
        print("F")
    else:
        print("I")
    
