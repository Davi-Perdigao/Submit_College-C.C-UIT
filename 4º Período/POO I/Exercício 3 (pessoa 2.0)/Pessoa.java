/*
Crie uma classe para representar uma pessoa, com os atributos privados 
de nome, sexo, peso e altura. Crie os métodos públicos necessários para 
sets e gets e também um método para imprimir todos dados de uma pessoa. 
Crie um método para calcular o imc da pessoa e outro método que retorne 
string se está abaixo, acima ou no peso ideal. Faça o teste com duas 
pessoas passando os valores por get e set.
*/

public class Pessoa {
    
    private String nome;
    private char sexo;
    private double peso;
    private double altura;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
        
    }

    public void setPeso(double peso) {
        if(peso>0 && peso<300)
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura>0 && altura<3)
        this.altura = altura;
    }
    
    public double imc(){
        return peso/(altura*altura);
    }
    
    public String descricaoPeso(){
        String desc;
        if(imc()<= 18.5 ){
            desc = "abaixo do peso";
        }else if(imc()<= 24.9){
            desc = "peso ideal";
        }else{
            desc = "acima do peso";
        }
        return desc;
    }
    
    public String imprimirDados(){
        return "O "+getNome()+" do sexo "+((getSexo()=='m')?"Masculino":"Feminino")+" e pesa "+getPeso()+"e mede "+getAltura();
    }
    
}