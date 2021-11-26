/*Criar a classe professor Visitante que herda de horista e 
tem o nome da faculdade que ele está vinculado. 
*/

public class Visitante extends Horista {
	private String faculdade;
	
	public Visitante(String matricula, String nome, String dataNascimento, String dataContrato, double valorHora, double horasTrabalhadas, String faculdade) {
		super(matricula, nome, dataNascimento, dataContrato, valorHora, horasTrabalhadas);
		this.setFaculdade(faculdade);
	}

	public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public double salario() {
		return super.salario();
	}

}
