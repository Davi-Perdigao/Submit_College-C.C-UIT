import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtd = 0;
        char[] alfabeto = new char []{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        int count = entrada.nextInt();
        entrada.nextLine();
        int qtdVoltar = entrada.nextInt();
        entrada.nextLine();
        while(qtd<count){
            String nome = entrada.nextLine();
            char[] newPalavra = nome.toCharArray();

            for(int i=0;i<newPalavra.length;i++){
                for (int j=0;j<alfabeto.length;j++){
                    if (newPalavra[i] == alfabeto[j]){
                        if ((j - qtdVoltar)<0){
                            int aux = qtdVoltar - j;
                            System.out.println("N" + aux);
                            newPalavra[i] = alfabeto[alfabeto.length - aux];

                        }else{
                            newPalavra[i] = alfabeto [j-qtdVoltar];
                        }
                    }
                }
            }
            for(char c : newPalavra){
                System.out.println(c);
            }
            System.out.println();
            qtd++;
        }
    }
}