import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    String nome = entrada.nextLine();
	    double SalarioFixo = entrada.nextDouble();
	    double total = entrada.nextDouble();
	    
	    double comissao = ((total*0.15) + SalarioFixo);
	    
	    System.out.println(String.format("TOTAL = R$ %.2f" , comissao));
	}
}
