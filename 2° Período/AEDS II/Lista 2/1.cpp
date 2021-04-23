/*
    Implemente uma função que calcule a área da superfície e o volume de uma 
    esfera de raio R. Essa função deve obedecer ao protótipo:
            void calc_esfera (float R, float *area, float *volume)
    O resultado deve ser apresentado na função principal
    A área da superfície e o volume são dados, respectivamente, por:
    A = 4 * p * R2
    V = 4/3 * p * R3
*/

#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#define pi 3.14

void calc_esfera (float R, float *area, float *volume){
    *area = 4 * pi * pow(R,2);
    *volume = 4/3 * pi * pow(R,3);
}

int main () {
    float R, area, volume;

    printf("Digite o raio da esfera: ");
    scanf("%f", &R);

    calc_esfera(R, &area, &volume);

    printf("Area: %.2f\nVolume: %.2f\n\n", area, volume);

    system("pause");
    return 0;
}
