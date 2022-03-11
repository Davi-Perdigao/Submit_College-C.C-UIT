'''Sabendo que você receber strings com nomes de paginas na internet que sempre começa com "www." e termina com ".com.br", 
implemente um programa usando somente fatiamento de listas que imprime na tela apenas o nome do site, sem os prefixos e sufixos.

Exemplo -
Entrada: www.google.com.br
Saída: Google'''

lista = input();
print(lista[4:-7])