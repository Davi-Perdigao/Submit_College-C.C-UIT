import java.util.ArrayList;

public class Loja {
    private String nome;
    private ArrayList<Produto> loja = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Produto> getProdutos() {
        return loja;
    }

    public void adicionarProduto(Produto produto){
        loja.add(produto);
    }

    public String mostraQuantidadeProdutos(){
        String quantidadeprod = "\t";

        for ( Produto x : loja){
            quantidadeprod += "\n" + x.toString();
        }
        return quantidadeprod;
    }

    public int mostraQuantidadeProdutos(String nome){
        int quantidade = 0;
        for(Produto x : loja){
            if(x.getNome().equals(nome)){
                quantidade =  x.getQtdeAtual();
            }
        }
        return quantidade;
    }

    public Produto mostraProdutosAbaixoDoMinimo(){
        Produto produto = null;
        for(Produto x : loja){
            if(x.getQtdeAtual()<x.getQtdeMinima()){
                produto = x;
            }
        }    
        return produto;
    }

    public int totalProdutos(){
        int totalProdutos = 0;
        for(Produto p : loja){
            totalProdutos += p.getQtdeAtual();
        }
        return totalProdutos;
    }

}