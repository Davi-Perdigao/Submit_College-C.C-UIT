/*
    Faça um programa de entrevista de emprego que pega o sexo, idade e formação escolar (1 para fundamental, 2 para médio e 3 para superior) e determina o cargo a que a pessoa pode se candidatar, de acordo com a tabela: 
            Sexo    Idade   Escolaridade    Cargo
            F       >25     médio           Recepcionista
            M       >40     fundamental     Servente
            F ou M  <30     Superior        Auxiliar de RH
    Com qualquer outra opção deve-se imprimir "não há posição disponível". Ao final de cada entrevista deve-se perguntar se o  usuário ainda deseja continuar, caso a resposta seja N o
programa deve finalizar
*/

#include<stdio.h>
#include<stdlib.h>
#include<locale.h>

int main(){
    setlocale(LC_ALL, "");
    
    char sexo, resp;
    int idade, esc;
    
    // Laço continuo ate a interrupção do usuário
    do {
        system("cls");
        
        //entrada de dados
        printf("Qual seu sexo [F - Feminino / M - Masculino]\nR.: ");
        scanf("%s", &sexo);

        printf("Qual sua idade: ");
        scanf("%d", &idade);

        printf("Qual sua escolaridade\n\t1 - Ensino Fundamental\n\t2 - Ensino Médio\n\t3 - Ensino Superior\nR.: ");
        scanf("%d", &esc);

        // Verificação condicional por vaga
        if (sexo == 'f' && idade >= 25 && esc == 2){
            printf("\nVaga Disponível: Recepcionista");
        }

        else if (sexo == 'm' && idade >= 40 && esc == 1){
            printf("\nVaga Disponível: Servente");
        }

        else if (idade <= 30 && esc == 3){
            printf("\nVaga Disponível: Auxiliar de RH");
        }

        else {
            printf("Não há posição disponível");
        }

        // Verifica se o usuário quer continuar o laço
        printf("\n\nDeseja continuar? [s - sim / n - não]: ");
        scanf("%s", &resp);


    } while (resp == 's');

    printf("\n\n");
    system("pause");
    return 0;
}
