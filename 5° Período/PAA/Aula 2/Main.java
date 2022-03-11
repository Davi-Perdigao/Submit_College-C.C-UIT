/*Criar um código que busque sequencialmente o valor 78 em um vetor. Testar com vetores de tamanhos 50, 500 e 5000. 
Variar o teste com o vetor inicializado de forma crescente, decrescente e aleatório com raiz 3 e números entre 0 e 199.
Repetir os testes para busca binária. (menos aleatório).
Em todos testes mostrar a quantidade de comparações realizadas e tempo relógio gasto.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Escolha o tamanho do Vetor: ");
            int tamanho = entrada.nextInt();
            Contagem cont = new Contagem(tamanho);

            System.out.println("\n---PREENCHIMENTO DO VETOR---\n");
            System.out.println("1 - Crescente");
            System.out.println("2 - Decrescente");
            System.out.println("3 - Aleatoria\n");

            int opcao = entrada.nextInt();

            if (opcao == 1) {
                cont.Crescente();
            } else if (opcao == 2) {
                cont.Decrescente();
            } else if (opcao == 3) {
                cont.Aleatorio(3);
            }

            System.out.println("\n---TIPO DA BUSCA---\n");
            System.out.println("1 - Sequencial");
            System.out.println("2 - Binaria Crescente");
            System.out.println("3 - Binaria Decrescente");

            int opcao2 = entrada.nextInt();

            if (opcao2 == 1) {
                cont.Sequencial();
            } else if (opcao2 == 2) {
                cont.BinariaCrescente(opcao2);
            } else if (opcao2 == 3){
                cont.BinariaDecrescente(opcao2);
            }
        }
        
    }
}
