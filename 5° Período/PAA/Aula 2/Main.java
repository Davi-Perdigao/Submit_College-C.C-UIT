/*Criar um código que busque sequencialmente o valor 78 em um vetor. Testar com vetores de tamanhos 50, 500 e 5000. 
Variar o teste com o vetor inicializado de forma crescente, decrescente e aleatório com raiz 3 e números entre 0 e 199.
Repetir os testes para busca binária. (menos aleatório).
Em todos testes mostrar a quantidade de comparações realizadas e tempo relógio gasto.*/

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Main {
    private static final String getQtdComparacoesSeq = null;
	private static final String getQtdComparacoesBinaria = null;
	private static final String tempoBuscaSequencial = null;
	private static final String tempoBuscaBinaria = null;

	public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Escolha o tamanho do Vetor: ");
            int tamanho = entrada.nextInt();
            Contagem cont = new Contagem(tamanho);
            cont.Crescente();

            Instant inicioBuscaBinaria;
            Instant inicioBuscaSeq;
            Instant fimBuscaBinaria;
            Instant fimBuscaSeq;

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
                inicioBuscaSeq = Instant.now();
                Contagem Crescente;
				Crescente.Sequencial(78);
                fimBuscaSeq = Instant.now();
                int getQtdComparacoesSeq = Crescente.getQtdComparacoes();
                Duration tempoBuscaSequencial = Duration.between(inicioBuscaSeq, fimBuscaSeq);
            } else if (opcao2 == 2) {
                inicioBuscaBinaria = Instant.now();
                Contagem Crescente;
				Crescente.BinariaCrescente(78);
                fimBuscaBinaria = Instant.now();
                int getQtdComparacoesBinaria = Crescente.getQtdComparacoes();
                Duration tempoBuscaBinaria = Duration.between(inicioBuscaBinaria, fimBuscaBinaria);
            } else if (opcao2 == 3){
                cont.BinariaDecrescente(opcao2);
            }

            System.out.println("Comparaçãoes: ");
		    System.out.println("Busca Sequencial: " + getQtdComparacoesSeq);
		    System.out.println("Busca Binaria: " + getQtdComparacoesBinaria);

            System.out.println("Execução (tempo): ");
		    System.out.println("Busca Sequencial: " + tempoBuscaSequencial);
            System.out.println("Busca Binaria: " + tempoBuscaBinaria);
        }
        
    
    }
}

/*public static void vetorCrescente(int tamanho) {
        Contagem vetorCrescente = new Contagem(tamanho);
        vetorCrescente.preencherCrescente();

        Instant inicioBuscaSeq;
        Instant fimBuscaSeq;
        Instant inicioBuscaBinaria;
        Instant fimBuscaBinaria;

        inicioBuscaSeq = Instant.now();
        vetorCrescente.buscaSeq(78);
        fimBuscaSeq = Instant.now();
        int getQtdComparacoesSeq = vetorCrescente.getQtdComparacoes();
        Duration tempoBuscaSeq = Duration.between(inicioBuscaSeq, fimBuscaSeq);

        inicioBuscaBinaria = Instant.now();
        vetorCrescente.buscaBinariaCrescente(78);
        fimBuscaBinaria = Instant.now();
        int getQtdComparacoesBinaria = vetorCrescente.getQtdComparacoes();
        Duration tempoBuscaBin = Duration.between(inicioBuscaBinaria, fimBuscaBinaria);

        System.out.println("Quantidade de comparaçãoes: ");
        System.out.println("Busca Sequencial: " + getQtdComparacoesSeq);
        System.out.println("Busca Binaria: " + getQtdComparacoesBinaria);

        System.out.println("Tempo de execução: ");
        System.out.println("Busca Sequencial: " + tempoBuscaSeq);
        System.out.println("Busca Binaria: " + tempoBuscaBin);
    }*/