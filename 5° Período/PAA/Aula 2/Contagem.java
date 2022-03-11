/*Criar uma classe que inicializa um vetor e possui os seguintes métodos para preenchimento:
-Crescente
-Decrescente
-Aleatório
Obs: No método aleatório, utilizar a função de setar a semente antes do laço for, para que os resultados 
dos exercícios sejam os mesmos para todos alunos.*/

import java.util.Random;

public class Contagem {
    private int vetor[];
    public int Comparacoes;

    public Contagem(int tamanho) {
        vetor = new int[tamanho];
    }

    public void Crescente() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
    }

    public void Decrescente() {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor.length - i;
        }
    }

    public void Aleatorio(int semente) {
        Random random = new Random();
        random.setSeed(semente);
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(200);
        }
    }

    public int Sequencial(int j) {
        this.Comparacoes = 0;
        for (int i = 0; i < vetor.length; i++) {
            Comparacoes++;
            if (vetor[i] == 78) {
                return i;
            }
        }
        return -1;
    }

    public int BinariaCrescente(int valor) {
        int meio;
        int inicio = 0, fim = vetor.length - 1;
        this.Comparacoes = 0;
        while (inicio <= fim) {
            this.Comparacoes++;
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] < valor) {
                inicio = meio + 1;
            } else if (vetor[meio] > valor) {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public int BinariaDecrescente(int valor) {
        int meio;
        int inicio = 0, fim = vetor.length - 1;
        this.Comparacoes = 0;
        while (inicio <= fim) {
            this.Comparacoes++;
            meio = (inicio + fim) / 2;
            if (vetor[meio] == valor) {
                return meio;
            } else if (vetor[meio] > valor) {
                inicio = meio + 1;
            } else if (vetor[meio] < valor) {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public void MostrarArray() {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor);
        }
    }

    public int getComparacoes() {
        return this.Comparacoes;
    }

    public void Binaria(int i, int j) {
    }

}