import java.util.Scanner;
//Faça o teste em outra classe cadastrando 2 times
public class Main {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        Time time[] = new Time[2];

        String nome, serie;
        int numeroJogadores, i = 0;

        for(i = 0; i<time.length; i++){
            System.out.printf("%dº TIME \n", i+1);

            System.out.print("Informe o nome: ");
            nome = entrada.nextLine();

            System.out.print("Informe a serie (A, B, C, D ou E): ");
            serie = entrada.nextLine();

            time[i] = new Time(nome, serie);

            System.out.print("Informe o número de jogadores (máximo 22, sujeito a exclusão de atletas): ");
            numeroJogadores = entrada.nextInt();
            entrada.nextLine();

            time[i].setNumeroJogadores(numeroJogadores);
        }

        for(i = 0; i<time.length; i++){
            System.out.printf("\n%dº TIME\n", i+1);
            System.out.println(time[i]);
        }
    }
}