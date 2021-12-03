/*
Crie uma classe Funcionario que herda de Pessoa com as seguintes
propriedades: codigo e salário. Implemente os métodos getters e setters.
*/

public class Funcionario extends Pessoa {
    private String codigo;
    private Double salario;

    public Funcionario(String nome, String endereco, String codigo, Double salario) {
        super(nome, endereco);
        this.codigo = codigo;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String mostraTipo() {
        return null;

    }

}