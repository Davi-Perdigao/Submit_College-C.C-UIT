/*
    Crie um programa que receba o tempo de 5 corredores em 3 etapas, depois some as 3 etapas em um quarto vetor e diga quem foi o campeão geral das 3 etapas.
        Exemplo
        Etapa1 3.22 4.14 2.10 2.18 4.08
        Etapa2 2.02 2.06 4.35 1.22 2.02
        Etapa3 2.10 3.15 3.20 6.15 2.00
        Total 7.34 9.35 9.65 9.55 8.10
    O vencedor da competição nas 3 etapas foi o corredor número 1.
*/

#include<stdio.h>
#include<stdlib.h>

int main () {
    float camp[4][5], campeao;
    int i, j, loc = 0, loc_empate = 0;
    bool cond_empate = true;

    // Coloca todos os valores 0
    for(i=0;i<4;i++){
        for(j=0;j<5;j++){
            camp[i][j] = 0;
        }
    }
    // Recebe os tempos e soma o total
    for(i=0;i<3;i++){
        for(j=0;j<5;j++){
            printf("Digite o tempo do %do atleta na %d etapa: ", j+1, i+1);
            scanf("%f", &camp[i][j]);
            camp[3][j] += camp[i][j];
        }
        printf("\n");
    }

    campeao = camp[3][0];

    // Verifica se teve empate (somente 2 atletas)
    for(i=0;i<5;i++){
        for(j=i;j<4;j++){
            if(camp[3][i] == camp[3][j+1]){
                cond_empate = false;
                loc_empate = j+2;
                loc = i+1;
            }
        }
    }

    // Verifica qual vencedor
    if(cond_empate){
        for(j=1;j<5;j++){
            if(camp[3][j]  < campeao){
                campeao = camp[3][j];
                loc = j+1;
            }
        }

        printf("\nVencedor foi o atleta %d com %.2f de tempo total.", loc, campeao);
    }

    else{
        printf("Empate entre o atleta %d e o atleta %d.", loc, loc_empate);
    }

    printf("\n\n");
    system("pause");
    return 0;
}
