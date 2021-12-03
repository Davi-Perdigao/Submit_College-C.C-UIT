/*
Crie a classe Motorista que herda de Funcionario com as seguintes
propriedades, número da CNH (Carteira Nacional de Habilitação);
*/

public class Motorista extends Funcionario {
    private int numeroCNH;

    public Motorista(String nome, String endereco, String codigo, Double salario, int numeroCNH) {
        super(nome, endereco, codigo, salario);
        this.numeroCNH = numeroCNH;
    }

    public int getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(int numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

}