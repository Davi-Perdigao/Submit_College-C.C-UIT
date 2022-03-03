/*Faça um programa que leia o nome de um vendedor, o seu salário 
fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo 
que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar 
o total a receber no final do mês, com duas casas decimais.
*/

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