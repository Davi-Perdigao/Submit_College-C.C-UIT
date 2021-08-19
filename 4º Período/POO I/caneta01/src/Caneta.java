import java.nio.FloatBuffer;

public class Caneta {
    
    private String marca;
    private String cor;
    private Float preço; 
    private Boolean altpreço;

    public boolean altpreço() {
        return altpreço;
    }

    public void newpreço(){
        uso++;
        if (uso == 3) {
            altpreço = false;
        }
    }

    public void zerarpreço() {
        uso = 0;
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
            + "\naltpreço: " + (altpreço() ? "Sim" : "Não")
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

