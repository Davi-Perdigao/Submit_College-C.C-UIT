import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        int nivelBateria, nivelSom, opcao, som;
        String modelo;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o modelo do celular: ");
        modelo = entrada.nextLine();
        System.out.println("Informe o nível da bateria: ");
        nivelBateria = entrada.nextInt();
        System.out.println("Informe o nível do som: ");
        nivelSom= entrada.nextInt();
        
        Celular celular1 = new Celular(modelo, nivelBateria, nivelSom);
        
        do{
            menu();
            opcao = entrada.nextInt();

            switch(opcao){
                case 1:
                    celular1.ligar();
                    break;
                case 2:
                    celular1.carregarBateria();
                    System.out.println("Bateria: " + celular1.getNivelBateria() + "%");
                    break;
                case 3:
                    if(celular1.getNivelBateria()>0 && celular1.isLigado()){
                        int valor, resultado;
                        do{
                            System.out.println("Jogo inicializado: PEDRA, PAPEL OU TESOURA");   
                            System.out.println("Qual será sua escolha? ");
                            System.out.println("0 - Pedra\n1 - Papel\n2 - Tesoura");

                            valor= entrada.nextInt();
                        }while(valor<0 || valor>2);
    
                        resultado = celular1.jogar(valor);

                        if(resultado==0){
                            System.out.println("Você perdeu :(");
                        } else if(resultado==1){
                            System.out.println("Você ganhou :)");
                        } else{
                            System.out.println("Empate :|");
                        }
                    } else{
                        System.out.println("Não foi possível jogar.");
                    }
                    break;
                case 4:
                    System.out.println("Informe o nível de volume que deseja aumentar: ");
                    som = entrada.nextInt();
                    celular1.aumentarVolume(som);
                    break;
                case 5:
                    System.out.println("Informe o nível de volume que deseja diminuir: ");
                    som = entrada.nextInt();
                    celular1.diminuirVolume(som);
                    break;
                case 6:
                    System.out.println(celular1);
                    break;
                case 7:
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while(opcao!=7);
        entrada.close();
    }

    public static void menu(){
        System.out.println("MENU:");
        System.out.println("1 - Ligar");
        System.out.println("2 - Recarregar");
        System.out.println("3 - Jogar");
        System.out.println("4 - Aumentar volume");
        System.out.println("5 - Diminuir volume");
        System.out.println("6 - Mostrar informações");
        System.out.println("7 - Sair");
    }
}
