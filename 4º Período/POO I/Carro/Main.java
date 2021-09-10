import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

  public static void main(String[] args) {
    
    /*No método main, receba as informações iniciais do 
    carro e crie um menu para o usuário interagir com o carro 
    como...acelerar, frear, ligar, abastecer, etc...
    */

    System.out.println("Modelo do Carro: ");
    String modeloCarro = s.nextLine();

    System.out.println("Capacidade do tanque (L): ");
    Double capacidadeTanque = s.nextDouble();

    System.out.println("Velocidade máxima permitida (Km): ");
    Double velociadeMaxima = s.nextDouble();

    System.out.println("Potência do motor (CV): ");
    Double potenciaCarro = s.nextDouble();

    Carro carroX = new Carro(modeloCarro, capacidadeTanque, velociadeMaxima, potenciaCarro);
    
    menu(carroX);
  }  

  public static void menu(Carro carro) {

    /*Lembre-se que o carro só anda ligado e com gasolina, 
    que ele precisa abastecer, etc.
    */

    int opcao = 1;

    do {
      carro.printCarro();

      System.out.println("\tMenu"
        + "\n1 - Ligar carro" 
        + "\n2 - Desligar carro" 
        + "\n3 - Abastecer" 
        + "\n4 - Acelerar" 
        + "\n5 - Frear" 
        + "\n0 - Sair do Menu" 
        + "\n Resposta: "  
      );
      
      opcao = s.nextInt();
      
      switch (opcao) {
        case 1: 
          carro.ligar();
          break;
        case 2:
          carro.desligar();
          break;
        case 3:
          System.out.println("Quanto de combustivel: ");
          carro.abastecer(s.nextDouble());
          break;
        case 4:
          carro.acelerar();
          break;
        case 5:
          carro.frear();
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção invalida!");
          break;
      }
  
    } while (opcao != 0);
  }
}