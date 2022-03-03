import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int qtd = entrada.nextInt();
        entrada.nextLine();
        String[] novasPalavras = new String[qtd];
        
        for(int i=0; i<qtd; i++){
            String palavra = entrada.nextLine();
            int chave = entrada.nextInt();
            entrada.nextLine();
            
            for(int j=0; j<palavra.length(); j++){
                if (palavra.charAt(j) >= 65 && palavra.charAt(j) <= 90) {
                    if (palavra.charAt(j) - chave < 65) {
                        char x = (char)(palavra.charAt(j) - chave);
                        char y = (char)(x + 90);
                        char letra = (char)(y - 64);
                        
                        if(j==0){
                            String letraConvertida1 = Character.toString(letra);
                            novasPalavras[i] = letraConvertida1;
                        } else{
                            novasPalavras[i] += letra;
                        }
                    } else {
                            char letra=(char)(palavra.charAt(j) -chave);
                            
                            if(j==0){
                                String letraConvertida=Character.toString(letra);
                                novasPalavras[i] = letraConvertida;
                            } else{
                                novasPalavras[i] += letra;
                            }
                        }
                    }
                }
            }
            for(String c : novasPalavras){
                System.out.println(c);
            }
        }
    }