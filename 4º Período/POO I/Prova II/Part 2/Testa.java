/*Criar a classe pessoa com os atributos id, nome, altura, peso. 
Métodos Imc e outros a sua escolha.

Criar a classe testa com o método main com o seguinte menu. 
Lembrando que os dados devem ser manipulados em arquivo texto.

Cadastrar pessoa
Mostrar dados da pessoa buscando pelo id
Mostrar pessoas acima do peso

Obs. Os métodos de mostrar deverão buscar os dados do arquivo, 
instanciar em uma pessoa e apresentar os dados pelo método toString.
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Testa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc;
        String arquivo = "dados.txt";
        ArrayList<Pessoa> grupo = new ArrayList<Pessoa>();

        do {
            menu();
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
            case 0:
                System.out.println("Finalizando...");
                break;
            case 1: //Cadastrar pessoa
                System.out.println("Informe o ID: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("Nome: ");
                String nome = input.nextLine();
                System.out.println("Altura: ");
                double altura = input.nextDouble();
                System.out.println("Peso: ");
                double peso = input.nextDouble();

                Pessoa pessoa = new Pessoa(id, nome, altura, peso);
                grupo.add(pessoa);

                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
                    bw.write(pessoa.toString() + "\n");
                    bw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Testa.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 2: //Mostrar dados da pessoa buscando pelo id
                System.out.println("Informe o ID: ");
                int idPesquisa = input.nextInt();

                try {
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    while (br.ready()) {
                        String linha = br.readLine();
                        String elemento[] = linha.split(";");
                        if (Integer.parseInt(elemento[0]) == idPesquisa) {
                            Pessoa p = grupo.get(idPesquisa - 1);
                            System.out.print(p.toString());
                        }
                    }
                    br.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Testa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Testa.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case 3: //Mostrar pessoas acima do peso
                for (int i = 0; i < grupo.size(); i++) {
                    Pessoa p = grupo.get(i);
                    if (p.calcularIMC() >= 25) {
                        System.out.println(p);
                    }
                }
                break;
            }
        } while (opc != 0);
        input.close();
    }

    public static void menu() {
        System.out.println("--MENU--");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar pessoa");
        System.out.println("2 - Buscar por ID");
        System.out.println("3 - Mostrar pessoas acima do peso");
    }
}