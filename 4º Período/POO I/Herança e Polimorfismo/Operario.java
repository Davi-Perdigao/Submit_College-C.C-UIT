/*Implemente a classe Operario como subclasse da classe Empregado. Um determinado operário tem como 
atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo valorProducao 
(que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário) e comissao 
(que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário). 
Note que deverá redefinir nesta subclasse o método herdado calcularSalario (o salário de um operário é 
equivalente ao salário de um empregado usual acrescido da referida comissão). Escreva um programa de teste 
adequado para esta classe.
*/

public class Operario extends Empregado{
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		setValorProducao(valorProducao);
		setComissao(comissao);
	}
	
	@Override
	public double calculoSalario() {
		double salarioLiquido = super.calculoSalario() + this.comissao;
		return salarioLiquido;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

	public void setValorProducao(double valorProducao) {
		if(valorProducao>=0) {
			this.valorProducao = valorProducao;
		} else {
			this.valorProducao = 0;
		}
	}

	@Override
    public String toString() {
        return super.toString() + "Operario [comissao=" + comissao + ", valorProducao=" + valorProducao + ", salarioLiquido="+ calculoSalario() +", comissao="+ getComissao() +"]\n";
    }
	
}