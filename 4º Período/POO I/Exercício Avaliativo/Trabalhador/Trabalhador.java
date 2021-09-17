/*
 * Crie a classe Trabalhador com os atributos matrícula, nome e salário. Crie uma outra classe
 * com o método main e peça ao usuário para cadastrar 3 trabalhadores. Lembre-se que ninguém
 * pode ganhar menos que um salário mínimo. 
 */

public class Trabalhador
{
    private String matricula;
    private String nome;
    private double salario;

    private final Double salarioMinimo = 1147d;

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public String getMatricula()
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

    public void setSalario(Double salario) {
        if(salario >= salarioMinimo) {
          this.salario = salario;
        } else {
          System.out.println("Trabalhador não deve receber menos que um salário mínimo.");
        }
      }

    public double getSalario()
    {
        return this.salario;
    }

    public Trabalhador(String matricula, String nome, Double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
      }

    public Trabalhador() {
    }
}