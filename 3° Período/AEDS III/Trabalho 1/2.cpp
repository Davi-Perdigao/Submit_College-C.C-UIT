#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{

	char prod[21];

} lista;

void insertion(lista *compras, unsigned short tam);

int main (void)
{

	unsigned short casos, i=0, j;
	lista compras[1010];
	char itens[20010], *item1;
	printf("\nInforme a quantidade de listas: ");
	scanf("%hu", &casos);
	
	while (casos!=0)
	{
		printf("\nPor favor, digite os produtos: ");
		scanf(" %[^\n]", itens); // Definindo um token para quebrar a string em substrings;
		printf("\n");
		item1 = strtok(itens, " "); // Devolvendo um ponteiro para a antiga substring ;
		strcpy(compras[i++].prod, item1); // Laço que faz o processo para o resto da string;
		casos--;
		do
		{
			item1 = strtok('\0', " ");
			if (item1 == NULL)
			{
					break;
			}
			strcpy(compras[i].prod, item1);

			i++;
		} while (item1);

		insertion(compras, i); // Ordena a struct;

		for (j = 0; j < i; j++)
		{ // Imprime os itens que são diferentes uns dos outros;
			if (strcmp(compras[j].prod, compras[j - 1].prod) != 0)
			{
				if (j != 0 && j != i)
					printf(" ");

				printf("%s\n", compras[j].prod);
			}
		}
		printf("\n");
		memset(compras, 0, sizeof(compras));
		memset(itens, 0, sizeof(itens));
	}
	system("pause");
	return 0;
}

void insertion(lista *compras, unsigned short tam)
{ // Função para ordenar;

	short i = 1, j;
	lista cent;

	while (i < tam)
	{
		j = i - 1;
		cent = compras[i];

		while (j >= 0 && strcmp(compras[j].prod, cent.prod) > 0)
		{
			compras[j + 1] = compras[j];
			j--;
		}
		compras[j + 1] = cent;
		i++;
	}
}
