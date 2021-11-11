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
    private int numpatas;
    private float comprimento;
    private float velmedia;
    private String cor;
    private String ambiente;

    public Animal (String nome, int numpatas, float comprimento, float velmedia, String cor, String ambiente){
        this.nome = nome;
        this.comprimento = comprimento;
        this.velmedia = velmedia;
        this.cor = cor;
        this.ambiente = ambiente;
    }

    public Animal(String nome2, Float comprimento2, Integer nPatas, String cor2, String ambiente2, Float vMedia) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumpatas() {
        return numpatas;
    }

    public void setNumpatas(int numpatas) {
        this.numpatas = numpatas;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getVelmedia() {
        return velmedia;
    }

    public void setVelmedia(float velmedia) {
        this.velmedia = velmedia;
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

    @Override
    public String toString() {
      return "\nNome:"+getNome()+
      "\nComprimento:"+getComprimento()+
      "\nNumero de Patas:"+getNumpatas()+
      "\nCor:"+getCor()+
      "\nAmbiente:"+getAmbiente()+
      "\nVelocidade Media:"+getVelmedia();
    }
    
}
