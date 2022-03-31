'''Um palíndromo é uma sequência de caracteres cuja leitura é idêntica se feita da direita
para esquerda ou vice−versa. Por exemplo: OSSO e OVO são palíndromos. Em textos mais
complexos os espaços e pontuação são ignorados. A frase SUBI NO ONIBUS é o exemplo de
uma frase palíndroma onde os espaços foram ignorados. Faça um programa que leia uma
sequência de caracteres, mostre−a e diga se é um palíndromo ou não.'''

terminal = input("Informe uma palavra ou expressão: \n").upper().replace(' ', '')
invertida = terminal[::-1]
if terminal == invertida:
    print("É palíndromo")
else:
    print("Não é um palíndromo")
