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
