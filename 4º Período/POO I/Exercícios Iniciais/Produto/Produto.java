/*
Crie uma classe Produto para representar um produto do mundo real. Sua classe 
deverá conter os seguintes atributos e métodos:
Um campo de dados privado do tipo String chamado nome, que representará o nome do 
produto.
Um campo de dados privado do tipo double chamado precoCusto, que guardará o preço 
de custo do produto.
Um campo de dados privado do tipo double chamado precoVenda, que guardará o preço 
de venda do produto.
Um campo de dados privado do tipo double chamado margemLucro, que guardará a 
margem de lucro do produto.
Métodos públicos get() e set() para os atributos acima. Modifique o método 
setPrecoVenda() para que o preço de venda não seja inferior ao preço de compra. Caso 
isso aconteça, exiba uma mensagem alertando o usuário.
Crie um método chamado calcularMargemLucro() que calculará a margem de lucro do 
produto.
Crie um método chamado getMargemLucroPorcentagem() que retornará a margem de 
lucro como percentual.
Para finalizar, no método main() da classe de teste, crie um novo objeto da classe 
Produto, peça para o usuário informar os preços de custo e de venda e exiba a margem 
de lucro em moeda e em percentual
*/


public class Produto {
    
    private String nome;
    private Double pCusto;
    private Double pVenda;
    private Double margemLucro;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPrecoCusto(Double precoCusto) {
        if(precoCusto > 0){
            this.pCusto = precoCusto;
        }
        else {
            System.out.println("Valor negativo ou igual a 0");
        }
    }

    public void setPrecoVenda(Double precoV){
        if(precoV >= getPrecoCusto()){
            this.pVenda = precoV;
        }else{
            System.out.println("Preço de venda inforior ao de custo!!!");
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    public Double getPrecoCusto(){
        return this.pCusto;
    }
    public Double getPrecoVenda(){
        return this.pVenda;
    }
    public Double getMargemLucro(){
        return this.margemLucro;
    }
    
    public void calcularMargemLucro(){
        this.margemLucro = pVenda - pCusto;
    }
    public Double getPercentualLucro(){
        return ((this.margemLucro * 100)/(getPrecoCusto()));
    }
    
    public String imprimir(){
        return ("\n\nNome: "+getNome()+
        "\nPreco de Custo: "+getPrecoCusto()+
        "\nPreco de Venda: "+getPrecoVenda()+
        "\nLucro: "+getMargemLucro()+
        "\nPercentual de Lucro: "+getPercentualLucro());
    }
}
