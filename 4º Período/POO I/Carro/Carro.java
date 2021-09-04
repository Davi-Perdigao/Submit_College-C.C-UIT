/*Criar um projeto de  carro (novamente), onde, quando acelerar 
o carro, caso ele entre na reserva (10% ou menos do tanque), 
avisar o usuário. Criar o campo velocidade máxima, e o carro 
deverá respeitar esse valor.  Veja que carros que tem motor mais 
potente gastam mais gasolina. Lembre-se que o carro só anda ligado 
e com gasolina, que ele precisa abastecer, etc. Você é livre para 
escolher os atributos do carro, mas alguns são obrigatórios, como
apresentado anteriormente. Ao criar o carro é preciso informar no 
construtor o modelo, capacidade do tanque, velocidade máxima e potencia 
do motor(1.0, 1.4, 1.8, etc). No método main, receba as informações
iniciais do carro e crie um menu para o usuário interagir com o carro como...
acelerar, frear, ligar, abastecer, etc...
*/

public class Carro {

    private String placa;
    private int velocidade;
    private int velocidadeMax;
    private double potMotor;
    private int capacidadeTanque;
    private boolean ligado;
    private double combustivel;
    
    public Carro(){

    }

    public void setPlaca (String placa){
        this.placa = placa;
    }

    public String getPlaca(){
        return this.placa;
    }

    private void setPotenciaMotor (double potMotor){
        this.potMotor = potMotor;
    }

    public double setPotenciaMotor(){
        return this.potMotor;
    }

    public void abastecer (double combustivel){
        this.combustivel = combustivel;
    }

    public boolean getligado() {
        return ligado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void ligar(double combustivel){
        if(combustivel>0)
        ligado=true;
    }
    
    public void desligar(double combustivel){
        if(combustivel<0)
        ligado=false;
    }

    public double getcombustivel() {
        return combustivel;
    }
    
    public void abastecer(){
        combustivel = capacidadeTanque;
    }

    public void acelerar ()

    if(this.combustivel>0 && this.ligado == true){

        this.velocidade += 10;
        this.combustivel --;
        if (this.combustivel <= this.capacidadeTanque*0.1){
            System.out.println("O carro está na reserva. Abasteça Imediatamente!");
        }
        if (this.velocidade > this.velocidadeMax){
            this.velocidade = velocidadeMax;
        }    
    }

}