/*Crie uma classe Peixe que herde da classe Animal e obedeça à seguinte descrição: 
possua um atributo caracteristica(String); crie um método construtor que receba por parâmetro 
os valores iniciais de cada um dos atributos (incluindo os atributos da classe Animal) e atribua-os 
aos seus respectivos atributos; crie ainda os métodos get e set para o atributo caracteristica; 
crie um método dadosPeixe sem parâmetro e do tipo void, que, quando chamado, imprime na tela uma espécie 
de relatório informando os dados do peixe (incluindo os dados do Animal e mais a característica).
 */

public class Peixe extends Animal{

    private String caracteristicas;

    public Peixe (String nome, int numpatas, float comprimento, float velmedia, String cor, String ambiente, String som){
        super(nome, numpatas, comprimento, velmedia, cor, ambiente, som);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteriticas(){
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    @Override
    public String emitirSom(){
        return "Som:" +getSom(); 
    }

    public String dadosPeixe(){
        return  "Nome: " +getNome()+
                "\nNumero de Patas: " +getNumpatas()+
                "\nComprimento: " +getComprimento()+
                "\nVelocidade Media: " +getVelmedia()+
                "\nCor: " +getCor()+
                "\nAmbiente: " +getAmbiente()+
                "\nCaracteristica:" +getCaracteriticas();
    }

}