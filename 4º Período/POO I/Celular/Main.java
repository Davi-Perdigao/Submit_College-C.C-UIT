package Celular;
import java.util.Scanner;

public class Main {

  public static void main(String[] args){

    int nivelBateria, nivelSom, opcao, som;
    String modelo;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o modelo do celular:");
    modelo = entrada.nextLine();
    System.out.println("Informe o nível da bateria:");
    nivelBateria = entrada.nextInt();
    System.out.println("Informe o nível do som:");
    nivelSom= entrada.nextInt();

    Celular modelX = new Celular(modelo, nivelBateria, nivelSom);

    do{
        System.out.println("Menu:"); /*O usuário pode carregar o celular, aumentar 
                                                      e diminuir o som e jogar.
                                                    */  
        System.out.println("1 - Ligar");
        System.out.println("2 - Carregar");
        System.out.println("3 - Jogar");
        System.out.println("4 - Aumentar som");
        System.out.println("5 - Diminuir som");
        System.out.println("0 - Sair");
        
        opcao = entrada.nextInt();

        switch(opcao){
            case 1:
                System.out.println(modelX.ligar());
                break;
            case 2:
                modelX.carregarBateria();
                System.out.println("A bateria está em " + modelX.getNivelBateria() + "%");
                break;
            case 3:
                if(modelX.getNivelBateria()>0 && modelX.isLigado()){
                    int numero;
                    System.out.println("O jogo é um Par OU Impar");   
                    System.out.print("Escolha um número: ");
                    numero = entrada.nextInt();

                    System.out.println(modelX.jogar(numero));
                    System.out.println(modelX.getNivelBateria());
                } else{
                    System.out.println("Não foi possível jogar.");
                }
                break;
            case 4:
                
                System.out.println("Informe o nível de volume que deseja aumentar:");
                som = entrada.nextInt();
                System.out.println(modelX.aumentarVolume(som));
                break;
            case 5:
                System.out.println("Informe o nível de volume que deseja diminuir:");
                som = entrada.nextInt();
                System.out.println(modelX.diminuirVolume(som));

            case 0:
                System.out.println("Finalizando Menu...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    } while (opcao != 0);
    entrada.close();
}
}