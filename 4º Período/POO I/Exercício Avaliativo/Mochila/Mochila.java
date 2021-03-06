/* Crie a classe mochila que possui os atributos nome, 
quantidadeItensAtual, quantidadeItensMaxima, pesoAtual, pesoMaximo. 
Criar um construtor onde é necessário passar o nome da mochila e o peso e 
quantidade de itens que ela suporta. Deverá existir um método inserir itens 
onde é passado o peso do item que está sendo inserido. Também deverá ter
um método que retorna a situação da atual da mochila. Criar uma classe de 
teste e testar tentando inserir vários itens na mochila.*/ 

public class Mochila {

//atributos nome, quantidadeItensAtual, quantidadeItensMaxima, pesoAtual, pesoMaximo

    private String nome;
    private int quantidadeItensAtual;
    private int quantidadeItensMaxima;
    private double pesoAtual;
    private double pesoMaximo;

//construtor onde é necessário passar o nome da mochila e o peso e quantidade de itens que ela suporta

    public Mochila(String nome, int quantidadeItensMaxima, double pesoMaximo) {
        this.nome = nome;
        this.quantidadeItensMaxima = quantidadeItensMaxima;
        this.pesoMaximo = pesoMaximo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeItensAtual() {
        return quantidadeItensAtual;
    }

    public void setQuantidadeItensAtual(int quantidadeItensAtual) {
        this.quantidadeItensAtual = quantidadeItensAtual;
    }

    public int getQuantidadeItensMaxima() {
        return quantidadeItensMaxima;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

// método inserir itens onde é passado o peso do item que está sendo inserido

    public void inserir(double peso) {
        if(pesoAtual<pesoMaximo && peso<=pesoMaximo && quantidadeItensAtual<quantidadeItensMaxima){
            if(pesoAtual+peso <= pesoMaximo){
                pesoAtual += peso;
                quantidadeItensAtual++;
            }else{
                System.out.println("Peso e/ou Limite de itens da mochila atingido(s) !");
            }
        }else{
            System.out.println("Peso e/ou Limite de itens da mochila atingido(s) !");
        }

    }

// método que retorna a situação atual da mochila

    public String imprimeInfo(){
        return "Peso Atual:" + getPesoAtual() +
               "\nPeso Maximo:" + getPesoMaximo();
    }

    public String toString() {
        return "Mochila [nome=" + nome + ", pesoMaximo=" + pesoMaximo + ", quantidadeItensMaxima="
                + quantidadeItensMaxima + "]";
    }

}