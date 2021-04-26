/*
    Faça um programa para a leitura de duas notas parciais de um aluno.
    O programa deve calcular a média alcançada por aluno e apresentar:
    - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete e menor que 10;
    - A mensagem "Reprovado", se a média for menor do que sete;
    - A mensagem "Aprovado com Distinção", se a média for igual a dez.
*/

#include<stdio.h>
#include<stdlib.h>

int main() {
    float nota1 = 11, nota2 = 11, media = 0;
    
    while (nota1 > 10) { //Laço para repetir para não aceitar notas > 10
        printf("Digite sua primeia nota (max. 10): ");
        scanf("%f", &nota1);
    }

    printf("\n");

    while(nota2 > 10){
        printf("Digite sua segunda nota (max. 10): ");
        scanf("%f", &nota2);
    }

    media = (nota1 + nota2)/2; //calula a média


    if (media >= 7 && media < 10){ // media maior que 7 e menor que 10
        printf("\nAprovado");
    }

    else if(media < 7){ //media menor que 7
        printf("\nReprovado");
    }

    else{ //media igual a 10
        printf("\nAprovado com Distinção");
    }

    printf("\n\n");
    system("pause");
    return 0;
}
