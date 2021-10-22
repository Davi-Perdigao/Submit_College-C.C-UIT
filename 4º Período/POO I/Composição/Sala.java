import java.util.ArrayList;

public class Sala {
    private ArrayList<Aluno> alunos;

    public Sala(){
        alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removerAluno(String nome){
        for(Aluno x: alunos){
            if(x.getNome().equals(nome)){
                alunos.remove(x);     
            }
        }
    }

    public void exibirAlunos(){
        for(Aluno x: alunos){
            System.out.println(x);
        }
    }
}