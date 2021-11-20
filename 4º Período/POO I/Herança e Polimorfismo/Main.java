/*
Os testes realizados em cada exercício acima consideraram salário negativo, dívidas negativas etc? Se não, 
refaça-os corrigindo estas inconsistências. Crie uma classe teste onde o usuário pode realizar alterações através 
de menus. Alterar vendas, modificar salários, etc.

Agora, com todas classes prontas e testadas, crie um programa que tenha uma coleção de empregados que deverão ser 
inseridos através de menu. O programa deverá ter opções para mostrar o calculo do salário, mostrar comissão e outros 
métodos que achar adequado.
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static Scanner entrada = new Scanner(System.in);
	static ArrayList<Empregado> empregados = new ArrayList<Empregado>();
	
	public static void main(String[] args) {
		
		int opcMenu, opcMenu2;
		String nomeBusca;
		
		do {
			System.out.println("--MENU--");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar novo empregado");
			System.out.println("2 - Alterar vendas");
			System.out.println("3 - Alterar salário base");
			System.out.println("4 - Alterar impostos");
			System.out.println("5 - Buscar por nome");
			System.out.println("6 - Mostrar todos");
			
			opcMenu = entrada.nextInt();
			entrada.nextLine();
			
			switch(opcMenu) {
				case 1:
					System.out.println("Informe a opção");
					System.out.println("0 - Sair");
					System.out.println("1 - Administrador");
					System.out.println("2 - Operario");
					System.out.println("3 - Vendedor");
					
					opcMenu2 = entrada.nextInt();
					entrada.nextLine();
					
					switch(opcMenu2) {
						case 0:
							System.out.println("Finalizando...");
							break;
						case 1:
							criarAdministrador();
							break;
						case 2:
							criarOperario();
							break;
						case 3:
							criarVendedor();
							break;
						default:
							System.out.println("Opção invalida!");
							break;
					}
					break;
				case 2:
					double valorVendasChange;
					System.out.println("Nome: ");
					nomeBusca = entrada.nextLine();
					
					for(Empregado e : empregados) {
						if(e.getNome().equals(nomeBusca) && e instanceof Vendedor){
							System.out.println("Valor de vendas: ");
							valorVendasChange = entrada.nextDouble();
							((Vendedor)e).setValorVendas(valorVendasChange);	
						}
					}
					break;
				case 3:
					double novoSalarioBase;
					System.out.println("Nome: ");
					nomeBusca = entrada.nextLine();
					
					for(Empregado e : empregados) {
						if(e.getNome().equals(nomeBusca)) {
							System.out.println("Novo salário base: ");
							novoSalarioBase = entrada.nextDouble();
							e.setSalarioBase(novoSalarioBase);
						}
					}		
				case 4:
					double novaTaxaImposto;
					System.out.println("Nome: ");
					nomeBusca = entrada.nextLine();
					
					for(Empregado e : empregados) {
						if(e.getNome().equals(nomeBusca)) {
							System.out.println("Informe a nova taxa(%): ");
							novaTaxaImposto = entrada.nextDouble();
							e.setImposto(novaTaxaImposto);
						}
					}
					break;
				case 5:
					System.out.println("Nome: ");
					nomeBusca = entrada.nextLine();
					
					for(Empregado e : empregados){
						if(e.getNome().equals(nomeBusca)) {
							System.out.println(e);
						}
					}
					break;
					
				case 6:
					for(Empregado e : empregados) {
						System.out.println(e);
					}
					break;
			}
		}while(opcMenu!=0);
		
		entrada.close();
	}
	
	public static void criarAdministrador() {
		String nome, endereco, telefone;
		int codigoSetor;
		double salarioBase, taxaImposto, valorAjudaDeCusto;
		
		System.out.println("Nome: ");
		nome = entrada.nextLine();
		System.out.println("Endereço:");
		endereco = entrada.nextLine();
		System.out.println("Telefone:");
		telefone = entrada.nextLine();
		System.out.println("Codigo do setor: ");
		codigoSetor = entrada.nextInt();
		System.out.println("Salario base:");
		salarioBase = entrada.nextDouble();
		System.out.println("Percentual de Taxa de impostos: ");
		taxaImposto = entrada.nextDouble();
		System.out.println("Valor ajuda de custo: ");
		valorAjudaDeCusto = entrada.nextDouble();
		
		Administrador administrador = new Administrador(nome, endereco, telefone, codigoSetor, salarioBase, taxaImposto, valorAjudaDeCusto);
		empregados.add(administrador);
	}
	
	public static void criarOperario() {
		String nome, endereco, telefone;
		int codigoSetor;
		double salarioBase, taxaImposto, valorProducao, comissao;
		
		System.out.println("Nome: ");
		nome = entrada.nextLine();
		System.out.println("Endereço:");
		endereco = entrada.nextLine();
		System.out.println("Telefone:");
		telefone = entrada.nextLine();
		System.out.println("Codigo do setor: ");
		codigoSetor = entrada.nextInt();
		System.out.println("Salario base:");
		salarioBase = entrada.nextDouble();
		System.out.println("Percentaul da taxa de impostos:");
		taxaImposto = entrada.nextDouble();
		System.out.println("Valor da produção: ");
		valorProducao = entrada.nextDouble();
		System.out.println("Percentual da taxa de comissão: ");
		comissao = entrada.nextDouble();
		
		Operario operario = new Operario(nome, endereco, telefone, codigoSetor, salarioBase, taxaImposto, valorProducao, comissao);
		empregados.add(operario);
	}
	
	public static void criarVendedor() {
		String nome, endereco, telefone;
		int codigoSetor;
		double salarioBase, taxaImposto, valorVendas;
		
		System.out.println("Nome: ");
		nome = entrada.nextLine();
		System.out.println("Endereço:");
		endereco = entrada.nextLine();
		System.out.println("Telefone:");
		telefone = entrada.nextLine();
		System.out.println("Codigo do setor: ");
		codigoSetor = entrada.nextInt();
		System.out.println("Salario base:");
		salarioBase = entrada.nextDouble();
		System.out.println("Percentual da taxa de impostos:");
		taxaImposto = entrada.nextDouble();
		System.out.println("Valor de vendas: ");
		valorVendas = entrada.nextDouble();
		System.out.println("Percentual da taxa de comissão: ");
		Vendedor vendedor = new Vendedor(nome, endereco, telefone, codigoSetor, salarioBase, taxaImposto, valorVendas);
		empregados.add(vendedor);
	}
}