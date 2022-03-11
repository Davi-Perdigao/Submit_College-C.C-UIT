'''No mesmo script, escreva funções que realizem as instruções a seguir. No programa
principal, escreva um menu que permita ao usuário escolher entre as funções. Retorne ao
menu principal ao final de cada execução. Inclua uma opção “Sair” no seu menu, e encerre o
programa somente quando o usuário selecionar essa opção.
• primo(x): Recebe um inteiro e imprime se ele é primo ou não.
• mmc(x, y): Recebe dois inteiros e calcula o mínimo múltiplo comum (MMC) entre eles
• soma_digitos(x): Recebe um valor inteiro de qualquer tamanho e imprime a soma dos
seus dígitos. Note que sua solução deve ser aritmética, não serão aceitas soluções com
strings.
• nesimo_primo(n): Recebe um inteiro n e imprime qual o n-ésimo valor primo
existente.'''

def mmc(n1,n2):
    if n1 > n2:
        maior = n1
    else:
        maior = n2
    while True:
        if maior % n1 == 0 and maior % n2 == 0:
            print(maior)
            break
        else:
            maior += 1

def primo(n):
    count = 0
    for x in range(1,n+1):
        if((n % x) ==0):
            count = count + 1

    if(count == 2):
            print("Primo")

def digitos(x):
    soma = 0
    while (x != 0):
        resto = x % 10
        x = (x - resto)//10
        soma = soma + resto
    print(soma)

print("Opcao:")
opc = int(input())

if opc == 1:
    print("Numero:")
    num = int(input())
    primo(num)
elif opc == 2:
    print("Numero")
    num1 = int(input())
    print("2 Numero:")
    num2 = int(input())
    mmc(num1,num2)
elif opc == 3:
    print("Numero:")
    num = int(input())
    digitos(num)