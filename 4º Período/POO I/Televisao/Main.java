import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a marca da Televisão:");
        String marca = input.nextLine();
        System.out.println("Informe a quantidade máxima de canais:");
        int quantidadeCanais = input.nextInt();
        System.out.println("Informe o volume máximo da Televisão:");
        int volumeMaximo= input.nextInt();

        Televisao televisao = new Televisao(marca, quantidadeCanais, volumeMaximo);

        System.out.println(televisao);

        int opcao=0;
        do{
            System.out.println("Digite a opção deseja:");
            System.out.println("0 - Sair");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Informar canal desejado");
            System.out.println("4 - Mudar Canal (cima)");
            System.out.println("5 - Mudar Canal (baixo)");
            System.out.println("6 - Aumentar Volume ");
            System.out.println("7 - Abaixar Volume");
            System.out.println("8 - Imprimir Informações");
            opcao=input.nextInt();

            switch(opcao){
                case 0:
                    System.out.println("Muito Obrigado ate Mais.");
                    break;
                case 1:
                    televisao.ligar();
                    break;
                case 2:
                    televisao.desligar();
                    break;
                case 3:
                    System.out.println("Informe o canal Desejado:");
                    televisao.setCanal(input.nextInt());
                    break;
                case 4:
                    televisao.aumentaCanal();
                    break;
                case 5:
                    televisao.abaixaCanal();;
                    break;
                case 6:
                    televisao.aumentarVolume();
                    break;
                case 7:
                    televisao.abaixarVolume();
                    break;
                case 8:
                    System.out.println(televisao.detalhe());
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }        
        }while(opcao!=0);
        
    }
}