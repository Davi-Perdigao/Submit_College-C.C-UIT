/* - Crie uma classe denominada Elevador para armazenar as informações de um
elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio, excluindo o térreo, capacidade do elevador, e quantas pessoas estão presentes nele. A
classe deve também disponibilizar os seguintes métodos:
Inicializa(Construtor): que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Sobe: para subir um andar (não deve subir se já estiver no último andar);
Desce: para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).
*/

public class Elevador
{
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasNoElevador;

    public Elevador(int capacidadeElevador, int totalAndares){
        setCapacidadeElevador(capacidadeElevador);
        setTotalAndares(totalAndares);
        this.andarAtual = 0;
        this.pessoasNoElevador = 0;
    }

    public void Entrar(){
        if(getPessoasNoElevador() < this.capacidadeElevador){
            this.pessoasNoElevador ++;
        }
    }
    
    public void Sair(){
        if(getPessoasNoElevador() >= 1){
            this.pessoasNoElevador --;
        }
    }

    public void Subir(){
        if(getAndarAtual() < this.totalAndares){
            this.andarAtual ++;
        }
    }


    public void Descer(){
        if(getAndarAtual() >= 1){
            this.andarAtual --;
        }
    }


    public String Infos() {
        String mensagem = String.format("Pessoas no elevador: %d\nAndar atual: %d\nTotal de anadres: %d\nCapacidade: %d\n", this.pessoasNoElevador, this.andarAtual, this.totalAndares, this.capacidadeElevador);
        return mensagem;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    private void setTotalAndares(int totalAndares) {
        if(totalAndares>0){
            this.totalAndares = totalAndares;
        }  
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    private void setCapacidadeElevador(int capacidadeElevador) {
        if(capacidadeElevador>0){
            this.capacidadeElevador = capacidadeElevador;
        }
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void setPessoasnoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }
}