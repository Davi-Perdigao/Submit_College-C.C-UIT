/*
Escreva uma classe Principal que possui um array de inteiros de tamanho 10. 
Preencha este vetor com números aleatórios. Após receber os números, escreva 
os mesmos de forma ordenada. 
*/

import java.util.Random; //Objeto gerador de número aleatório
import java.util.Arrays;

public class Principal {
    
    public static void main(String[] args){
        int i;
        Random numeroRandom = new Random(); //Produz estes números em resposta a solicitações
        int[] vet = new int[10]; //array de inteiros de tamanho 10

        for(i=0; i<vet.length; i++){ //Preenchendo este vetor com números aleatórios
            vet[i]=numeroRandom.nextInt(1000); 
        }

        System.out.println("Numeros aleatorios:"); //recebendo números
        System.out.println(Arrays.toString(vet));

        Arrays.sort(vet); //Classificando lista de dados. Um inteiro será classificado numericamente em ordem crescente

        System.out.println("Numeros ordenados:"); //ordenando números
        System.out.println(Arrays.toString(vet));
    }
}