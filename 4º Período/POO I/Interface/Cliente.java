import java.util.List;

/*
Crie a classe Cliente que herda de Pessoa e possui as propriedades: ativo e
uma lista de produtos. Crie métodos como adiciona produto, etc.
*/

public class Cliente extends Pessoa implements Prioridade {
    private boolean ativo;
    private List<Produto> produtos;

    public Cliente(String nome, String endereco, boolean ativo, List<Produto> produtos) {
        super(nome, endereco);
        this.ativo = ativo;
        this.produtos = produtos;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void ativarInativar() {
        this.ativo = !this.ativo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Produto buscarProduto(String nome){
        for(Produto p : produtos){
            if(p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public String mostraTipo() {
        return "";

    }

    public boolean autenticar(){
        if(isAtivo()){
            return true;
        } else{
            return false;
        }
    }
}
