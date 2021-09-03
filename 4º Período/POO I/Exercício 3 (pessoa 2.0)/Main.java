import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Scanner ent = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.println("Digite o nome da pessoa: ");
        pessoa.setNome(ent.nextLine());
        System.out.println("Digite o sexo da pessoa: (M) ou (F) ");
        pessoa.setSexo((ent.next()).charAt(0));
        System.out.println("Digite o peso: ");
        pessoa.setPeso(ent.nextDouble());
        System.out.println("Digite a altura: ");
        pessoa.setAltura(ent.nextDouble());
        
        
        System.out.println("---Apresentando os dados da Pessoa---");
        System.out.println(pessoa.imprimirDados());
        System.out.println("Esta pessoa está "+pessoa.descricaoPeso());
        
    }
    
}