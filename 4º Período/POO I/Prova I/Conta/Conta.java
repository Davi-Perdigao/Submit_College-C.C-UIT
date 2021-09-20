/*Reescreva as classes Conta e TestaConta aplicando o 
encapsulamento dos atributos da classe Conta, ou seja, 
modificando o acesso dos mesmos para apenas a própria 
classe e criando métodos de acesso.
*/

public class Conta {

    private String titular;
    private int numero;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
