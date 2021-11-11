/*Crie uma classe Mamifero que herde da classe Animal e obedeça à seguinte descrição: possua um atributo 
alimento(String); crie um método construtor que receba por parâmetro os valores iniciais de cada um dos atributos 
(incluindo os atributos da classe Animal) e atribua-os aos seus respectivos atributos; crie ainda os métodos get 
e set para o atributo alimento; crie um método dadosMamifero sem parâmetro e do tipo void, que, quando chamado, imprime 
na tela uma espécie de relatório informando os dados do mamifero (incluindo os dados do Animal e mais o alimento).
*/

public class Mamifero extends Animal {
    
    private String alimento;

    public Mamifero(String nome, int numpatas, float comprimento, float velmedia, String cor, String ambiente, String alimento) {
        super(nome, numpatas, comprimento, velmedia, cor, ambiente);
        this.alimento = alimento;
    }
    
    public void setAlimento(String Alimento) {
        this.alimento = Alimento;
    }
    
    public String getAlimento() {
        return alimento;
    }
        
    public String dadosMamifero(){
        return  "Nome: " +getNome()+
        "/nNumero de Patas: " +getNumpatas()+
        "/nComprimento: " +getComprimento()+
        "/nVelocidade Media: " +getVelmedia()+
        "/nCor: " +getCor()+
        "/nAmbiente: " +getAmbiente()+
        "/nCaracterística: " +getAlimento();
    }
    
    
}

