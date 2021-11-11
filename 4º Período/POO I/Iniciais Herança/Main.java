import java.util.Scanner;

/*
Crie uma classe TestarAnimais possua um método main para testar as classes criadas.
Crie um objeto camelo do tipo Mamífero e atribua os seguintes valores para seus atributos:  
Nome: Camelo  Comprimento: 150 cm  Patas: 4  Cor: Amarelo  Ambiente: Terra Velocidade: 2.0 m/s
Crie um objeto tubarao do tipo Peixe e atribua os seguintes valores para seus atributos 
Nome: Tubarão Comprimento: 300 cm Patas: 0  Cor: Cinzento  Ambiente: Mar  Velocidade: 1.5 m/s  Caracteristica: Barbatanas e cauda
Crie um objeto ursocanada do tipo Mamifero e atribua os seguintes valores para seus atributos: Nome: Urso-do-canadá Comprimento: 180 cm 
Patas: 4 Cor: Vermelho Ambiente: Terra Velocidade: 0.5 m/s Alimento: Mel
Chame os método para imprimir os dados de cada um dos objetos criados.
Crie na classe animal o método emitirSom() que retorna uma string com o som do animal. Este método deve ser sobreescrito em cada animal 
que herda desta classe.
*/

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Nome:");
        String nome = input.nextLine();
        System.out.println("Comprimento:");
        Float comprimento = input.nextFloat();
        input.nextLine();
        System.out.println("Numero de Patas:");
        Integer numpatas = input.nextInt();
        input.nextLine();
        System.out.println("Cor:");
        String cor = input.nextLine();
        input.nextLine();
        System.out.println("Ambiente:");
        String ambiente = input.nextLine();
        System.out.println("Velocidade Media:");
        Float velmedia = input.nextFloat();
        input.nextLine();
    
        Animal animal = new Animal(nome, comprimento, numpatas, cor, ambiente, velmedia);
    
        System.out.println(animal.toString());
    
    }
}
