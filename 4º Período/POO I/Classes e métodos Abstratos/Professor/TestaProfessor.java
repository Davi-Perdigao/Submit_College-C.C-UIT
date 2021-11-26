/*Criar a classe testaProfessor que contem uma coleção de professores. 
Insira professores de todos os tipos e percorra esta coleção mostrando 
o nome e salário de cada um deles. 
*/

public class TestaProfessor {

	public static void main(String[] args) {
		Professor[] professor = new Professor[3];
		professor[0] = new DedicacaoExclusiva("1", "Stark", "01/10/1963", "15/09/2005", 2500);
		professor[1] = new Horista("2", "Wayne", "02/10/1975", "02/10/1999", 17, 44);
		professor[2] = new Visitante("3", "Parker", "03/10/1970", "03/10/2002", 25, 88, "UIT");
		
		for(Professor prof : professor) {
			System.out.println("Nome: " + prof.getNome() + "\nSalário: " + prof.salario() + "\n");
			
		}

	}

}