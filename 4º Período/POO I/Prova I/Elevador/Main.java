import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.println("Capacidade do Elevador:");
        int capacidadeElevador = input.nextInt();
        System.out.println("Total Andares: ");
        int totalAndares = input.nextInt();

        Elevador elevador = new Elevador(capacidadeElevador, totalAndares);


        do{
            menu();
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                elevador.Entrar();
                    break;
                case 2:
                elevador.Sair();
                    break;
                case 3:
                elevador.Subir();
                    break;
                case 4:
                elevador.Descer();
                    break; 
                case 5:
                    System.out.println(elevador.Infos());
                    break;
                case 6:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;    
            }
        } while(opcao!=6);
    }

    public static void menu(){
        System.out.println("Informe a opção: ");
        System.out.println("1 - Entrar");
        System.out.println("2 - Sair");
        System.out.println("3 - Subir");
        System.out.println("4 - Descer");
        System.out.println("5 - Exibir informações");
        System.out.println("6 - Finalizar tarefa");
    }
}