#include <stdio.h>
#include <stdlib.h>

int soma (int numeros[], int quant)
{
	int soma,i;
	
	for (i=0;i<quant;i++)
	{
	  soma=soma+numeros[i];
	}
	
	return (soma);
}

int med(int numeros[], int quant)
{
	int med, tot,i;
	
	for (i=0; i<quant; i++)
	{
	  tot=tot+numeros[i];
	}
	med=tot/quant;
	
	return (med);
	
}

int maior(int numeros[], int quant)
{
	int maior,i;
	
	maior=numeros[0];
	for (i=0;i<quant;i++)
	{
		if (numeros[i]>maior)
		{
		  maior=numeros[i];
		}
	}
	
	return(maior);
}

int menor (int numeros[], int quant)
{
	int menor,i;
	
	menor=numeros[8];
	for(i=0;i<quant;i++)
	{
		if(numeros[i]<menor)
		{
		  menor=numeros[i];
		}
	}
	
	return(menor);
}

int main()
{
	int quant;
	
	printf("Quantidade de Numeros: ");
	scanf("%i", &quant);
	
	int numeros[quant],i;
	
	for(i=0;i<quant;i++)
	{
		printf("Numero %i: ",i+1);
		scanf("%i",&numeros[i]);
	}
	
	printf("Soma = %i   ",soma(numeros,quant));
	printf("Media = %i   ",med(numeros,quant));
	printf("Maior = %i   ",maior(numeros,quant));
	printf("Menor = %i   ",menor(numeros,quant));
}
