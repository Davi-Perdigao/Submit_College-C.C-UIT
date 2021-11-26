/*Criar a classe professor Horista que recebe um valor por 
hora trabalhada; 
*/

public class Horista extends Professor{
    private double valorHora;
	private double horasTrabalhadas;
	
	public Horista(String matricula, String nome, String dataNascimento, String dataContrato, double valorHora, double horasTrabalhadas) {
		super(matricula, nome, dataNascimento, dataContrato);
		setValorHora(valorHora);
		setHorasTrabalhadas(horasTrabalhadas);
	}
	
	public double salario() {
		return this.valorHora*this.horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		if(valorHora>=1) {
			this.valorHora = valorHora;
		} else {
			this.valorHora = 1;
		}	
	}

	public double getHorastrabalhadas() {
		return this.horasTrabalhadas;
	}


	public void setHorasTrabalhadas(double horasTrabalhadas) {
		if(horasTrabalhadas>=0) {
			this.horasTrabalhadas = horasTrabalhadas;
		} else {
			this.horasTrabalhadas = 0;
		}
		
	}
}
