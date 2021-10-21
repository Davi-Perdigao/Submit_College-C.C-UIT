import java.util.Scanner;

public class TestaComputador {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Computador[] computador = new Computador[3]; 

        for (int i=0; i<3; i++) {
            System.out.println("HD computador " + (i + 1) + " (GB): ");
            int tamanhoHD = input.nextInt();
            System.out.println("RAM computador " + (i + 1) + " (MB): ");
            int tamanhoRAM = input.nextInt();
            System.out.println("Numero de processadores computador " + (i + 1) + ": ");
            int numProcessadores = input.nextInt();
            input.nextLine();
            System.out.println("Fabricante computador " + (i + 1) + ": ");
            String fabricante = input.nextLine();

            computador[i] = new Computador(tamanhoHD, tamanhoRAM, numProcessadores, fabricante);
        }

        for (int i = 0; i < computador.length; i++) {
            if (computador[i].getTamanhoRAM() >Computador.RAMaceita) {
                System.out.println(computador[i].toString());
            }
        }

        int opcao = 0;
        System.out.println("\nSe algum computador não foi mostrado é porque ele possui menos que 512Mb de RAM. Porém, agora você pode escolher o Nº de qualquer notebook para interagir:");
        int num = input.nextInt() - 1;
        do {

            System.out.println("\n---MENU---");
            System.out.println(("1- Escolher outro computador"));
            System.out.println("2- Ligar");
            System.out.println("3- Desligar");
            System.out.println("4- Estado");
            System.out.println("5- Informaçoes");
            System.out.println("6- Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    for (int i = 0; i < computador.length; i++) {
                        System.out.println("Escolha um dos computadores: " + (i + 1) + "º" + computador[i].toString());
                    }
                    System.out.println("Qual deseja escolher? (Nº)");
                    num = input.nextInt() - 1;
                    break;
                case 2:
                    computador[num].ligarComputador();
                    break;
                case 3:
                    computador[num].desligarComputador();
                case 4:
                    System.out.println(computador[num].estadoComputador());
                    break;
                case 5:
                    System.out.println(computador[num].toString());
                    break;
                case 6:
                    System.out.println("Finalizando...");
                    break;
                default:
            }
        } while (opcao != 0);
        input.close();
    }
}