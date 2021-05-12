//Tem que escolher um caractere de parada para a função strtok, pois o ENTER, que no C refere se ao parametro \n, não funciona muito bem nessa função(DA RUIM)

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>


typedef struct controle{
	char palavra[20];
	int contador;
} Registro;

int pesquisaSequencial(char chave[], Registro vetor[], int n);

int main(int argc, char *argv[])
{
	char linha[20];
	int n=1024;
	Registro vetor[n];
	if(strcmp(argv[2],"arquivo.txt")==0)
	{
		FILE *fp = fopen("arquivo.txt", "atr");
	    if(fp != NULL)
		{
	        while(!feof(fp))
			{
	            fgets(linha, 20, fp);
	            linha[strcspn(linha, "\n\r")] = '\0';
	            if(strlen(linha) > 0)
				{
	                char *aux = strtok(linha, " ");
	                while(aux != NULL)
					{
	                    //Executa a pesquisa da palavra
	                    int pos = pesquisaSequencial(aux, vetor, n);
	                    if(pos >= 0)
						{ //Palavra existe no vetor
	                        vetor[pos].contador++;
	                    } else 
							{//Inserir palara novo vetor
		                        strcpy(vetor[n].palavra, aux);
		                        vetor[n].contador = 1;
		                        n++;
	                    	}
	                    aux = strtok(NULL, " ");
	                }
	            }

        	}
        	
        }
        fclose(fp);
		printf("\n%d\n",vetor[0].contador);
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

int pesquisaSequencial(char chave[], Registro vetor[], int n)
{
    int resp = -1;
    for(int i = 0; i < n; i++)
	{
        if(strcasecmp(vetor[i].palavra, chave) == 0){
            resp = i; //guarda posiÃ§Ã£o do vetor
            i = n;
        }
    }
    return resp;
}
a
