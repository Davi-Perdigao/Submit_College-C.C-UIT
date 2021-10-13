/*Criar uma classe Contato, que deverá ter o nome, 
o telefone e a cidade da pessoa, id autoincremento e 
também um booleano ativo. Crie uma classe Testa que 
possui um arrayList de contatos. Crie um menu para 
adicionar, remover, listar, listar inativos, ativar contato, 
bloquear contato, buscar por nome, listar por cidade, limpar 
agenda. Obs. Listar, listar por cidade e listar por nome só 
devem exibir os ativos.
*/

public class Contato {
    private int idContato;
    private String nome;
    private String telefone;
    private String cidade;
    private boolean ativo;
    private static int idContador = 0;

    public Contato(String nome, String telefone, String cidade){
        idContato = ++idContador;
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public String toString() {
        return "\nNome:"+getNome() + "\nTelefone:"+getTelefone() + "\nCidade:"+getCidade();
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    public String getCidade() {
        return cidade;
    }

    public int getidContador() {
        return idContador;
    }
    
    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public Boolean getAtivo(){
        return this.ativo;
    }

    public void ativarContato(){
        this.ativo = true;
    }

    public void bloquearContato(){
        this.ativo = false;
    }
}