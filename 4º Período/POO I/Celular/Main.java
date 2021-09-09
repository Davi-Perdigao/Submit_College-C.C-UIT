package Celular;
import java.util.Scanner;

public class Main {
  static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Modelo do Celular: ");
    String modelo = s.nextLine();

    Celular celular = new Celular(modelo);
    
    menu(celular);
  }

  public static void menu(Celular celular) {
    int resposta = 1;

    do {
      celular.printCelular();

      System.out.println("\tMenu"
        + "\n1 - Ligar celular" 
        + "\n2 - Desligar celular" 
        + "\n3 - Carregar" 
        + "\n4 - Carregar completamente" 
        + "\n5 - Aumentar volume" 
        + "\n6 - Abaixar volume" 
        + "\n7 - Jogar" 
        + "\n0 - Sair do Menu" 
        + "\n Resposta: "  
      );
      
      resposta = s.nextInt();
      
      switch (resposta) {
        case 1: 
          celular.ligar();
          break;
        case 2:
          celular.desligar();
          break;
        case 3:
          celular.carregarBateria();
          break;
        case 4:
          celular.carregarCompletamente();
          break;
        case 5:
          celular.aumentarVolume();
          break;
        case 6:
          celular.diminuirVolume();
          break;
        case 7:
          celular.jogar();
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção errada");
          break;
      }
    } while (resposta != 0);
  }
}