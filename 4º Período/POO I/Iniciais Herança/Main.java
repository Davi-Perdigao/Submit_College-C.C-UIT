/*
Crie uma classe TestarAnimais possua um método main para testar as classes criadas.
Crie um objeto camelo do tipo Mamífero e atribua os seguintes valores para seus atributos:  
Nome: Camelo  Comprimento: 150 cm  Patas: 4  Cor: Amarelo  Ambiente: Terra Velocidade: 2.0 m/s
Crie um objeto tubarao do tipo Peixe e atribua os seguintes valores para seus atributos 
Nome: Tubarão Comprimento: 300 cm Patas: 0  Cor: Cinzento  Ambiente: Mar  Velocidade: 1.5 m/s  Caracteristica: Barbatanas e cauda
Crie um objeto ursocanada do tipo Mamifero e atribua os seguintes valores para seus atributos: Nome: Urso-do-canadá Comprimento: 180 cm 
Patas: 4 Cor: Vermelho Ambiente: Terra Velocidade: 0.5 m/s Alimento: Mel
Chame os método para imprimir os dados de cada um dos objetos criados.
Crie na classe animal o método emitirSom() que retorna uma string com o som do animal. Este método deve ser sobreescrito em cada animal 
que herda desta classe.
*/

public class Main {
    
    public static void Main(String[] args){

        Mamifero camelo = new Mamifero("Camelo", 150 , 4 , "Amarelo" , "Terra" , 2, "nhame nhame");
        Peixe tubarao = new Peixe("Tubarão", 300 , 0 , "Cinzento" , "Mar" , 1.5 ,"tam tam tam tam","Barbatanas e cauda"); 
        Mamifero urso = new Mamifero("Urso-do-canadá", 180 , 4 , "Vermelho" , "Terra" , 0.5, "uaaar","Mel");

        System.out.println(camelo.dadosMamifero());
        System.out.println(camelo.emitirSom());

        System.out.println("\n"+tubarao.dadosPeixe());
        System.out.println(tubarao.emitirSom());

        System.out.println("\n"+urso.dadosMamifero());
        System.out.println(urso.emitirSom());
    }
}