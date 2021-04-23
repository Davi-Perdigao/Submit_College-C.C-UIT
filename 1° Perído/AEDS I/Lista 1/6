/*
    Faça um programa para receber uma quantidade de números inteiros definida pelo usuário
    no momento da execução do programa. Ao final apresente
        a) A soma dos números informados;
        b) A média;
        c) O maior valor:
        d) O menor valor;
    Obs. Implemente uma função para cada item.
*/

#include<stdio.h>
#include<stdlib.h>

int soma(int *num, int quant){
    if(quant == 0) return 0;
    return  *(num + quant-1) + soma(num, quant-1);
}

float media(int *num, int quant, float media){
    return soma(num, quant)/quant;
}

int maior(int *num, int quant){
    int maior = *(num + 0);
    for(int i=1; i<quant; i++){
        if(maior < *(num + i)) maior = *(num + i);
    }
    return maior;
}

int menor(int *num, int quant){
    int menor = *(num + 0);
    for(int i=1; i<quant; i++){
        if(menor > *(num + i)) menor = *(num + i);
    }
    return menor;
}

int main () {
    int quantidade, total = 0;
    float mediaResult = 0;

    printf("Digite a quantidade de numeros: ");
    scanf("%d", &quantidade);

    int vet[quantidade];

    for(int i=0; i<quantidade; i++){
        printf("Digite o %d numero: ", i+1);
        scanf("%d", &vet[i]);
    }

    system("cls");

    for(int i=0; i<quantidade; i++) printf("%d ", vet[i]);

    printf("\nSoma: %d", soma(vet, quantidade));
    printf("\nMedia: %.2f", media(vet, quantidade, mediaResult));
    printf("\nMaior numero: %d", maior(vet, quantidade));
    printf("\nMenor numero: %d", menor(vet, quantidade));

    printf("\n\n");
    system("pause");
    return 0;
}
