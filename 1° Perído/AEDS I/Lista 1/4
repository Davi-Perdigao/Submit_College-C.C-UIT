/*
    Faça um programa para receber uma relação de 10 números inteiros em um vetor na função principal. 
    Implemente uma função para receber os dados em um ponteiro. A função deverá ordenar os valores 
    digitados em ordem crescente. O resultado deverá ser impresso na função principal
*/

#include<stdlib.h>
#include<stdio.h>

void ordenaVet(int *num){
    for(int i=0; i<10; i++){
    int aux_menor = *(num + i);
        for(int j=i+1; j<10; j++){
            if(*(num + j) < aux_menor) {
                aux_menor = *(num + j);
                *(num + j) = *(num + i);
                *(num + i) = aux_menor;
            }
        }
    }
}

int main(){
    int vet[10] = {9,1,5,6,7,2,0,8,3,4}, i;

    for(i=0; i<10; i++){
        printf("Digite o %do numero: ", i+1);
        scanf("%d", &vet[i]);
    }

    ordenaVet(vet);

    for(i=0; i<10; i++){
        printf("\n%d", vet[i]);
    }

    printf("\n\n");
    system("pause");
    return 0;
}
