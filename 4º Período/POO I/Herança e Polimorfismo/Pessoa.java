/*
Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores 
(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções 
de construtores conforme sua percepção. Atributos: String nome; String endereço; String telefone;
*/

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	
	public Pessoa(String nome, String endereco, String telefone) {
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
	}

	public Pessoa(String nome) {
        setNome(nome);
    }

    public Pessoa(String nome, String endereco) {
        setNome(nome);
        setEndereco(endereco);
    }

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa[Nome=" + nome + ", Endereco=" + endereco + ", Telefone=" + telefone + "]\n";
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}