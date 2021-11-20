/*Implemente a classe Administrador como subclasse da classe Empregado. Um determinado administrador tem 
como atributos, para além dos atributos da classe Pessoa e da classe Empregado, o atributo ajudaDeCusto 
(ajudas referentes a viagens, estadias, ...). Note que deverá redefinir na classe Administrador o método 
herdado calcularSalario (o salário de um administrador é equivalente ao salário de um empregado usual acrescido 
das ajuda de custo). Escreva um programa de teste adequado para esta classe.
*/

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		setAjudaDeCusto(ajudaDeCusto);
	}
	
	@Override
	public double calculoSalario() {
		double salarioLiquido = super.calculoSalario() + this.ajudaDeCusto;
		return salarioLiquido;
	}
	
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		if(ajudaDeCusto>=0) {
			this.ajudaDeCusto = ajudaDeCusto;
		} else {
			this.ajudaDeCusto = 0;
		}		
	}

	@Override
    public String toString() {
        return super.toString() + "Administrador [ajudaDeCusto=" + ajudaDeCusto + ", salarioLiquido="+ calculoSalario() +"]\n";
    }
	
}