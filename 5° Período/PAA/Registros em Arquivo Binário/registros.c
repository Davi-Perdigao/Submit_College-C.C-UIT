// Desenvolver em java ou C um sistema que gerencie registros que devem ser armazenados em um arquivo binário.

// Deve-se definir o tema do trabalho, ou seja, o que serão os registros.

// Cada registro poderá ser de tamanhos fixos ou variáveis.

// O sistema deverá pelo menos: Inserir, listar, buscar e remover (pode ser feito por uma flag).

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

// Criando a estrutura que será utilizada
typedef struct jogo
{
	char ativo;
	char nome[30];
	char categoria[15];
	int anoLancamento;
	float preco;
} Jogo; // Define o nome

// Protótipo das funções
void escreverArquivo(char nomeArquivo[]);
void listar(char nomeArquivo[]);
void buscar(char nomeArquivo[], char nomeJogo[]);
void remover(char nomeArquivo[], char nomeJogo[]);

int main(void)
{
	setlocale(LC_ALL, "Portuguese");
	int opcao;
	char nomeArquivo[] = {"arquivo.bin"};

	do
	{
		printf("\nInforme uma opção:\n");
		printf("\n0 - Sair\n");
		printf("1 - Adicionar jogo\n");
		printf("2 - Listar jogos\n");
		printf("3 - Buscar jogo\n");
		printf("4 - Remover jogo\n");
		scanf("%d", &opcao);
		fflush(stdin);

		switch (opcao)
		{
		case 0:
			printf("\nFinalizando...\n");
			exit(0);
		case 1:
			escreverArquivo(nomeArquivo);
			break;
		case 2:
			listar(nomeArquivo);
			break;
		case 3:
			char nome[30];
			printf("\nInforme o nome:");
			gets(nome);
			buscar(nomeArquivo, nome);
			break;
		case 4:
			printf("Informe o nome:");
			gets(nome);
			remover(nomeArquivo, nome);
			break;
		default:
			printf("Por favor, informe uma opção válida!\n\n");
			break;
		}
	} while (opcao != 0);

	system("pause");
	return 0;
}

// Utilizado para escrever no arquivo binário o conteúdo da estrutura
void escreverArquivo(char nomeArquivo[])
{
	Jogo jogo;
	FILE *arquivo = fopen(nomeArquivo, "wb"); //Se não abriu, cria.
	int opcao = 0;
	// Recebendo os dados do usuário e armazenando na estrutura
	if (arquivo)
	{
		do
		{
			int ano;
			float preco;
			jogo.ativo = 'S';
			printf("\n\nInforme o nome:\n");
			scanf("%s", jogo.nome);
			fflush(stdin);

			printf("Informe o gênero:\n");
			scanf("%s", jogo.categoria);
			fflush(stdin);

			printf("Informe o ano de lançamento:\n");
			scanf("%d", &ano);

			if (ano <= 2022 && ano >= 1958)
			{ // Tennis for Two
				jogo.anoLancamento = ano;
			}
			else
			{
				jogo.anoLancamento = 2022;
			}

			printf("Informe o preço:\n");
			scanf("%f", &preco);

			if (preco >= 0)
			{
				jogo.preco = preco;
			}
			else
			{
				jogo.preco = 0;
			}

			// Escrevendo o conteúdo da struct no arquivo
			fwrite(&jogo, sizeof(Jogo), 1, arquivo);

			printf("Deseja adicionar mais jogos no momento?  [1 - SIM / 0 - NÃO (VOLTAR AO MENU)]\n");
			fflush(stdin);
			scanf("%d", &opcao);
		} while (opcao != 0);
	}
	else
	{
		printf("Erro ao abrir arquivo!");
	}
	// Fechando o arquivo utilizado
	fclose(arquivo);
}
// Listar todos os dados ativos do arquivo
void listar(char nomeArquivo[])
{
	Jogo jogo;
	FILE *arquivo = fopen(nomeArquivo, "rb");

	if (arquivo)
	{
		// Percorrendo o arquivo e armazenando o conteúdo em uma struct até que não haja mais dados
		while (fread(&jogo, sizeof(Jogo), 1, arquivo))
		{
			if (jogo.ativo == 'S')
			{
				printf("\nNome: %s\nCategoria: %s\nAno de lançamento: %d\nPreço: %.2f\n\n", jogo.nome, jogo.categoria, jogo.anoLancamento, jogo.preco);
			}
		}
		fclose(arquivo);
	}
	else
	{
		printf("Erro ao abrir arquivo!");
	}
}
// Buscar um elemento do arquivo usando o nome
void buscar(char nomeArquivo[], char nomeJogo[])
{
	Jogo jogo;
	FILE *arquivo = fopen(nomeArquivo, "rb");
	int i = 0;
	if (arquivo)
	{
		// Percorrendo o arquvivo e armazenando o conteúdo em uma struct até que não haja mais dados
		while (fread(&jogo, sizeof(Jogo), 1, arquivo))
		{
			// Comparando o nome do jogo armazenado na struct com o nome fornecido pelo usuário, caso ele esteja ativo
			if (strcmp(jogo.nome, nomeJogo) == 0 && jogo.ativo == 'S')
			{
				i = 1;
				break;
			}
		}
		if (i == 1)
		{ // Se o jogo foi encontrado
			printf("\nNome: %s\nCategoria: %s\nAno de lançamento: %d\nPreço: %.2f\n\n", jogo.nome, jogo.categoria, jogo.anoLancamento, jogo.preco);
		}
		else
		{ // Se o jogo não foi encontrado
			printf("\nO jogo não foi encontrado!\n\n");
		}
		fclose(arquivo);
	}
	else
	{
		printf("Erro ao abrir arquivo!");
	}
}
// Remover um elemento através da flag e utilizando o nome
void remover(char nomeArquivo[], char nomeJogo[])
{
	Jogo jogo;
	FILE *arquivo = fopen(nomeArquivo, "rb+");
	int i = 0;
	bool estado = false;

	if (arquivo)
	{
		while (fread(&jogo, sizeof(Jogo), 1, arquivo))
		{
			if (strcmp(jogo.nome, nomeJogo) == 0 && jogo.ativo == 'S')
			{
				jogo.ativo = 'N';
				// Apontando para o jogo que foi encontrado
				fseek(arquivo, i * sizeof(Jogo), SEEK_SET);
				// Substituindo na posicao a nova informação
				fwrite(&jogo, sizeof(Jogo), 1, arquivo);
				fclose(arquivo);
				estado = true;
				break;
			}
			i++;
		}
	}
	else
	{
		printf("Erro ao abrir arquivo!");
	}

	if (estado)
	{
		printf("\nO jogo foi removido!\n\n");
	}
	else
	{
		printf("\nO jogo não existe!\n\n");
	}
}