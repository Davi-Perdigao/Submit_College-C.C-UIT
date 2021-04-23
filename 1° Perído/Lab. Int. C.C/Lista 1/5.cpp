/*
    O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                    Até 5 Kg            Acima de 5 Kg
    File Duplo      R$ 4,90 por Kg      R$ 5,80 por Kg
    Alcatra         R$ 5,90 por Kg      R$ 6,80 por Kg
    Picanha         R$ 6,90 por Kg      R$ 7,80 por Kg
    Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total a compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar
*/

#include<stdio.h>
#include<stdlib.h>


int main () {
    float peso = 0, valor = 0, desconto = 0, ValorFinal = 0, menor5[3] = {4.9,5.9,6.9}, maior5[3]={5.8,6.8,6.8};
    int carne = 0, pagamento = 0;
    char *tipoCarne;

    printf("==========+ HIPERMERCADO TABAJARA +==========\n");

    do{
        printf("\nQual tipo de carne: \n File Duplo: [1]\n Alcantra: [2]\n Picanha: [3]\nR.: ");
        scanf("%d", &carne);
    } while(not (carne < 3 && carne > 0));

    do {
         printf("\nDigite o peso em kg: ");
         scanf("%f", &peso);
    } while (peso < 1);
    
    if(peso <= 5){
        valor = peso*menor5[carne - 1];
    }

    else{
        valor = peso*maior5[carne - 1];
    }

    printf("\nForma de Pagamento\nCartao Tabajara (5%% de desc): [1]\nDinheiro / Cartao comum: [2]\nR.: ");
    scanf("%d", &pagamento);

    if(pagamento == 1) { 
        ValorFinal = valor * 0.95; 
        desconto = valor * 0.05;
    }

    else{
        desconto = 0;
        ValorFinal = valor;
    }

    for(int i=0;i<3;i++){
        
    }
    if(carne=1){char tpCarne[20] = {"File Duplo"}; tipoCarne = tpCarne; gets(tpCarne);}
    if(carne=2){char tpCarne[20] = {"Alcantra"}; tipoCarne = tpCarne;}
    if(carne=3){char tpCarne[20] = {"File"}; tipoCarne = tpCarne;}
;
    system("cls");

    printf("\n+==========+ CUPOM FISCAL +==========+\n");
    printf("Tipo de Carne: %s", tipoCarne);
    printf("\nQuantidade: R$%.2fkg", peso);
    printf("\n----------------------------------------------------------------\n");
    printf("Valor total: R$%.2f", valor);
    printf("     Forma de Pagamento: %s", pagamento==1?"Cartao Tabajara":"Cartao Comum ou Dinheiro");
    printf("      Desconto: R$%.2f", desconto);
    printf("\n----------------------------------------------------------------\n");
    printf("Valor a pagar: R$%.2f", ValorFinal);
    printf("\n+==============================================================+\n                      Volte Sempre! :)");

    printf("\n\n\n");
    system("pause");
    return 0; 
}
