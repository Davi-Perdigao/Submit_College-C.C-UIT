/*  
    Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    a. "Telefonou para a vítima?"
    b. "Esteve no local do crime?"
    c. "Mora perto da vítima?"
    d. "Devia para a vítima?"
    e. "Já trabalhou com a vítima?"
    O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa
    responder positivamente a 2 questões ela deve ser classificada como "Suspeita ", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
*/

#include<stdio.h>
#include<stdlib.h>

int main() {
    int resposta, cont = 0;

    printf("Telefonou para a vitima?\n[ 0 - Nao / 1 - Sim]: ");
    scanf("%i",&resposta);

    // Contador das respostas
    cont = cont + resposta;

    printf("\nEsteve no local do crime?\n[ 0 - Nao / 1 - Sim]: ");
    scanf("%i",&resposta);

    cont = cont + resposta;

    printf("\nMora perto da vitima?\n[ 0 - Nao / 1 - Sim]: ");
    scanf("%i",&resposta);

    cont = cont + resposta;

    printf("\nDevia para a vitima?\n[ 0 - Nao / 1 - Sim]: ");
    scanf("%i",&resposta);

    cont = cont + resposta;

    printf("\nJá trabalhou com a vitima?\n[ 0 - Nao / 1 - Sim]: ");
    scanf("%i",&resposta);

    cont = cont + resposta;

    // verifica em que categoria as respostas se encaixam 
    if(cont == 2){
        printf("\nSuspeita");
    }

    if(cont >= 3 && cont <= 4){
        printf("\nCumplice");
    }

    if(cont == 5){
        printf("\nAssasino");
    }

    if(cont < 2){
        printf("\nInocente");        
    }


    printf("\n\n\n");
    system("pause");
    return 0;
}
