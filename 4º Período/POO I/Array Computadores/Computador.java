/*
 Crie uma classe Computador que possua os parâmetros tamanho da HD, tamanho da
 RAM, número de processadores e fabricante. Crie métodos de acesso público e
 reimplemente o método toString() da classe. Crie um construtor para passar
 todos os atributos durante a criação do objeto.

 Crie o atributo booleano ligado e um método para ligar e desligar o
 computador. Todo computador quando for criado deve estar desligado. Crie o
 método estadoComputador que retorna se ele está ligado ou desligado. 

 Crie uma classe TestaComputador. Crie nesta classe um array de 3 computadores
 que irá receber os dados do computador pelo usuário. Depois imprima os dados
 dos computadores que possuem mais que 512Mb de Ram usando o método toString.
 
  Se conseguir fazer o cadastro por menu é muito bom. 
 */

public class Computador {

    private int tamanhoHD;
    private int tamanhoRAM;
    private int numProcessadores;
    private String fabricante;
    public static int RAMaceita = 512;
    private boolean ligado;

    public Computador(int tamanhoHD, int tamanhoRAM, int numProcessadores, String Fabricante) {
        this.tamanhoHD = tamanhoHD;
        this.tamanhoRAM = tamanhoRAM;
        this.numProcessadores= numProcessadores;
        this.fabricante = Fabricante;
        this.ligado = false;
    }

    public void ligarComputador() {
        ligado = true;
    }

    public void desligarComputador() {
        ligado = false;
    }

    public double getTamanhoHD() {
        return tamanhoHD;
    }

    public void setTamanhoHD(double tamanhoHD) {
        if (tamanhoHD <= 0)
            return;

        this.tamanhoHD = tamanhoHD;
    }

    public double getTamanhoRAM() {
        return tamanhoRAM;
    }

    public void setTamanhoRAM(double tamanhoRAM) {
        if (tamanhoRAM <= 0)
            return;

        this.tamanhoRAM = tamanhoRAM;
    }

    public int getNumProcessadores() {
        return numProcessadores;
    }

    public void setNumProcessadores(int numProcessadores) {
        if (numProcessadores <= 0)
            return;

        this.numProcessadores = numProcessadores;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.fabricante = Fabricante;
    }

    public String toString() {
        return "\nComputador: "+fabricante+"\nLigado: "+ligado+"\nTamanhoHD: "+tamanhoHD+
        "\nTamanhoRAM: "+tamanhoRAM+"\nNumero de Processadores: "+numProcessadores;
    }

    public String estadoComputador(){
        if(ligado){
        return "Computador ligado.";
        }else{
            return "Computador desligado!";
        }
    }
}