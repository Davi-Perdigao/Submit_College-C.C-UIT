#include <stdio.h>
#include <stdlib.h>
#include <math.h>

void calc_esfera (float R, float *area, float *volume);
int main()
{

	float R,area,*parea,volume,*pvolume;
	
	printf("Valor do raio: ");
	scanf ("%f", &R);
	
	parea=&area;
	pvolume=&volume;
	
	calc_esfera(R,parea,pvolume);
	
	printf("Area = %f", area);
	printf("\nVolume = %f", volume);
	
}

void calc_esfera (float R, float *area, float *volume)
{
	float pi=3.14, tot;
	
	*area= 4 * pi * pow(R,2);
	*volume = (4 * pi * pow(R,3)/3);
	
}
