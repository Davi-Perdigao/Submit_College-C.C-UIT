#include <stdio.h>
#include <stdlib.h>

int aux(int *pa, int *pb);
int main()
{
	int a,b,*pa,*pb;
	
	printf("Numero 1: ");
	scanf("%i", &a);
	
	printf("Numero 2: ");
	scanf("%i", &b);
	
	pa=&a;
	pb=&b;
	
	aux(pa,pb);
	
	printf("A = %i",a);
	printf("\nB= %i",b);
	
}

int aux(int *pa, int *pb)
{
	
	int som,mult;
	
	som=*pa + *pb;
	mult=*pa * *pb;
	
	*pa=som;
	*pb=mult;
	
}
