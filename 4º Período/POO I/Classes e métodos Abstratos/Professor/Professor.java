/*Criar a classe professor com atributos matricula, nome, sexo, 
dataNascimento, dataContrato. Além dos métodos get e set, deverá conter 
um método que retorne a quantidade de anos que falta para o professor se 
aposentar que deverá considerar que para aposentar deve-se ter 65 anos de 
idade e 35 de atuação para homens e 60 anos de idade e 30 de atuação para 
mulheres. Criar o método abstrato salário que retorna quanto o professor recebe. 
*/

import java.util.Calendar;

public abstract class Professor {
	private String matricula;
	private String nome;
	private String sexo;
	private String dataNascimento;
	private String dataContrato;
	private int ano;
	
	public Professor(String matricula, String nome, String dataNascimento, String dataContrato) {
		setMatricula(matricula);
		setNome(nome);
		setDataNascimento(dataNascimento);
		setDataContrato(dataContrato);
		ano = Calendar.getInstance().get(Calendar.YEAR);
	}

    public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}

    public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		char sex = sexo.charAt(0);
		if(sex=='M') {
			this.sexo = "Masculino";
		} else if(sex=='F') {
			this.sexo = "Feminino";
		}
		
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getDataContrato() {
		return dataContrato;
	}
	
	public void setDataContrato(String dataContrato) {
		this.dataContrato = dataContrato;
	}	
	
	public int calculoAposentadoria() {
		if(sexo.equals("Masculino")) {
			if(calcularIdade()>=65&&calculoAtuacao()>=35) {
				return 0;
			} else if(calcularIdade()>=65&&calculoAtuacao()<35) {
				return 35-calculoAtuacao();
			} else {
				return 65-calcularIdade();
			}
		}

		if(sexo.equals("Feminino")) {
			if(calcularIdade()>=60&&calculoAtuacao()>=30) {
				return 0;
			} else if(calcularIdade()>=60&&calculoAtuacao()<30) {
				return 30-calculoAtuacao();
			} else {
				return 60-calcularIdade();
			}
		}
		return 0;	
		
	}
	
	public int calcularIdade() {
		String anoNascimento = this.dataNascimento.substring(6, 9);
		int idade = ano - Integer.parseInt(anoNascimento);
		return idade;
	}
	
	public int calculoAtuacao() {
		String anoContrato = this.dataContrato.substring(6,9);
		int tempoAtuacao = ano - Integer.parseInt(anoContrato);
		return tempoAtuacao;
	}
	
    public abstract double salario();
}