import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        String nome, vencimento = "01/09/2021";
        double valorBoleto, valorDesconto;

        System.out.println("Nome:");
        nome = entrada.nextLine();

        System.out.println("Valor do boleto:");
        valorBoleto = entrada.nextDouble();

        System.out.println("Valor do desconto:");
        valorDesconto = entrada.nextDouble();

        Boleto boleto = new Boleto(nome, vencimento, valorBoleto, valorDesconto);

        boleto.pagarBoleto();
        System.out.println(boleto.imprimirInfos());

        entrada.close();
    }
}