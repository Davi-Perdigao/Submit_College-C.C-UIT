#include<stdlib.h>
#include<stdio.h>

typedef struct node {
    int num;
    struct node *prox;
}Node;

typedef struct node {
    int size;
    Node* head;
}List;

// Recebe a quantidade de Bytes que esse nó ocupa,aloca essaa memória e retorna um ponteiro para esse nó.
Node* createNode(){
    Node *novo  = (Node*)malloc(sizeof(Node));
    return novo;
}

// Novo nó que aponta para o numero, e recebe o valor contido no Data
Node* insertNodeOnHead(Node* List, int data){
    Node *newNode = createNode();
    newNode->num = data;

    // Caso a lista estiver vazia inserimos o novo nó
    if(List == NULL) {  
        List = newNode;
        newNode->prox = NULL;
    }
    // Caso não esteja, inserimos um novo nó no começo e apontamos o proximo para NULL
    else {
        newNode->prox = List;
        List = newNode;
    }
    return List;
}

// Imprime a lista enquanto ela não for nula. Utiizamos uma variavél auxliar que recebe os valores da lista, porém não os altera!
void printList (Node* List){
    Node *aux = List;

    while(aux != NULL){
        printf("%d ", aux->num);
        aux = aux->prox;
    }
}

int indexOf( List* list, Node* node) {
    if (node != NULL) {
        Node* pointer = list->head;

        int index = 0;
        while (pointer != node && pointer != NULL){
            pointer = pointer->prox;
            index++;
        }
        if (pointer != NULL) return index;
    }

    printf("No nao pertence lista");
    return -1;
}

Node* insertNodeOnEnd(Node* List, int data){
    Node *node = createNode();
    node->num = data;

    if(List = NULL){
        node->prox = NULL;
        List = node;
    } 
    else {
        Node* aux = List;
        while (aux->prox != NULL){
            aux = aux->prox;
        }
        node->prox = NULL;
        aux->prox = node;
    }
    return List;
}

int main () {
    Node *List = NULL;


    List = insertNodeOnHead(List, 10);
    List = insertNodeOnHead(List, 20);
    //List = insertNodeOnHead(List, 30);
    printList(List);


    printf("\n\n");
    system("pause");
    return 0;
}
