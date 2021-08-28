import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner entrada = new Scanner (System.in);
        Pessoa joao = new Pessoa();
        Pessoa maria = new Pessoa();

        System.out.println("Nome: ");
        System.out.println("1ª pessoa: ");
        joao.setNome(entrada.nextLine());
        System.out.println("2ª pessoa: ");
        maria.setNome(entrada.nextLine());

        System.out.println("Sexo: ");
        System.out.println("1ª pessoa: ");
        joao.setsexo(entrada.nextLine());
        System.out.println("2ª pessoa: ");
        maria.setsexo(entrada.nextLine());

        System.out.println("Peso: ");
        System.out.println("1ª pessoa: ");
        joao.setpeso(entrada.nextInt());
        System.out.println("2ª pessoa: ");
        maria.setpeso(entrada.nextInt());

        System.out.println("Altura: ");
        System.out.println("1ª pessoa: ");
        joao.setaltura(entrada.nextInt());
        System.out.println("2ª pessoa: ");
        maria.setaltura(entrada.nextInt());

    }

}
