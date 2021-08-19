package caneta01;

public class Main {
    public static void main(String[] args) {
        var c1 = new Caneta("Bic", "Vermelha");
        c1.printCaneta();
        /*
         * Marca: Bic 
         * Cor: Vermelha 
         * Tem tinta: Sim 
         * Uso: 0
        */

        Caneta c2 = new Caneta();
        c2.setMarca("Bic");
        c2.setCor("Azul");
        c2.printCaneta();
        /*
         * Marca: Bic 
         * Cor: Azul 
         * Tem tinta: Sim 
         * Uso: 0
        */

        c2.usar();
        c2.usar();
        c2.usar();
        c2.printCaneta();
        /*
         * Marca: Bic 
         * Cor: Azul 
         * Tem tinta: Sim 
         * Uso: 3
        */

        c2.usar();
        c2.usar();
        // Chegamos no uso 5, logo a tinta acaba.
        c2.printCaneta();
        /*
         * Marca: Bic 
         * Cor: Azul 
         * Tem tinta: Não 
         * Uso: 5
        */

        c2.porTinta();
        c2.printCaneta();
        /*
         * Marca: Bic 
         * Cor: Azul 
         * Tem tinta: Sim 
         * Uso: 0
        */
    }
}
}
