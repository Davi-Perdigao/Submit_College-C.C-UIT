import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int capacidadeMaxima, opcao, quantidadePessoas, andar, resposta;
        Scanner input = new Scanner(System.in);
        System.out.println("Capacidade do Elevador:");
        capacidadeMaxima = input.nextInt();
        System.out.println("Total Andares: ");
        int totalAndares = input.nextInt();

        Elevador elevador = new Elevador(capacidadeMaxima, totalAndares);

        do {
            menu();
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a quantidade de pessoas que vão entrar:");
                    resposta = input.nextInt();
                    if (resposta<=capacidadeMaxima){
                    quantidadePessoas = input.nextInt();
                    elevador.Entrar(quantidadePessoas);
                    } else{
                        resposta=capacidadeMaxima;
                    }
                    break;
                case 2:
                    System.out.println("Informe a quantidade de pessoas que vão sair:");
                    quantidadePessoas = input.nextInt();
                    elevador.Sair(quantidadePessoas);
                    break;
                case 3:
                    System.out.println("Informe a quantidade de andares que deseja subir:");
                    andar = input.nextInt();
                    elevador.Subir(andar);
                    break;
                case 4:
                    System.out.println("Informe a quantidade de andares que deseja descer:");
                    andar = input.nextInt();
                    elevador.Descer(andar);
                break;
                case 5:
                    System.out.println(elevador.Infos());
                    break;
                case 6:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        } while (opcao != 6);
    }

    public static void menu() {
        System.out.println("Informe a opção: ");
        System.out.println("1 - Entrar");
        System.out.println("2 - Sair");
        System.out.println("3 - Subir");
        System.out.println("4 - Descer");
        System.out.println("5 - Exibir informações");
        System.out.println("6 - Finalizar tarefa");
    }
}