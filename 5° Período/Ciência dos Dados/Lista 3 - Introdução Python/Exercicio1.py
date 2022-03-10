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