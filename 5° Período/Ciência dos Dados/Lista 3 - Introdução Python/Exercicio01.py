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

def primo(x):
    for divisor in range(2, x):
        if x % divisor == 0:
            print("%d não é primo" % x)
            return
    print("%d é primo" % x)

def mmc(x, y):
    if x > y:
        maior = x
    else:
        maior = y
    while True:
        if maior % x == 0 and maior % y == 0:
            print(maior)
            break
        else:
            maior += 1

def soma_digitos(x):
    soma = 0
    while x > 0:
        soma += x % 10
        x = int(x / 10)
    print(soma)

def nesimo_primo(n):
    ultimoPrimo = 0
    contador = 0
    verificar = 2
    while True:
        if contador == n:
            print(ultimoPrimo)
            break
        primo = True
        for divisor in range(2, verificar):
            if verificar % divisor == 0:
                primo = False
                break
        if primo:
            contador += 1
            ultimoPrimo = verificar
        verificar += 1

def hora(h, m, s):
    s += 1
    if s == 60:
        s = 0
        m += 1
    if m == 60:
        m = 0
        h += 1
    if h == 24:
        h = m = s = 0
    print("%02d:%02d:%02d" % (h, m, s))


while True:
    print("1. Verificar se é primo")
    print("2. MMC")
    print("3. Somar dígitos")
    print("4. i-ésimo primo")
    print("5. Hora + 1 segundo")
    print("6. Saída")
    opcao = int(input())
    if opcao == 6:
        break
    elif opcao != 1 and opcao != 2 and opcao != 3 and opcao != 4 and opcao != 5:
        continue
    if opcao == 1:
        x = int(input("Digite o valor de x: "))
        primo(x)
    elif opcao == 2:
        x = int(input("Digite o valor de x: "))
        y = int(input("Digite o valor de y: "))
        mmc(x, y)
    elif opcao == 3:
        x = int(input("Digite o valor de x: "))
        soma_digitos(x)
    elif opcao == 4:
        n = int(input("Digite o valor de n: "))
        nesimo_primo(n)
    elif opcao == 5:
        h = int(input("Digite hh: "))
        m = int(input("Digite mm: "))
        s = int(input("Digite ss: "))
        hora(h, m, s)