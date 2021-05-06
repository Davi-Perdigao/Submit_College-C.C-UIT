//Sem utilização de struct, sujeito a mudanças
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*
typedef struct controle{
	char texto[1024];
	int contador;
} arquivo;*/

int main(int argc, char *argv[])
{
	//arquivo *pArquivo, file;
	char texto[1024];
	char *armazenarTexto;
	//pArquivo=vetArquivo;
	
	
	if(strcmp(argv[2],"arquivo.txt")==0)
	{
		FILE *arquivo=fopen("arquivo.txt","r");
		printf("Arquivo selecionado: arquivo.txt\n");
		//Armazenar o texto do arquivo na struct
		
		while(fgets(texto,1024,arquivo)!=NULL)
		{
			//printf("%s",file.texto);
			printf("\n\n");	
		}
		//Criar substrings para comparação
		
		armazenarTexto=strtok(texto,",");
		while(armazenarTexto!=NULL)
		{
			printf("%s\n",armazenarTexto);
			armazenarTexto=strtok(NULL,",");
		}
	

	} else
		{
			printf("Não foi selecionado nenhum arquivo.\n");
		}
	//Selecionar opção
	if(strcmp(argv[1],"seq")==0)
	{
		printf("Escolheu pesquisa Sequencial.\n");
		//pesquisaSequencial();
	} else if(strcmp(argv[1],"binaria")==0)
		{
			printf("Escolheu pesquisa binaria");
			//pesquisaBinaria();
		} else if(strcmp(argv[1],"arvore")==0)
			{
				printf("Escolheu arvore binaria");
				//arvoreBinaria();
			} else if(strcmp(argv[1],"hash")==0)
				{
					printf("Escolheu Hash");
					//tabelaHash();
				}
	printf("\n\n");
	system("pause");
	return 0;
}
/*
void pesquisaSequencial(FILE *arquivo){
    int resp = false;
    int count = 0;
    for(int i=0; i<TAM; i++){
        count++;
        if(vetor[i] == chave){
            resp = true;
            i = TAM;
        }
    }
    printf("(count %i)\n", count);
    return resp;
}*/