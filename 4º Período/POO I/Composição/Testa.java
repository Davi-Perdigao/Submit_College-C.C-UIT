/*Crie uma classe aluno com atributos e métodos a 
sua escolha, mas que um deles seja a nota do aluno 
no semestre e outro seja o sexo do aluno, que somente 
poderá ser Masculino ou Feminino (Você deverá utilizar 
obrigatoriamente tipos enumerados). Deverá ter também 
uma classe sala que possui atributos e métodos a sua 
escolha mas um deles deve ser uma coleção de alunos.
Crie uma classe de testes que deverá conter um menu para 
trabalhar com salas e alunos. Adicionando, removendo, retornando 
o melhor aluno por exemplo, etc. Veja que o método de incluir aluno, 
mostrar, etc, deve estar em sala e não em testa.
*/

import java.util.Scanner;

public class Testa {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcaoMenu;

        do{
            Sala alunos = new Sala();
            Sexo sexo = null;
            String nome;
            int nota, sexoOpcao;
            
            menu();
            opcaoMenu = entrada.nextInt();
            entrada.nextLine();
            switch(opcaoMenu){
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    System.out.println("Informe o nome:");
                    nome = entrada.nextLine();
            
                    System.out.println("Informe a nota:");
                    nota = entrada.nextInt();
                    
                    do{
                        System.out.println("1 - Masculino  ou  2 - Feminino");
                        sexoOpcao= entrada.nextInt();
            
                        switch(sexoOpcao){
                            case 1:
                                sexo = Sexo.valueOf("Masculino");
                                break;
                            case 2:
                                sexo = Sexo.valueOf("Feminino");
                                break;
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }      
                    }while(sexoOpcao<0 || sexoOpcao>2);

                    Aluno aluno = new Aluno(nome, nota, sexo);
                    alunos.adicionarAluno(aluno);
                    break;
                case 2:
                    System.out.println("Informe o nome:");
                    String nomeRemocao = entrada.nextLine();
                    alunos.removerAluno(nomeRemocao);
                    break;
                case 3:
                    alunos.exibirAlunos();
                    break;
                default:
                    System.out.println("Por favor, informe uma opção valida");
                    break;
            }
        }while(opcaoMenu!=0);
        entrada.close();
    }

    public static void menu(){
        System.out.println("--MENU--");
        System.out.println("0 - Sair");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Exibir");
    }
}
