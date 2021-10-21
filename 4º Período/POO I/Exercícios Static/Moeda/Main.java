public class Main {
    public static void main(String args[]) { 

        System.out.println("1 Dólar = ");
        System.out.println(Moeda.converterDolar(1) + " reais\n");
        System.out.println("1 Real = ");
        System.out.printf("%.2f dólares\n",Moeda.converterReal(1) );
    }
}
