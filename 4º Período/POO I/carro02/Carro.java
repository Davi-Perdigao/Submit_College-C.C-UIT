public class Carro {

    private double velocidade;
    private int capacidadeTanque;
    private boolean ligado;
    private double combustivel;
    

    public boolean getligado() {
        return ligado;
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

    //ler a capacidade do tanque
    public int getcapacidadeTanque(){
        return capacidadeTanque;
    }

    //escrever a velocidade
    public void setvelocidade(double valor){
        if(valor>0 && valor<=250)
        velocidade = valor;
    }

    String andar(){
        if(getcombustivel()>0){
        combustivel --;
        return ("Carro ligado");
        }else{
            return "Não é possível ligar o carro";
        }
        
    }

    String estado(){
        if(ligado==true){
            return "Ligado";
            
        }else{
            return "Desligado";
        }
    }

    public String informaçõesString(){
        return "Velocidade: "+setvelocidade()+
                "Capacidade total do tanque: "+getcapacidadeTanque()+
                "Quantidade de combustível: "+getcombustivel()+
                "Estado do carro: "+estado();
    }

    public Carro(double velocidade, int capacidadeTanque, boolean ligado, double combustivel) {
        this.velocidade = velocidade;
        this.capacidadeTanque = capacidadeTanque;
        this.ligado = ligado;
        this.combustivel = combustivel;
    }

}
