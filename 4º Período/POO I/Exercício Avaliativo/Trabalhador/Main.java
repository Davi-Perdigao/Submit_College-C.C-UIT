import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        Trabalhador trabalhador = new Trabalhador();

        System.out.println("TRABALHADORES: ");
        for(int i=0; i<3; i++){
            System.out.println("Matrícula: ");
            trabalhador.setMatricula(entrada.next());
            clearBuffer(entrada);
        
            System.out.println("Nome: ");
            trabalhador.setNome(entrada.next());

            System.out.println("Salário: ");
            trabalhador.setSalario(entrada.nextDouble());

        }
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}