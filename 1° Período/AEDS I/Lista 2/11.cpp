#include<stdio.h>
int main(void)
{
	int qtd, valp;
	float val, desc, total;
	
	printf("\nInforme quantidade de pneus que voce deseja\n");
	scanf("%i", &qtd);
	printf("\nInforme o valor do pneu\n");
	scanf("%f",&val);
	printf ("\nInforme o percentual de desconto\n");
	scanf("%f",&desc);
	printf("\nInforme a quantidade de parcelas\n");
	scanf("%i",&valp);
	
	total=((val*qtd)*(1-desc/100))/valp;
	
	printf("Voce comprou %i pneus no valor de %.2f \n", qtd, val);
	printf("O seu desconto foi de %.2f \n", desc);
	printf("Voce pagara %i parcelas de %.2f \n", valp, total);
	
   
     
    return 0;
	
}
