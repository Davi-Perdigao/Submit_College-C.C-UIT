/*
Implemente a classe Vendedor como subclasse da classe Empregado. Um determinado vendedor tem como atributos, 
para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorVendas (correspondente ao valor 
monetário dos artigos vendidos) e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento 
base do Vendedor). Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um 
vendedor é equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de 
teste adequado para esta classe.
*/

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		setValorVendas(valorVendas);
	}

	@Override
	public double calculoSalario() {
		double salarioLiquido = super.calculoSalario() + this.valorComissao();
		return salarioLiquido;
	}
	
	public double valorComissao() {
		double valorComissao = this.valorVendas * this.comissao;
		return valorComissao;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	
	public void setValorVendas(double valorVendas) {
		if(valorVendas>=0) {
			this.valorVendas = valorVendas;
		} else {
			this.valorVendas = 0;
		}
	}
	
	public double getComissao() {
		return comissao;
	}
	
	public void setComissao(double comissao) {
		if(comissao>0 && comissao<=100) {
			this.comissao = comissao/100;
		} else {
			this.comissao = 0;
		}
	}

	@Override
    public String toString() {
        return super.toString() + "Vendedor [comissao=" + comissao + ", valorVenda=" + valorVendas + ", salarioLiquido="+ calculoSalario() + ", comissao="+ getComissao() + "]\n";
    }
		
}