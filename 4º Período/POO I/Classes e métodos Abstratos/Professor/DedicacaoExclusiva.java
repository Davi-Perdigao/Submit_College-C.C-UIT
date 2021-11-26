/*Criar a classe professor Dedicação Exclusiva que herda 
de professor e recebe um salário fixo; 
*/

public class DedicacaoExclusiva extends Professor {
    private double salario;
	
	public DedicacaoExclusiva(String matricula, String nome, String dataNascimento, String dataContrato, double salario) {
		super(matricula, nome, dataNascimento, dataContrato);
		this.salario = salario;
	}

	public double salario() {
		return this.salario;
	}

}