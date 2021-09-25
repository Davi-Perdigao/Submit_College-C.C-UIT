/*Refazer o exercício do elevador da prova para ele 
não poder subir ou descer sem pessoas dentro do elevador. 
Modifique as opções para que possa escolher quantos andares 
subir ou descer e quantas pessoas irão entrar ou sair 
através de sobrecarga.
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
        if(this.pessoasNoElevador<this.capacidadeElevador){
            this.pessoasNoElevador++;
        }
    }

    public void Entrar(int quantidadePessoas){
        if(this.pessoasNoElevador<this.capacidadeElevador){
            if(this.pessoasNoElevador+quantidadePessoas <= this.capacidadeElevador){
                this.pessoasNoElevador += quantidadePessoas;
            }
        }
    }
    
    public void Sair(){
        if(this.pessoasNoElevador>0){
            this.pessoasNoElevador--;
        }
    }

    public void Sair(int quantidadePessoas){
        if(this.pessoasNoElevador>0){
            if(this.pessoasNoElevador-quantidadePessoas >= 0){
                this.pessoasNoElevador -= quantidadePessoas;
            } else{
                this.pessoasNoElevador = 0;
            }
        }
    }

    public void Subir(){
        if(this.andarAtual<this.capacidadeElevador){
            this.andarAtual++;
        }
    }

    public void Subir(int andar){
        if(andar<=this.capacidadeElevador && this.andarAtual<andar){
            this.andarAtual = andar; 
        }
    }


    public void Descer(){
        if(this.andarAtual!=0){
            this.andarAtual--;
        }
    }

    public void Descer(int andar){
        if(this.andarAtual!=0 && andar<=this.capacidadeElevador && this.andarAtual>andar){
                this.andarAtual = andar;
        }
    }

    public String Infos() {
        String mensagem = String.format("Pessoas no elevador: %d\nAndar atual: %d\nTotal de andares: %d\nCapacidade: %d\n", this.pessoasNoElevador, this.andarAtual, this.totalAndares, this.capacidadeElevador);
        return mensagem;
    }

    public int getAndarAtual() {
        return andarAtual;
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

}