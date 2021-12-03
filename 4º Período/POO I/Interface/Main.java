import java.util.ArrayList;
import java.util.List;

/*
Teste o programa com pelo menos as seguintes operações:
Criar um array de pessoas, adicionar várias pessoas de vários tipos. Percorra
imprimindo o tipo e o nome da pessoa. Se for um cliente, imprimir também a
quantidade produtos adquiridos (instance of)
 
Criar um array de Prioridade, adicionar várias instancias e mostrar quais
estão autenticando.
*/

public class Main {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>();

        Engenheiro engenheiro = new Engenheiro("Jonathan", "Divinopolis", "G13", 2500d, 27, "12345");

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Oclus", 200d));
        produtos.add(new Produto("Blusa", 30d));
        produtos.add(new Produto("Calça", 129d));

        Cliente cliente = new Cliente("Fulano", "Itauna", true, produtos);

        Secretaria secretaria = new Secretaria("Felicia", "itauna", "S12", 2500d, Secretaria.INGLES);
        Motorista motorista = new Motorista("McQueen", "itauna", "M12", 2500d, 1234);
        Gerente gerente = new Gerente("Ciclano", "itauna", "G12", 2500d, Gerente.departamentos[1]);

        lista.add(engenheiro);
        lista.add(secretaria);
        lista.add(motorista);
        lista.add(gerente);
        lista.add(cliente);

        for (Pessoa p : lista) {
            System.out.println(p.mostraTipo());

            if (p instanceof Cliente) {
                Cliente aux = (Cliente) p;

                for (Produto prod : aux.getProdutos()) {
                    System.out.println("\t" + prod.getNome());
                }
            }
        }

        List<Prioridade> prioridades = new ArrayList<>();

        prioridades.add(secretaria);
        prioridades.add(gerente);
        prioridades.add(cliente);

        for (Prioridade p : prioridades) {
            if (p.autenticar()) {
                System.out.println(p.getClass().getSimpleName() + " Autenticado!");
            }
        }
    }
}