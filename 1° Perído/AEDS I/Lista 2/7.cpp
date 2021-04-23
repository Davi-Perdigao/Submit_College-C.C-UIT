#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct Data
{
	int dia;
	int mes;
	int ano;
}Data;

struct perfil
{
	char nome[255];
	float altura;
	Data nascimento;
};

int main() 
{
	setlocale(LC_ALL, "Portuguese");
	
	int i;
	int pesquisa;
	struct perfil perfil1;
	
	perfil1.nome;
	perfil1.altura;
	perfil1.nascimento.dia;
	perfil1.nascimento.mes;
	perfil1.nascimento.ano;
	
	printf("Altura para pesquisa;");
	scanf("%f",&pesquisa);
	
	for(i=0;i<10;i++)
	{
	    printf("Informe seu nome:");
	    scanf("%s", &perfil1.nome);
	
	    printf("Informe sua altura:");
	    scanf("%f", &perfil1.altura);
	
	    printf("Informe o dia de nascimento:");
	    scanf("%d", &perfil1.nascimento.dia);
	
	    printf("Informe o mes de nascimento:");
	    scanf("%d", &perfil1.nascimento.mes);
	
	    printf("Informe o ano de nascimento:");
	    scanf("%d", &perfil1.nascimento.ano);
	}
	printf("Altura para pesquisa;");
	scanf("%f",&pesquisa);
	
	for(i=0;i<10;i++)
	{
	    printf("Nome: %s\n ",perfil1.nome);
	    if(perfil1.altura == pesquisa)
	    {
	        printf("Altura: %f\n ",perfil1.altura);
		}
		else
		{
	        printf("Data de nascimento: %d\n ",perfil1.nascimento.dia);
	        printf("Data de nascimento: %d\n ",perfil1.nascimento.mes);
	        printf("Data de nascimento: %d\n ",perfil1.nascimento.ano);
		}
	}
	                                              
	return 0;
}
