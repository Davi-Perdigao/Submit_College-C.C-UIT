/*
    Faça um programa que receba um número inteiro do usuário e calcule seu fatorial
*/

#include<stdlib.h>
#include<Stdio.h>

// Função para calcular fatorial
int fatorial(int x){
    int num = 1;
    for(int i = x;i>0;i--){
        num = num * i;
    }

    return num;
}

int main(){
    int num;

    printf("Digite o numero para fatorar: ");
    scanf("%d", &num);
    
    printf("\n\t%d! = %d", num, fatorial(num));

    printf("\n\n");
    system("pause");
    return 0;
}
