/*Crie um programa que permita armazenar o nome, a altura e da data de 
nascimento de 10 pessoas. Cada pessoa deve ser representada por uma struct.
Ao final solicite ao usuário que informe uma altura para pesquisa. 
Liste os dados de todas as pessoas com altura igual o superior ao valor informado.
*/

#include<stdlib.h>
#include<stdio.h>

struct dados{
    char nome[20];
    float altura;
    int data;
} pessoas[10];

int main () {
    int i;
    float altura_base;

    for(i=0 ; i<10 ; i++){
        printf("Pessoa %d\n", i+1);
        printf("a) Nome: ");
        scanf(" %s", &pessoas[i].nome);
        printf("b) Altura: ");
        scanf("%f", &pessoas[i].altura);
        printf("c) Data de nascimento: ");
        scanf("%d", &pessoas[i].data);

        printf("\n");
    }

    printf("Digite a altura para pesquisa: ");
    scanf("%f", &altura_base);

    for(i=0 ; i<10 ; i++){
        if(pessoas[i].altura >= altura_base){ 
            printf("\nNome: %s\nAltura: %.2f\nData de nascimento: %d", pessoas[i].nome, pessoas[i].altura, pessoas[i].data);
        } else printf("Nenhum dado encontrado!");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
