/*Leia dois valores inteiros. A seguir, calcule o produto entre estes 
dois valores e atribua esta operação à variável PROD. A seguir mostre a 
variável PROD com mensagem correspondente. 
*/  

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int n1, n2;
	    int PROD;
	    Scanner entrada = new Scanner (System.in);
	    n1 = entrada.nextInt();
	    n2 = entrada.nextInt();
	    
	    PROD = n1*n2;
	    System.out.println("PROD = " + PROD);

	}
}