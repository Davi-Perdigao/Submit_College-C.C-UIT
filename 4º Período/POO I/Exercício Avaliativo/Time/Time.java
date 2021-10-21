/*Crie a classe Time que possua o nome do time, a série 
ue ele joga e o número de jogadores. As séries podem ser 
de A, B, C, D ou E. O números de jogadores é no máximo 22. 
Crie um construtor onde seja obrigatório inserir no momento 
da criação da instância o nome e a série do time. Faça o 
teste em outra classe cadastrando 2 times.
*/

public class Time
{
    
//nome do time, a série que ele joga e o número de jogadores
    private String nome;
    private String serie;
    private int numeroJogadores;

//construtor onde seja obrigatório inserir no momento da criação da instância o nome e a série do time

    public Time(String nome, String serie){
        setNome(nome);
        setSerie(serie);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

//As séries podem ser de A, B, C, D ou E

    private void setSerie(String serie) {
        char s = serie.charAt(0);
        s = Character.toUpperCase(s);
        
        switch(s){
            case 'A':
                this.serie = "A";
                break;
            case 'B':
                this.serie = "B";
                break;
            case 'C':
                this.serie = "C";
                break;
            case 'D':
                this.serie = "D";
                break;
            case 'E':
                this.serie = "E";
                break;
            default:
                this.serie = "Não informada.";
                break;
        } 
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        if(numeroJogadores>0 && numeroJogadores<=22){
            this.numeroJogadores = numeroJogadores;
        } else{
            this.numeroJogadores = 22; //O números de jogadores é no máximo 22
        }
    }
    
    public String toString(){
        String mensagem = String.format("NOME: %s\nSÉRIE: %s\nJOGADORES: %d", this.nome, this.serie, this.numeroJogadores);
        return mensagem;
    }
}