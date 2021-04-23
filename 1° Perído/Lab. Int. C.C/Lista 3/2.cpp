/*
    Utilizando matrizes faça um programa que receba 3 notas e o percentual de faltas de uma
turma de 10 alunos. Ao final dizer quais estão reprovados.
*/

#include<stdio.h>
#include<stdlib.h>
// Função para verificar se o aluno reprovou
bool reprovado(int x[4]){
    int soma = 0; 
    // Soma todas as notas
    for(int i=0; i<3; i++) soma += x[i];
    // Se o aluno tirou menos de 60 no total ou foi com uma frequência de menor 75% é reprovado
    if(soma < 60 || x[3] < 75) return true;
    return false;
}

int main(){
    int i, j, turma[10][4], auxVet[4];

    // Recebe a matriz
    for(i=0; i<10; i++){
        for(j=0; j<3; j++){
            do{
                printf("%d aluno, nota %d: ", i+1, j+1);
                scanf("%d", &turma[i][j]);
            }while (turma[i][j] < 0 || turma[i][j] > 40);
        }
        do{
            printf("Percentual de faltas: ");
            scanf("%d", &turma[i][j]);
        }while(turma[i][j] > 100 || turma[i][j] < 0);

        printf("\n");
    }
    // Mostra quais foram aprovados e quais foram reprovados
    for(i=0; i<10; i++){
        for(j=0; j<4; j++){
            // Auxiliar para pegar as 3 notas e a frequência de cada aluno
            auxVet[j] = turma[i][j];
        }
        printf("Auluno %d: ", i+1);
        // Se a função retornar true o aluno foi reprovado, se não o aluno é aprovado
        printf(reprovado(auxVet)?"Reprovado":"Aprovado");

        printf("\n");
    }

    printf("\n");
    system("pause");
    return 0;
}
