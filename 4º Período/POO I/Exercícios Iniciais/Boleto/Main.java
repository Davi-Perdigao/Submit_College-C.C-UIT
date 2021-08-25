public class Main
{
    public static void main(String args[])
    {
        String vencimento = "31/12/2021";

        Boleto boleto = new Boleto("Edmilson Lino", vencimento, 1500.0 , 100.0);
        
        System.out.println(boleto.imprimirDados());
    }
}