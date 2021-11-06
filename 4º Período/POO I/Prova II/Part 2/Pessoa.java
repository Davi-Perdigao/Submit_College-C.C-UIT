public class Pessoa {
    //Criar a classe pessoa com os atributos id, nome, altura, peso. Métodos Imc e outros a sua escolha.
    private int id;
    private String nome;
    private double altura;
    private double peso;

    public Pessoa(int id, String nome, double altura, double peso) {
        setId(id);
        setNome(nome);
        setAltura(altura);
        setPeso(peso);
    }

    public String toString() {
        String mensagem = String.format("%d; %s; %.2f; %.2f;", this.id, this.nome, this.altura, this.peso);
        return mensagem;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double getPeso() {
        return this.peso;
    }

    private void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }
}