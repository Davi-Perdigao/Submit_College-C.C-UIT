/*
- Escreva um código em Java que apresente a classe Pessoa, com atributos nome, 
endereço e telefone e, o método imprimir (Imprime todos os dados da pessoa). O 
método imprimir deve mostrar na tela os valores de todos os atributos. Não esqueça de 
adicionar os métodos Get,s e Set's. Crie a classe TestaPessoa, instancie 2 pessoas e teste 
os métodos. Veja que cada pessoa possui seus próprios atributos.
*/

public class Pessoa {
    
    public String nome;
    public String endereco;
    public String telefone;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
 
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getTelefone(){
        return this.telefone;
    }

    public String imprimir(){
        return ("\nNome: "+getNome()+
        "\nEndereco: "+getEndereco()+
        "\nTelefone: "+getTelefone());
    }
}