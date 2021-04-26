/*
    Crie duas matrizes 3x3. A primeira será digitada pelo usuário e a segunda deverá ser a
    primeira rotacionada 90º. Ex:
            1 2 3   (0,0)(0,1)(0,2)
            4 5 6   (1,0)(1,1)(1,2)
            7 8 9   (2,0)(2,1)(2,2)
    Segunda Matriz:
            1 4 7   (0,0)(1,0)(2,0)
            2 5 8   (0,1)(1,1)(2,1)
            3 6 9   (0,2)(1,2)(2,2)
*/

#include<stdio.h>
#include<stdlib.h>

// Funçao para "girar" a matriz
void girarMatriz(int x[3][3], int y[3][3]){
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            //A segunda matriz recebe a inversa da primeira matriz
            y[i][j] = x[j][i];
        }
    }
}

int main(){
    int i, j, mtz1[3][3], mtz2[3][3];

    // Recebe a matriz
    for(i=0; i<3; i++){
        for(j=0; j<3; j++){
            printf("Linha %d coluna %d: ", i+1, j+1);
            scanf("%d", &mtz1[i][j]);
        }
        printf("\n");
    }
    // Chama a função
    girarMatriz(mtz1, mtz2);
    // Exibe a matriz inversa
    for(i=0; i<3; i++){
        for(j=0; j<3; j++){
            printf(" %d ", mtz2[i][j]);
        }
        printf("\n");
    }

    system("pause");
    return 0;
}
