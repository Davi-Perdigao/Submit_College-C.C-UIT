import java.nio.FloatBuffer;

public class Caneta {
    
    private String marca;
    private String cor;
    private Float preço; 
    private Float altpreço;

    String cor () {
        return ("Estou escrevendo de "+cor);
    }

    public Float altpreço() {
        return altpreço;
    }

    public void zerarpreço() {
        preço = altpreço;
    }

    public void newpreço(){
        altpreço++;
        if (altpreço() == 3) {
            altpreço = false;
        }
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public void printCaneta(){
        System.out.println(
            ""
            + "\nmarca: " + marca
            + "\ncor: " + cor
            + "\npreço: " + preço
            + "\naltpreço: " + altpreço
        );
    }

    public Caneta() {
        this.marca = "";
        this.cor = "";
        this.preço = "";
        this.altpreço = true;
    }

    public Caneta(String marca, String cor) {
        this();
        this.marca = marca;
        this.cor = cor;
    }
    
    public void srcPreço() {
        if(!altpreço()){
            this.altpreço = true;
            this.zerarpreço();
        }
    }

}

