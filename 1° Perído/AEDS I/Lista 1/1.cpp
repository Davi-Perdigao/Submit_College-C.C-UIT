/*
Um problema típico em ciência da computação consiste em converter um número da sua forma decimal
para a forma binária. Por exemplo, o número 12 tem a sua representação binária igual a 1100. A forma mais
simples de fazer isso é dividir o número sucessivamente por 2, onde o resto da i-ésima divisão vai ser o dígito
i do número binário (da direita para a esquerda). Por exemplo: 12 / 2 = 6, resto 0 (1º dígito da direita para
esquerda), 6 / 2 = 3, resto 0 (2º dígito da direita para esquerda), 3 / 2 = 1 resto 1 (3º dígito da direita para
esquerda), 1 / 2 = 0 resto 1 (4º dígito da direita para esquerda). Resultado: 12 = 1100
*/

#include <stdlib.h>
#include <stdio.h>
#include <stack>
using namespace std;


void binario(int dec){
    int bin[50], i = 0;
    while(dec > 0){
        bin[i] = dec%2;
        i++;
        dec/=2;
    }
    
    for(i-=1 ; i>=0 ; i--){
        printf("%d", bin[i]);
    }
}


int main(){
    int decimal = 5;

    printf("Digite o decimal: ");
    scanf("%d", &decimal);

    printf("%d em binario e: ", decimal);
    binario(decimal);

    printf("\n");
    system("pause");
    return 0;
}
