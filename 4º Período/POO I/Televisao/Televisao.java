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
    private Strig marca;
    private int quantCanais;
    private int canalAtual;
    private int volMaximo;
    private int volume;
    private boolean ligado;

    public Televisao (String marca){
        setMarca(marca);
    }

    public Televisao (String marca, int quantCanais, int volMaximo){
        setMarca(marca);
        setQuantCanais(quantCanais);
        setVolMaximo (volMaximo);
    }

    public void ligar (){
        this.ligado = true;
    }

    public void desligar(){
        this,ligado = false;
    }

    public void trocarCanal(){
        this.canalAtual++;
    }

    public void trocarCanal(int canal){

    }

    // controlando volume
    public void aumentarVolume(int volume){
        if (volume>0 && volume<=this.volMaximo){
            if(this.volume+volume > this.volMaximo){
                this.volume = this.volMaximo;
            } else{
                this.volume +=volume;
            }
        }
    }

    public void diminuirVolume(int volume){
        if (volume>0 && volume<=this.volMaximo){
            if(this.volume-volume < 0 ){
                this.volume = 0;
            } else{
                this.volume -=volume;
            }
        }
    }

}