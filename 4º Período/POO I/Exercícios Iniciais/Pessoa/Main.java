import java.util.Scanner;

public class main {
        public static void main(String args[]){
        Scanner input = new Scanner(System.in); 
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();

        p1.setNome(input.nextLine());
        p1.setEndereco(input.nextLine());
        p1.setTelefone(input.nextLine());

        p2.setNome(input.nextLine());
        p2.setEndereco(input.nextLine());
        p2.setTelefone(input.nextLine());

        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
    }
}