import java.util.ArrayList;
import java.util.Scanner;

public class Testa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Contato> agenda = new ArrayList<>();
        int opcao;

        do {
            menu();
            opcao = input.nextInt();
            input.nextLine();
            String nome, telefone, cidade;
            int i, escolha, idContato;
            switch (opcao) {
                case 1: // Adicionar
                    System.out.println("Nome: ");
                    nome = input.nextLine();
                    System.out.println("Telefone: ");
                    telefone = input.nextLine();
                    System.out.println("Cidade: ");
                    cidade = input.nextLine();
                    Contato contato = new Contato(nome, telefone, cidade);
                    agenda.add(contato);
                    break;
                case 2: // Remover
                    System.out.println("1 - Nome OU 2 - ID");
                    escolha = input.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("Informe o nome do contato:");
                            String nomeRemover = input.nextLine();
                            for (i = 0; i < agenda.size(); i++) {
                                Contato contatos = agenda.get(i);
                                if (contatos.getNome().equals(nomeRemover)) {
                                    agenda.remove(contatos);
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Informe o ID:");
                            idContato = input.nextInt();
                            contato = agenda.get(idContato - 1);
                            agenda.remove(contato);
                            break;
                    }

                case 3: // Ativar
                    System.out.println("1 - Nome OU 2 - I]");
                    escolha = input.nextInt();
                    input.nextLine();
                    switch (escolha) {
                        case 1:
                            System.out.println("Informe o nome: ");
                            nome = input.nextLine();
                            for (i = 0; i < agenda.size(); i++) {
                                contato = agenda.get(i);
                                if (contato.getNome().equals(nome)) {
                                    contato.ativarContato();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Informe o ID:");
                            idContato = input.nextInt();
                            contato = agenda.get(--idContato);
                            contato.ativarContato();
                            break;
                    }
                    break;
                case 4: // Bloquear
                    System.out.println("1 - Nome OU 2 - ID");
                    escolha = input.nextInt();
                    input.nextLine();
                    switch (escolha) {
                        case 1:
                            System.out.println("Informe o nome: ");
                            nome = input.nextLine();
                            for (i = 0; i < agenda.size(); i++) {
                                contato = agenda.get(i);
                                if (contato.getNome().equals(nome)) {
                                    contato.bloquearContato();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Informe o ID:");
                            idContato = input.nextInt();
                            contato = agenda.get(--idContato);
                            contato.bloquearContato();
                            break;
                    }
                    break;
                case 5: // Buscar
                    System.out.println("Informe o nome: ");
                    String nomeBusca = input.nextLine();
                    for (i = 0; i < agenda.size(); i++) {
                        Contato contatoBusca = agenda.get(i);
                        if (contatoBusca.getNome().equals(nomeBusca)) {
                            System.out.println(contatoBusca);
                            i = agenda.size();
                        }
                    }
                    break;
                case 6: // Listar
                    for (i = 0; i < agenda.size(); i++) {
                        contato = agenda.get(i);
                        if (contato.getAtivo()) {
                            System.out.println(contato);
                        }
                    }
                    break;
                case 7: // Listar (categoria)
                    System.out.println("1 - Nome OU 2 - Cidade");
                    escolha = input.nextInt();
                    switch (escolha) {
                        case 1:
                            System.out.println("Informe o nome: ");
                            nome = input.nextLine();
                            input.nextLine();
                            for (i = 0; i < agenda.size(); i++) {
                                contato = agenda.get(i);
                                if (contato.getNome().equals(nome) && contato.getAtivo()) {
                                    System.out.println(contato.toString());
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Informe a cidade: ");
                            cidade = input.nextLine();
                            input.nextLine();
                            for (i = 0; i < agenda.size(); i++) {
                                contato = agenda.get(i);
                                if (contato.getCidade().equals(cidade) && contato.getAtivo()) {
                                    System.out.println(contato.toString());
                                }
                            }
                            break;
                    }
                    break;
                case 8: // Listar (bloqueados)
                    for (i = 0; i < agenda.size(); i++) {
                        contato = agenda.get(i);
                        if (contato.getAtivo() == false) {
                            System.out.println(contato);
                        }
                    }
                    break;
                case 9: // Limpar
                    agenda.clear();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        input.close();
    }

    public static void menu() {
        System.out.println("---MENU---");
        System.out.println("0 - Finalizar tarefa");
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Remover contato");
        System.out.println("3 - Ativar contato");
        System.out.println("4 - Bloquear contato");
        System.out.println("5 - Buscar contato");
        System.out.println("6 - Listar contatos");
        System.out.println("7 - Listar por categoria");
        System.out.println("8 - Listar bloqueados");
        System.out.println("9 - Limpar agenda");

    }
}