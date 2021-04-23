/*
    Crie um sistema que receba a quantidade de linhas e imprima a imagem a seguir.
    Caso o usuário digite 4:
    *
    **
    ***
    ****
*/

#include<stdio.h>
#include<stdlib.h>

// Função para elaborar a imagem
void imagem(int x){
    int i, j;

    // 1º Laço percorre a quantidade do numero informado e o 2º laço percore a quantidade do numero informado separadamente. Ex.: 2 o laço percorre 2 vezes, ou seja **, e assim por diante até o último numero.
    for(i=0;i<x;i++){
        //quebra de linha sempre que acabar um laço (linha).
        printf("\n\t");
        for(j=0;j<i+1;j++){
            printf("*");
        }
    }
}

int main(){
    int num;
    
    // Recebe a quantidade de linhas.
    printf("Digite a qunatidade de linhas: ");
    scanf("%d", &num);

    // Chama a função.
    imagem(num);

    printf("\n\n\n");
    system("pause");
    return 0;       
}
