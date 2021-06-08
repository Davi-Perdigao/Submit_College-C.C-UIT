#include <stdio.h> //Quest�o 2 - Prova AEDS III
#include <stdlib.h>

typedef struct no { // estrututa n�
    int conteudo;
    struct no *esquerda, *direita;
} No;

typedef struct { // estrutura da �rvore 
    No *raiz;
    int tam;
} ArvB; //ponteiro para o n�

No* inserir(No *raiz, int valor) { //inserindo valores na arvore
    if(raiz == NULL) {
        No *novo = (No*)malloc(sizeof(No));
        novo->conteudo = valor;
        novo->esquerda = NULL;
        novo->direita = NULL;
        return novo;
    } else {
        if(valor < raiz->conteudo) //definindo caminhamento 
            raiz->esquerda = inserir(raiz->esquerda, valor);
        if(valor > raiz->conteudo)
            raiz->direita = inserir(raiz->direita, valor);
        return raiz;
    }
}

int buscar(No *raiz, int chave) { //busca por valores na arvore
    if(raiz == NULL) {
        return 0;
    } else {
        if(raiz->conteudo == chave)
            return 1;
        else {
            if(chave < raiz->conteudo)
                return buscar(raiz->esquerda, chave);
            else
                return buscar(raiz->direita, chave);
        }
    }
}

void imprimir(No *raiz,int valor) { //Imprimir numeros menores do que o que o usuario buscar
    if(raiz != NULL) {
    		imprimir(raiz->esquerda,valor);
    		if(valor > raiz->conteudo){
    			printf("%d ", raiz->conteudo,valor);
			}    	
        	imprimir(raiz->direita,valor);
        
    }
}

int main() {
    int op, valor;
    ArvB arv;
    arv.raiz = NULL;
    No *raiz = NULL;

    do {
        printf("\n0 - Sair\n1 - Inserir\n2 - Buscar\n\n"); //MENU
        scanf("%d", &op);

        switch(op) {
        case 0:
            break;
        case 1:
            printf("\nInsira um valor: ");
            scanf("%d", &valor);
            raiz = inserir(raiz, valor);// nao precisa da ArvB
            							//inserir(&arv, valor)
            break;
        case 2:
            printf("\nQual valor deseja buscar? Lembrando que exibiremos os valores inseridos MENOR que ele: ");
            scanf("%d", &valor);
            imprimir(raiz,valor);
            printf("Resultado: %d\n", buscar(raiz, valor));
            break;
        
        default:
            printf("\nOpcao Invalida\n");
        }
    } while(op != 0);
}
