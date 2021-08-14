import java.nio.FloatBuffer;

public class Caneta {
    
    String marca;
    String cor;
    float preço; 
    boolean apreço;

    public void informarDados(){
        System.out.prinln("Marca: " + this.marca);
        System.out.prinln("Cor: " + this.cor);
        System.out.prinln("Preço: " + this.preço);
    }

    public void entrarMarca(String marca){
        this.marca = marca;
        
    }

    public void entrarCor(String cor){
        this.cor = cor;
        
    }

    public void informarPreço(float preço){
        this.preço = preço;
        
    }

    public void alterarPreço(boolean apreço){
        this.apreço = apreço;
        

    }
    
}

