/*Crie uma classe Mamifero que herde da classe Animal e obedeça à seguinte descrição: possua um atributo 
alimento(String); crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos 
(incluindo os atributos da classe Animal) e atribua-os aos seus respectivos atributos; crie ainda os métodos get 
e set para o atributo alimento; crie um método dadosMamifero sem parâmetro e do tipo void, que, quando chamado, imprime 
na tela uma espécie de relatório informando os dados do mamifero (incluindo os dados do Animal e mais o alimento).
*/

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, float comprimento, int numPatas, String cor, String ambiente, double velMedia, String som, String alimento) {
        super(nome, comprimento, numPatas, cor, ambiente, velMedia, som);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String emitirSom(){
        return "Som:" +getSom(); 
    }
    
    public String dadosMamifero(){
        return  "Nome:" +getNome() +
                "\nComprimento:" + getComprimento() +
                "\nCor: " + getCor() +
                "\nAmbiente:"+ getAmbiente() +
                "\nVelocidade Media:"+ getVelocidadeMedia() +
                "\nAlimento:" +getAlimento()+
                "\nNumero de Patas: "+ getNumPatas();
                
    }
    
}