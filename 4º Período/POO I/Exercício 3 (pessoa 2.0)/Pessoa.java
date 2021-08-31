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
    private String sexo;
    private int peso;
    private int altura;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setsexo(String string){
        this.sexo = string;
    }
    public void setpeso(int peso){
        this.peso = peso;
    }

    public void setaltura(int altura){
        this.altura = altura;
    }
 
    public String getNome(){
        return this.nome;
    }

    public String getsexo(){
        return sexo;
    }

    public int getpeso(){
        return peso;
    }

    public int getaltura(){
        return altura;
    }

    public String imprimir(){
        return ("\nNome: "+getNome()+
        "\nSexo: "+getsexo()+
        "\nPeso: "+getpeso()+
        "\nAltura: "+getaltura());
    }
    
    public double calcularIMC(){

        double imc = this.peso/(Math.pow(this.altura, 2));
        return imc;
    }

    public String checarIMC(){

        if(calcularIMC()<=18.5){
            return "Abaixo do Peso.";
        }else if (calcularIMC()>=18.5 && calcularIMC()<=24.9){
            return "Peso Normal.";
        }else {
            return "Acima do Peso.";
        }
    }
    
}