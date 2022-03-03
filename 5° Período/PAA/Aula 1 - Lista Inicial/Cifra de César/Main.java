/*Júlio César usava um sistema de criptografia, agora conhecido como Cifra de César, 
que trocava cada letra pelo equivalente em duas posições adiante no alfabeto (por exemplo, 
'A' vira 'C', 'R' vira 'T', etc.). Ao final do alfabeto nós voltamos para o começo, isto é 'Y' 
vira 'A'. Nós podemos, é claro, tentar trocar as letras com quaisquer número de posições.

Entrada
A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N 
que indica a quantidade de casos de teste. Cada caso de teste é composto por duas linhas. 
A primeira linha contém uma string com até 50 caracteres maiúsculos ('A'-'Z'), que é a sentença 
após ela ter sido codificada através desta Cifra de César modificada. A segunda linha contém um 
número que varia de 0 a 25 e que representa quantas posições cada letra foi deslocada para a direita.

Saída
Para cada caso de teste de entrada, imprima uma linha de saída com o texto decodificado 
(transformado novamente para o texto original) conforme as regras acima
*/

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