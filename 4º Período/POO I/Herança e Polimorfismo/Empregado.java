/*
Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada instância da classe Empregado 
tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro), salarioBase 
(vencimento base) e imposto (porcentagem retida dos impostos). Implemente a classe Empregado com métodos seletores 
e modificadores e um método calcularSalario. Escreva um programa de teste adequado para a classe Empregado. Existem 
métodos para realizar aumento de salário? Por valor ou percentual?
*/

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	
	public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
			double imposto) {
		super(nome, endereco, telefone);	
		setCodigoSetor(codigoSetor);
		setSalarioBase(salarioBase);
		setImposto(imposto);
	}
	
	public double calculoSalario() {
		double salarioLiquido = this.salarioBase - (this.salarioBase * this.imposto);
		return salarioLiquido;
	}
	
	@Override
	public String toString() {
		return "Empregado [Codigo Setor=" + codigoSetor + ", Salario Base=" + salarioBase + ", Imposto=" + imposto + "]";
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}
	
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase) {
		if(salarioBase>=1100) {
			this.salarioBase = salarioBase;
		} else {
			this.salarioBase = 1100;
		}
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public void setImposto(double imposto) {
		if(imposto>0) {
			this.imposto = imposto/100;
		} else {
			this.imposto = 0;
		}
	}
	
}