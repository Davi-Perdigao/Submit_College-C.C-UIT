public class Produto {
    private String nome;
    private int qtdeAtual;
    private int qtdeMinima;

    public Produto(String nome, int qtdeMinima, int qtdeAtual) {
        this.nome = nome;
        this.qtdeAtual = qtdeAtual;
        this.qtdeMinima = qtdeMinima;
    }

    public Produto() {
    }

    public String toString(){ //Este método mostra as características do Produto
        String mensagem = String.format("Nome: %s\nQuantidade atual: %d\n", this.nome, this.qtdeMinima, this.qtdeAtual);
        return mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeAtual() {
        return qtdeAtual;
    }

    public void setQtdeAtual(int qtdeAtual) {
        if (qtdeAtual > 0) {
            this.qtdeAtual = qtdeAtual;
        }
    }

    public int getQtdeMinima() {
        return qtdeMinima;
    }

    public void setQtdeMinima(int qtdeMinima) {
        if(qtdeMinima>=0){
            this.qtdeMinima = qtdeMinima;
        } else{
            this.qtdeMinima = 0;
        }
    }

    public void repor(int quantidade) { //Este método aumenta o valor da qtdeAtual
        if (quantidade > 0) {
            this.qtdeAtual += quantidade;
        }
    }
}