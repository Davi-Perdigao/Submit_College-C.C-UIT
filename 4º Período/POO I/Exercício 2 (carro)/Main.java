public class Main {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        Carro logan = new Carro();
        
        System.out.println(logan.setvelocidade());
        logan.setvelocidade(entrada.nextLine());
        
        System.out.println(logan.informaçõesString());
        
        logan.ligar();
        logan.desligar();
        
        System.out.println(logan.setvelocidade());

        System.out.println(logan.informaçõesString());
}
