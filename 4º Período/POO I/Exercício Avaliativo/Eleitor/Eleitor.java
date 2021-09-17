/*
 * Crie a classe Eleitor com os atributos idade, sexo, nome e numero do título. Faça um
 * método que retorne se a pessoa é Obrigada, Desobrigada ou impedida de votar. Crie outra
 * classe para testar. 
*/

public class Eleitor
{  
    private String nome;
    private String sexo;
    private int idade;
    private int titulo;

    public String getNome() {
        return nome;
      }
    
      public void setNome(String nome) {
        this.nome = nome;
      }

    public void setSexo(String sexo)
    {
            this.sexo = sexo;
    }

    public String getSexo()
    {
        return this.sexo;
    }

    public int getIdade()
    {
        return this.idade;
    }
    
    public void setIdade(int idade)
    {
        if(idade>0){
            this.idade = idade;
        }     
    }

    public int getTitulo()
    {
        return this.titulo;
    }

    public void setTitulo(int titulo)
    {
        this.titulo = titulo;
    }

    public String printEleitor()
    {
        String printEleitor = String.format("Nome: ", getNome(), "Sexo: ", getSexo(), "Idade: ", getIdade(), "Título: ", getTitulo());
        
        
        return "\nDados do Eleitor:\nNome: " + getNome() +
                "\nSexo: " + getSexo() +
                "\nIdade: " + getIdade() +
                "\nTitulo: \n" + getTitulo();
    }

    public String checarVotacao() // 16 / 18 / 65 anos
    {
        if(getIdade()<=15){
            return "Não pode votar!";
        } else if(getIdade()<=17 || getIdade()>=65){
            return "Voto permitido, porém não obrigatório!"; //facultativo
        } else{
            return "Voto obrigatório!";
        }
    }
}