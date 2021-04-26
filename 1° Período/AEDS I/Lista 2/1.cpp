#include <stdio.h>
#include <stdlib.h>

int recurs(int num)
{
	int n;
	if (num/2 !=0)
	{
		n=num/2;
		recurs(n);
		printf("%i",num%2);
	}
	else
	{
		printf("%i",num%2);
	}
}

int main()
{
	int num;
	
	printf("Entre com um numero, e logo em seguida veja sua representacao binaria: ");
	scanf ("%i", &num);
	
	recurs(num);
}
