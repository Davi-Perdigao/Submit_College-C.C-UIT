/*Criar um código que busque sequencialmente o valor 78 em um vetor. Testar com vetores de tamanhos 50, 500 e 5000. 
Variar o teste com o vetor inicializado de forma crescente, decrescente e aleatório com raiz 3 e números entre 0 e 199.
Repetir os testes para busca binária. (menos aleatório).
Em todos testes mostrar a quantidade de comparações realizadas e tempo relógio gasto.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho = entrada.nextInt();
        Contagem cont = new Contagem(tamanho);
    }

    System.out.println("Como deseja preencher seu vetor?\n");
    System.out.println("Digite 1 para ordernar de forma Crescente\n");
    System.out.println("Digite 2 para ordernar de forma Decrescente\n");
    System.out.println("Digite 3 para ordernar de forma Aleatoria\n");
    int opcao = entrada.nextInt();

    if (opcao == 1) {
        cont.Crescente();
    } else if (opcao == 2) {
        cont.Descrescente();
    } else if (opcao == 3) {
        cont.Aleatorio(3);
    }
       
    System.out.println("Selecione o tipo de busca");
    System.out.println("Digite 1 para Sequencial");
    System.out.println("Digite 2 para Binaria");
    int opcao2 = entrada.nextInt();

    if(opcao2 == 1){
        cont.buscaSequencial();
    }else if(opcao2 == 2){
        cont.buscaBinaria();
    }
        entrada.close();
    }
    
}