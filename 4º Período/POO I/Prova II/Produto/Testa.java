/*
Escreva uma classe Produto que contenha os atributos nome, qtdeAtual e qtdeMinima.
Esta classe deve conter, além dos métodos de acesso (get e set, nenhum parâmetro pode ser negativo), 
dois construtores, um que não passa parâmetros algum e outro que passe como parâmetros o valor dos 3 
atributos. Também deve conter o método:
- repoe(int qtde) [Este método aumenta o valor da qtdeAtual].
- toString() [Este método mostra as características do Produto].
Crie uma classe Loja que contenha os atributos nome e um arrayList de produtos. Além dos métodos de acesso, 
ela deve conter os seguintes métodos:
- mostraQuantidadeProdutos(); //Mostra todos produtos com as respectivas quantidades;
- mostraQuantidadeProdutos(String nome); //Mostra a quantidade de um produto específico;
- mostraProdutosAbaixoDoMinimo(); (Este exibe apenas os produtos que estão abaixo da quantidade mínima);
- totalProdutos(); (Este exibe o somatório de todos produtos da lista);
Crie uma classe Testa com um método main e um menu para interagir com a loja. 
- Faça testes e boa sorte!!!
 */

import java.util.Scanner;

public class Testa {

    public static void main(String[] args) {
        Loja loja = new Loja();
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("--MENU--"); //menu para interagir com a loja
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Mostrar Quantidade de Produtos");
            System.out.println("3 - Buscar Quantidade de um Produto");
            System.out.println("4 - Mostrar Produtos abaixo do minimo");
            System.out.println("5 - Mostrar Total de Produtos");
            opcao = input.nextInt();
            switch (opcao) {
            case 0:
                System.out.println("Finalizando...");
                break;
            case 1: //Entrando com nome, quantidade mínima e atual do produto
                input.nextLine();
                System.out.print("Informe o nome do Produto: ");
                String nome = input.nextLine();
                System.out.print("Quantidade Minima: ");
                int qtdeMinima = input.nextInt();
                System.out.print("Quantidade Atual: ");
                int qtdeAtual = input.nextInt();

                Produto produto = new Produto(nome, qtdeMinima, qtdeAtual);
                loja.adicionarProduto(produto);
                break;
            case 2: //Mostra todos produtos com as respectivas quantidades
                System.out.println("Quantidade de Produtos: "+loja.mostraQuantidadeProdutos());
                break;
            case 3: //Mostra a quantidade de um produto específico
                input.nextLine();
                System.out.print("Informe o nome do Produto: ");
                nome = input.nextLine();
                int quantidadeTotal = loja.mostraQuantidadeProdutos(nome);
                if (quantidadeTotal != -1) {
                    System.out.println("Quantidade total: " +quantidadeTotal);
                } else {
                    System.out.println("Sem Estoque!");
                }
                break;
            case 4: //Este exibe apenas os produtos que estão abaixo da quantidade mínima
                System.out.println("Produtos abaixo do Minimo: "+loja.mostraProdutosAbaixoDoMinimo());
                break;
            case 5: //Este exibe o somatório de todos produtos da lista
                System.out.println("Total de Produtos: " +loja.totalProdutos());
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
            }
        } while (opcao != 0);
        input.close();
    }
}