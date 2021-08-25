import java.util.Scanner;


public class main {
    public static void main(String args[]) {  
        Scanner input = new Scanner(System.in); 
        Produto produto = new Produto();

        produto.setNome(input.nextLine());
        produto.setPrecoCusto(input.nextDouble());
        produto.setPrecoVenda(input.nextDouble());
        produto.calcularMargemLucro();

        System.out.print(produto.imprimir());

    }
}