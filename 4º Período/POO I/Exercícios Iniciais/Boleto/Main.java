public class Main
{
    public static void main(String args[])
    {
        String vencimento = "05/09/2021";

        Boleto boleto = new Boleto("Davi", vencimento, 1100.0 , 100.0);
        
        System.out.println(boleto.imprimirDados());
    }
}