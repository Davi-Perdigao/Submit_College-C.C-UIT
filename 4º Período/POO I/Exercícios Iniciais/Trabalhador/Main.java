import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        Trabalhador pedreiro = new Trabalhador();

        System.out.println("Informe a matrícula: ");
        pedreiro.setMatricula(entrada.nextInt());
        clearBuffer(entrada);
        
        System.out.println("Informe o nome: ");
        pedreiro.setNome(entrada.nextLine());

        System.out.println("Informe o salário: ");
        pedreiro.setSalario(entrada.nextDouble());

        System.out.println(pedreiro.imprimirDados());

    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

