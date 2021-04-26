/*
    Você foi contratado para criar um código que escreva o grande sucesso da música popular brasileira, “creu”. Para isso você deve receber do usuário a velocidade que ele deseja e escrever a música da velocidade 1 até a informada, no seguinte formato, caso o usuário digite 3, deverá aparecer o código a seguir:
    Velocidade 1 do creu:
    creu
    Velocidade 2 do creu:
    creu creu
    Velocidade 3 do creu:
    creu creu creu
*/

#include<stdlib.h>
#include<stdio.h>

//A lógica desse programa é a mesma do exercício anterior, tendo como diferença somente de uma frase informando a velocidade do creu.

void veloCreu(int x){
    int i, j;

    for (i=1;i<x+1;i++){
        printf("\nVelocidade %d do creu:\n", i);
        for(j=0;j<i;j++){
            printf("creu ");
        }
        printf("\n");
    }
}

int main (){
    int creu;

    printf("Digite a velocidade do creu: ");
    scanf("%d", &creu);

    veloCreu(creu);

    printf("\n\n");
    system("pause");
    return 0;
}
