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
                    System.out.println("Você está sozinho? Escolha: 0-NÃO ou 1-SIM");
                    resposta = input.nextInt();

                    if (resposta == 0) {
                        System.out.println("Informe a quantidade de pessoas com você:");
                        quantidadePessoas = input.nextInt();
                        elevador.Entrar(quantidadePessoas);
                    } else {
                        elevador.Entrar();
                    }
                    break;
                case 2:
                    System.out.println("Alguém sairá com você? Escolha: 0-NÃO ou 1-SIM");
                    resposta = input.nextInt();

                    if (resposta == 1) {
                        System.out.println("Informe quantas pessoas irão sair:");
                        quantidadePessoas = input.nextInt();
                        elevador.Sair(quantidadePessoas);
                    } else {
                        elevador.Sair();
                    }
                    break;
                case 3:
                    System.out.println("Deseja escolher para qual andar subir? Escolha: 0-NÃO ou 1-SIM");
                    resposta = input.nextInt();

                    if (resposta == 1) {
                        System.out.println("Informe o andar:");
                        andar = input.nextInt();
                        elevador.Subir(andar);
                    } else {
                        elevador.Subir();
                    }
                    break;
                case 4:
                    System.out.println("Deseja escolher para qual andar descer? Escolha: 0-NÃO ou 1-SIM");
                    resposta = input.nextInt();

                    if (resposta == 1) {
                        System.out.println("Informe qual andar:");
                        andar = input.nextInt();
                        elevador.Descer(andar);
                    } else {
                        elevador.Descer();
                    }
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