import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int qtdCasos = entrada.nextInt();
        entrada.nextLine();
        String[] novasPalavras = new String[qtdCasos];

        for (int i = 0; i < qtdCasos; i++) {
            String mens = entrada.nextLine();
            int chave = entrada.nextInt();
            entrada.nextLine();

            for (int j = 0; j < mens.length(); j++) {
                if (mens.charAt(j) >= 65 && mens.charAt(j) <= 90) {
                    if (mens.charAt(j) + chave > 90) {
                        if (j == 0) {
                            char x = (char) (mens.charAt(j) + chave);
                            char y = (char) (x - 90);
                            char letra = (char) (64 + y);
                            String letraConvertida1 = Character.toString(letra);
                            novasPalavras[i] = letraConvertida1;
                        } else {
                            char x = (char) (mens.charAt(j) + chave);
                            char y = (char) (x - 90);
                            char letra = (char) (64 + y);
                            novasPalavras[i] += letra;
                        }
                    } else {
                        char letra = (char) (mens.charAt(j) + chave);
                        if (j == 0) {
                            String letraConvertida = Character.toString(letra);
                            novasPalavras[i] = letraConvertida;
                        } else {
                            novasPalavras[i] += letra;
                        }
                    }
                }
            }
        }
        for (int it = 0; it < qtdCasos; it++) {
            System.out.println(novasPalavras[it]);
        }
    }
}