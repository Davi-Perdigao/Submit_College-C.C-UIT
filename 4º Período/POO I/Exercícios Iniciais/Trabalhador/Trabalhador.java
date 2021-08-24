public class Trabalhador
{
    private int matricula;
    private String nome;
    private double salario;

    public void setMatricula(int matricula)
    {
        this.matricula = matricula;
    }

    public int getMatricula()
    {
        return this.matricula;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setSalario(double salario)
    {
        if(salario>=1100){
            this.salario = salario;
        } else{
            this.salario = 1100;
        }
    }

    public double getSalario()
    {
        return this.salario;
    }

    public String imprimirDados()
    {
        return "\nMatricula: " + getMatricula() +
                "\nNome: " + getNome() +
                "\nSalário(R$): " + getSalario();
    }
}
