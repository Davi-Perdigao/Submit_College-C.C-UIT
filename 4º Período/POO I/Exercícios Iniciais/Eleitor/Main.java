import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Eleitor pessoa = new Eleitor();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nome do Eleitor:");
        pessoa.setNome(entrada.next());

        System.out.println("Sexo:");
        pessoa.setSexo(entrada.next());

        System.out.println("Idade: ");
        pessoa.setIdade(entrada.nextInt());

        System.out.println("Título de eleitor: ");
        pessoa.setTitulo(entrada.nextInt());

        System.out.println(pessoa.printEleitor());

        System.out.println(pessoa.checarVotacao());
        
    }
}