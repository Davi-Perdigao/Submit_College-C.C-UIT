public class Main {
    public static void main(String[] args) {
        var c1 = new Caneta("Compactor", "Preta");
        c1.printCaneta();
        /*
         * Marca: Compactor 
         * Cor: Preta 
         * Preço: 9 
         * Alterar Preço: 0
        */

        Caneta c2 = new Caneta();
        c2.setMarca("Bic");
        c2.setCor("Preta");
        c2.printCaneta();
        /*
         * Marca: Bic 
         * Cor: Preta 
         * Preço: 7 
         * Alterar Preço: 0
        */

        c2.altpreço();
        c2.altpreço();
        c2.printCaneta();
        /*
         * Marca: Bic 
         * Cor: Preta 
         * Preço: 7 
         * Alterar Preço: 2
        */

        c2.altpreço();   // 3 alterações de preço (máximo permitido)

        c2.printCaneta();
        /*
         * Marca: Bic 
         * Cor: Preta 
         * Preço: Não 
         * Alterar Preço: 10
        */
    }
}
