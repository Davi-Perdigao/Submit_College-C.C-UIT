#include <stdio.h>
#include <stdlib.h>

struct empresas{
	
	char nome[50];
	char area[50];
	int acao;
	
	}empresa[3];
int aux(struct empresas *p){
	
	int maior;
	maior=empresas[0];
	for(int i=0; i<3;i++);
		scanf("%s",(*p).nome);
		scanf("%s",(*p).area);
		scanf("%i",(*p).acao);
		
		if ((*p).acao>maior){
			maior=(*p).acao;
			
		}
		for(int i=0;i<3;i++){
			printf("%s", (*p).nome);
		}
		print("Maior Acao = %i",acao);
}
int main void()
{
	struct empresas p1;
	aux(&p1);
	
}
