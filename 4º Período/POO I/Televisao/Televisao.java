/*Crie uma classe Televisao com métodos que podem controlar 
o volume e trocar os canais da televisão. A TV só funciona 
ligada e deve ter limites de volume e canais. Os canais ao 
chegar no último volta para o primeiro. Crie os seguintes 
controles: aumentar ou diminuir a potência do volume de som 
em uma unidade de cada vez; aumentar e diminuir o número do 
canal em uma unidade trocar para um canal indicado ou subir 
um canal caso não seja informado o canal; consultar o valor 
do volume de som e o canal selecionado. Crie dois construtores 
para a TV, um que recebe apenas a marcad da TV e outro que 
recebe a marca, quantidade de canais e volume máximo. Crie o 
método toString que mostrará a marca da TV, o volume e o canal 
atual. Crie menu para interagir com a TV. Utilize métodos Get e Set.
*/


public class Televisao
{
    private int canal;
    private int volume;
    private String marca;
    private int qtdCanais;
    private int volumeMaximo;
    private Boolean ligado;

    public Televisao(String marca){
        this.marca = marca;
        this.ligado = false;
    }

    public Televisao(String marca,int qtdCanais,int volumeMaximo){
        this.marca = marca;
        this.qtdCanais = qtdCanais;
        this.volumeMaximo = volumeMaximo;
        this.ligado = false;
    }
    
    public int getVolume(){
        return this.volume;
    }

    public int getCanal(){
        return this.canal;
    }

    public boolean getLigado(){
        return this.ligado;
    }

    public void ligar(){
        ligado=true;
    }

    public void desligar(){
        ligado=false;
    }
    
    public void setCanal(int canal) {
        if(ligado==true){
            if(canal>0 && canal<=qtdCanais){
            this.canal = canal;
            }
        }
    }

    public void setLigado(){

        if(getLigado() == false){
            this.ligado = true;
        }else if(getLigado() == true){
            this.ligado = false;
        }
    }
   
    public void aumentarVolume(){
        if(ligado==true){
            if(volume>=0 && volume<volumeMaximo){
                volume++;
            }else{
                volume=volumeMaximo;
            }
        }
    }

    public void abaixarVolume(){
        if(ligado==true){
            if(volume>0 && volume<=volumeMaximo){
                volume--;
            }
        }
    }

    public void aumentaCanal(){
        if(isLigado() == true && getCanal() < qtdCanais){
            this.canal = getCanal() + 1;
        }else{
            this.canal = 0;
        }
    }

    public void aumentaCanal(int canal){
        if(isLigado() == true && canal < qtdCanais && canal > 0){
            this.canal = canal;
        }
    }

    public void abaixaCanal(){
        if(isLigado() == true && getCanal() > 0){
            this.canal = getCanal() - 1;
        }
    }

    public void escolheCanal(int escolha){
        if(isLigado() == true && escolha> 0 && escolha < this.qtdCanais){
            setCanal(escolha);
        }
    }

    public String detalhe(){
        return "Volume: "+getVolume()+" Canal: "+getCanal();
    }

    public Boolean isLigado(){
        if(getLigado() == true){
            return true;
        }else{
            return false;
        }
    }


    public String toString(){
        return  "\nTelevisão - Marca:"+this.marca+ "\nVolume: "+getVolume()+"\nCanal: "+getCanal()+"\nLigado: "+getLigado();
    }

    


}