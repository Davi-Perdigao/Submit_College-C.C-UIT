/*Modifique a classe celular e altere o jogo para 
poder jogar Pedra, Papel e Tesoura. Também deverá ser 
criado um campo Id celular que deverá ser incrementado 
automaticamente e também um método estático mostraQtdeCelulares() 
que retorna quantos celulares estão instanciados!
*/

import java.util.Random;
import java.util.Scanner;

public class Celular {
    private String modelo;
    private int nivelBateria;
    private boolean ligado;
    private int som;
    private static int contInstancias = 1;
    private static int idCelular;

    Scanner input = new Scanner(System.in);

    public Celular(String modelo, int nivelBateria, int nivelSom) {
        setModelo(modelo);
        setNivelBateria(nivelBateria);
        setSom(nivelSom);
        idCelular = contInstancias;
        contInstancias++;
    }

    public Celular(String modelo, int nivelBateria){
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    private void setNivelBateria(int nivelBateria) {
        if (nivelBateria > 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        }
    }

    public void carregarBateria() {
        if (this.nivelBateria < 100) {
            this.nivelBateria++;
        }
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public String ligar() {
        if (this.nivelBateria > 0) {
            this.ligado = true;
            return "Celular ligado.";
        } else {
            return "Sem bateria!";
        }

    }

    private void setSom(int som) {
        this.som = som;
    }

    public int getIdCelular(){
        return this.idCelular;
    }

    public int getSom() {
        return som;
    }

    /*
     * O usuário somente poderá controlar o som e jogar se o celular estiver ligado.
     */

    public String aumentarVolume(int som) {
        if (this.nivelBateria > 0 && this.ligado == true) {
            if (som > 0 && som <= 100) {
                if ((this.som + som) > 100) {
                    this.som = 100;
                } else {
                    this.som += som;
                }
            } else {
                return "Valor inválido!";
            }
            return "Nivel de volume: " + getSom();
        } else {
            return "Volume máximo!";
        }
    }

    public String diminuirVolume(int som) {
        if (this.nivelBateria > 0 && this.ligado == true) {
            if (som > 0 && som <= 100) {
                if ((this.som - som) < 0) {
                    this.som = 0;
                } else {
                    this.som -= som;
                }
            } else {
                return "Valor inválido!";
            }
            return "Nivel de volume: " + getSom();
        } else {
            return "O volume está no mínimo!.";
        }
    }

    //altere o jogo para  poder jogar Pedra, Papel e Tesoura

    public int jogar(int escolhaJogador){
        Random numeroRandom = new Random();
        int escolhaPC = numeroRandom.nextInt(3);
        this.nivelBateria--;
        if(escolhaPC!=escolhaJogador){
            if((escolhaJogador==1 && escolhaPC==1) || (escolhaJogador==2 && escolhaPC==2) || (escolhaJogador==3 && escolhaPC==0)){
                return 0; //vitória
            } else{
                return 1; //derrota
            }
        } else{
            return 2; //empate
        }
}

    public String qtdCelular() {
        return String.format("Quantidade de Celulares: %d", contInstancias-1);
    }

    public String toString(){
        String mensagem = String.format("Modelo: %s\nID: %d\nNivel da batéria: %d%%\nVolume atual: %d\n", this.modelo, this.idCelular, this.nivelBateria, this.som);
        return mensagem;
    }
}
