#include<stdio.h>
int main(void)
{
	float valinvest, vfinal, lucro, lucropercent;
	
	printf("\nInforme o valor que voce investiu\n");
	scanf("%f", &valinvest);
	printf("\nInforme quanto voce sacou\n");
	scanf("%f",&vfinal);
	
	lucro=vfinal-valinvest;
	lucropercent=lucro/10;
	
	printf("Voce investiu: R$%.2f \t", valinvest);
	printf("Voce recebeu: R$%.2f \t", vfinal);
	printf("O seu lucro em reais: R$%.2f \t", lucro);
	printf("O seu lucro percentual: %.2f \t", lucropercent);
	
   
     
    return 0;
	
}
