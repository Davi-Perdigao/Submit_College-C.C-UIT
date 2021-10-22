import java.util.Set;

public class Aluno {
    
    private String nome;
    private Sexo sexo;
    private int nota;

    public Aluno(String nome, int nota, Sexo sexo){
        setNome(nome);
        setNota(nota);
        this.sexo = sexo;
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nNota: " + this.nota +
                "\nSexo: " + this.sexo;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}