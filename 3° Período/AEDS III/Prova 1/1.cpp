#include <stdio.h> //Questão 1 - Prova AEDS III
#include <stdlib.h>
#include <locale.h>
#define TAM5

void addAluno(int ciu[], int tam);
void sequencial(int ciu[], int tam, int chave);

int main(void){
	setlocale(LC_ALL, "Portuguese");
	int opcao,chave, tam, codigo[tam]; //Declarando variáveis 
	do{
		printf ("\n\t\tCADASTRO DE ALUNOS UIT:\n"); //Elaboração de um "MENU"
		printf("\n\tSelecione uma das seguintes opções:\n\n");
		printf("\t1- Incluir novo aluno;\n");
		printf("\t2- Buscar aluno;\n");
		printf("\t3- Finalizar.\n");
		scanf("%d",&opcao);
		if(opcao==1) //Caso selecione a opção 1, escolher quantos alunos serão adicionados, e aloca-los em "tam"
		{
			printf("\nInforme quantos alunos serão cadastrados: ");
			scanf("%d",&tam);
			addAluno(codigo,tam);
		}
		if(opcao==2) //Caso selecione a opção 2, informar matricula do aluno, essa será a "chave"
		{
			printf("\nInforme a matrícula (CIU): ");
			scanf("%d",&chave);
			sequencial(codigo,tam,chave);		
		}
	} while(opcao!=3); //Caso escolha a opção 3, o programa finaliza
	
	system("pause");
	return 0; }
	
void addAluno(int codigo[], int tam) { //Para adicionar um aluno e aloca-lo em "codigo"
	printf("\n");
	for(int i=0;i<tam;i++)
		{
			printf("\tInforme a matricula (CIU): ");
			scanf("%d",&codigo[i]);
		}
}
void sequencial(int codigo[], int tam, int chave) { //Pesquisa sequencial para buscar um aluno
	int pos=0,i;
	for(i=0;i<tam;i++) {
		pos++;
		if(codigo[i]==chave)
		{
			printf("\n\tAluno encontrado com sucesso.");
			printf("\n\tOrdem: %i.",pos);
			i=tam;
		}
		else if(tam-1==i) //Caso a pesquisa não apresente resultado
			{
				printf("\n\tAluno não encontrado, cadastre a matrícula (CIU) e efetua novamente a pesquisa.");
			}
		printf("\n\n\n");
	}
}
