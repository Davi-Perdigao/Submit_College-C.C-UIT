/*Crie uma classe Animal que obedeça à seguinte descrição:
possua os atributos nome (String), comprimento (float), número de patas (int), cor (String), 
ambiente (String) e velocidade média (float). Crie um método construtor que receba por parâmetro 
os valores iniciais de cada um dos atributos e atribua-os aos seus respectivos atributos. 
Crie os métodos get e set para cada um dos atributos. 
Sobreescreve o metodo toString(), que, quando chamado, imprime na tela uma espécie de relatório 
informando os dados do animal. 
*/

public class Animal {

    private String nome;
    private float comprimento;
    private int numPatas;
    private String cor;
    private String ambiente;
    private double velMedia;
    private String som;

    public Animal(String nome, float comprimento, int numPatas, String cor, String ambiente, double velMedia,String som) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velMedia = velMedia;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMedia() {
        return velMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velMedia = velocidadeMedia;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String emitirSom() {
        return "Som:" + getSom();
    }

    @Override
    public String toString() {
        return "Animal [ambiente=" + ambiente + ", comprimento=" + comprimento + ", cor=" + cor + ", nome=" + nome
        + ", numPatas=" + numPatas + ", velocidadeMedia=" + velMedia + "]";
    }
    
}