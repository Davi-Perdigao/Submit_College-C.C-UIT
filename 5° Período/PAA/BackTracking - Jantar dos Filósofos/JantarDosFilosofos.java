import java.util.concurrent.Semaphore;

public class JantarDosFilosofos {
    private static final int N = 5;

    public static void main(String[] args) {
        // Cada garfo será um semaforo
        Semaphore[] garfo = new Semaphore[N];

        for (int i = 0; i < N; i++) {
            garfo[i] = new Semaphore(1);
        }

        // Cria os filosofos e inicia cada um executando a sua thread
        Filosofo[] filosofos = new Filosofo[5];

        for (int i = 0; i < N; i++) {
            filosofos[i] = new Filosofo(i, garfo[i], garfo[(i + 1) % N]);
            new Thread(filosofos[i]).start();
        }
    }
}