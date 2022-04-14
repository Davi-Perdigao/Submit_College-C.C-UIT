'''Faça um programa que dê três opções ao usuário:
1 – Cadastrar Pessoa
2 – Alterar Pessoa
3 – Excluir Pessoa

Caso escolha a primeira opção, o programa deve ler: nome, idade, salário, data de nascimento
e salvar esses dados em um arquivo chamado pessoas.txt. O programa deve salvar os dados da
nova pessoa no final do arquivo sem alterar as pessoas já cadastradas no arquivo.

Caso escolha a segunda opção, o programa deve ler: nome, idade, salário, data de nascimento,
ler os dados do arquivo pessoa.txt em um dicionário, alterar os dados dessa pessoa no
dicionário e em seguida criar um novo arquivo pessoa.txt sobrescrevendo o antigo.

Caso escolha a terceira opção o programa deve ler o nome da pessoa, ler os dados do arquivo
pessoa.txt em um dicionário, excluir do dicionário a pessoa que teve o nome lido e em seguida
criar um novo arquivo pessoa.txt sobrescrevendo o antigo.'''

while True:
    print("1- Cadastrar Pessoa")
    print("2- Alterar Pessoa")
    print("3- Excluir Pessoa")
    opcao = int(input())
    
    if opcao == 1: #Novo Cadastro
        texto = input("Insira o nome, idade, salário e data de nascimento da nova pessoa:\n") 
        arquivo = open('Exercícios Extra/teste04.txt','a')
        arquivo.write(texto + "\n")

        print("\nteste04.txt:")
        arquivo = open('Exercícios Extra/teste04.txt','r')
        for linha in arquivo:
            linha = linha.rstrip()
            print (linha)
        arquivo.close()

    elif opcao == 2: #Editando a segunda linha
        with open('Exercícios Extra/teste04.txt', 'r') as arquivo:
            linhas = arquivo.readlines() 

        linhas[1] = 'João, 20, 1200, 19/09/2009\n' 

        with open('Exercícios Extra/teste04.txt', 'w') as arquivo:
            arquivo.writelines(linhas)
            
    elif opcao == 3: #Removendo linha específica
        try: 
            with open('Exercícios Extra/teste04.txt', 'r') as r:
                lines = r.readlines()
        
                with open('Exercícios Extra/teste04.1.txt', 'w') as w:
                    for line in lines:
                        
                        if line.strip('\n') != 'Teste, 23, 1200, 01/01/2001':
                            w.write(line)
            print("Deletado")
        except:
            print("ERRO!")
            
    else:
            print('Opção inválida!')