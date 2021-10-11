/*
Criar um arraylist de string chamado contatinhos.
Criar um menu para: inserir contatos, remover contatos pelo nome,
mostrar a quantidade de contatos listar todos contatos.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Contatinhos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> contatinhos = new ArrayList<>();
        int op = 0;
        do {
            System.out.println("\n\t---MENU---" + "\n0 - Sair" + "\n1 - Inserir contato" + "\n2 - Remover contato"
                    + "\n3 - Mostrar quantidade da lista" + "\n4 - Listar todos os contatos");

            op = input.nextInt();

            switch (op) {
                case 1: //Inserir Contatos
                    System.out.println("Informe o nome que deseja adicionar");
                    contatinhos.add(input.next());
                    break;

                case 2: //Remover Contatos
                    System.out.println("Informe o nome que deseja remover");
                    contatinhos.remove(input.next());
                    break;

                case 3://Mostrar quantidade de contatinhos
                    System.out.println("Totoal de: " + contatinhos.size() + " contatinhos!");
                    break;

                case 4://Listar todos os contatos
                    int i=0; 
                    for (String contato : contatinhos) {
                        System.out.printf("\n%d - %s", i, contato);
                        i++;
                    }
            }
        break;
        }
    while(op!=0);
    input.close();
    }
}