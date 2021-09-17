import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome da mochila: ");
        String nome = input.nextLine();
        System.out.println("Digite a quantidade maxima de itens: ");
        int quantidadeItensMaxima = input.nextInt();
        System.out.println("Digite o peso maximo da mochila: ");
        double pesoMaximo  = input.nextDouble();

        Mochila mochila = new Mochila(nome, quantidadeItensMaxima, pesoMaximo);

        System.out.println(mochila);

        int opcao=0;
        do{
            System.out.println("Escolha uma opção:");
            System.out.println("0-Sair");
            System.out.println("1-Inserir");
            System.out.println("2-Imprimir Detalhe");
            opcao=input.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Finalizando tarefa...");
                    break;
                case 1:
                    System.out.println("Informe o peso do item:");
                    mochila.inserir(input.nextDouble());
                    break;
                case 2:
                    System.out.println(mochila.imprimeDetalhe());
                    break;
                default:
                    System.out.println("Opção Inválida!");
                 

            }
        }while(opcao!=0);

        input.close();
    }
}

