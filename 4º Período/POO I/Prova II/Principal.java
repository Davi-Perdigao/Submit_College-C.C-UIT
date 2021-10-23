/*
Escreva uma classe Principal que possui um array de inteiros de tamanho 10. 
Preencha este vetor com números aleatórios. Após receber os números, escreva 
os mesmos de forma ordenada. 
*/

import java.util.Random;
import java.util.Arrays;

public class Principal {
    
    public static void main(String[] args){
        int i;
        Random numeroRandom = new Random();
        int[] vet = new int[10];

        for(i=0; i<vet.length; i++){
            vet[i]=numeroRandom.nextInt(1000);
        }

        System.out.println("Numeros aleatorios:");
        System.out.println(Arrays.toString(vet));

        Arrays.sort(vet);

        System.out.println("Numeros ordenados:");
        System.out.println(Arrays.toString(vet));
    }
}