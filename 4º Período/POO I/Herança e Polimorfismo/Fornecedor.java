/*
Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. Considere 
que cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os atributos 
LimiteCredito (correspondente ao crédito máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com 
o fornecedor). Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método 
ObterSaldoRestante() que devolve quanto ainda se pode comprar à prazo com o fornecedo. Depois de implementada a classe 
Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na 
classe Fornecedor e os herdados da classe Pessoa. Os métodos get e set são adequados? O valor da Dívida deve ser alterado 
ou incrementado? Pense nestas situações neste e nos demais exercícios
*/
public class Fornecedor extends Pessoa{
	private double limiteCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, String telefone, double limiteCredito, double valorDivida) {
		super(nome, endereco, telefone);
		setLimiteCredito(limiteCredito);
		setValorDivida(valorDivida);
	}
	
	public double obterSaldoRestante() {
		double saldoRestante = this.limiteCredito - this.valorDivida;
		return saldoRestante;
	}

	@Override
	public String toString() {
		String mensagem = super.toString() + String.format("Limite Credito: %.2f\nValor divida: %.2f\nSaldo restante: %.2f\n", this.limiteCredito, this.valorDivida, this.obterSaldoRestante());
		return mensagem;
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	private void setLimiteCredito(double limiteCredito) {
		if(limiteCredito>=0) {
			this.limiteCredito = limiteCredito;
		} else {
			this.limiteCredito = 0;
		}
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		if(valorDivida>=0 && valorDivida<=this.limiteCredito) {
			this.valorDivida = valorDivida;
		} else {
			this.valorDivida = this.limiteCredito;
		}
		
	}
	
}