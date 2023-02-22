terminal = input("Informe uma palavra ou expressão: \n").upper().replace(' ', '')
invertida = terminal[::-1]
if terminal == invertida:
    print("É palíndromo")
else:
    print("Não é um palíndromo")