import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Trabalhador professor = new Trabalhador();

        System.out.println("Matrícula: ");
        professor.setMatricula(entrada.next());
        clearBuffer(entrada);
        
        System.out.println("Nome: ");
        professor.setNome(entrada.next());

        System.out.println("Salário: ");
        professor.setSalario(entrada.nextDouble());

        System.out.println(professor.printDados());

    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}

