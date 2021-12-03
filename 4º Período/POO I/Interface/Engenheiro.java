/*
A seguir, crie a classe Engenheiro que herda de Funcionario com as seguintes
propriedades, número do CREA;
*/

public class Engenheiro extends Funcionario {
    private int numeroCrea;

    public Engenheiro(String nome, String endereco, String codigo, Double salario, int numero, String crea) {
        super(nome, endereco, codigo, salario);
        this.numeroCrea = numeroCrea;
    }

    @Override
    public String mostraTipo() {
        return "Engenheiro";
    }

    public int getNumeroCrea() {
        return numeroCrea;
    }

    public void setNumeroCrea(int numeroCrea) {
        this.numeroCrea = numeroCrea;
    }

}