/*
    Faça um programa para receber o nome, quantidade, cor, valor, peso, tamanho, 
    de 10 produtos. Ao final liste os dados do produto de maior.
*/

#include<stdio.h>
#include<stdlib.h>

struct produto {
    char nome[20];
    int quantidade;
    char cor[20];
    float valor;
    float peso;
    float tamanho;
};

int main(){
    struct produto produtos[10];
    float maior = produtos[0].valor;
    for(int i=0; i<10; i++){
        printf("\t%do produto\n", i+1);
        printf("a) Nome: ");
        scanf(" %s", &produtos[i].nome);
        printf("\nb) Quantidade: ");
        scanf("%d", &produtos[i].quantidade);
        printf("\nc) Cor: ");
        scanf(" %s", &produtos[i].cor);
        printf("\nd) Valor: ");
        scanf("%f", &produtos[i].valor);
        printf("\ne) Peso: ");
        scanf("%f", &produtos[i].peso);
        printf("\nf) Tamanho: ");
        scanf("%f", &produtos[i].tamanho);

        if(maior < produtos[i].valor) maior = produtos[i].valor;
    }
}
