import java.util.Random;
import java.util.concurrent.Semaphore;

public class Filosofo implements Runnable {
    // Usado para definir por quanto tempo um filosofo pensa antes de comer e quanto
    // tempo ele fica comendo.
    private Random number = new Random();
    private int qtdComida = 10;

    // Utilizado para finalizar a execução do thread
    private boolean threadEstado;

    private final int id;
    private final Semaphore garfo_esquerdo;
    private final Semaphore garfo_direito;

    public Filosofo(int id, Semaphore garfo_esquerdo, Semaphore garfo_direito) {
        this.id = id;
        this.garfo_esquerdo = garfo_esquerdo;
        this.garfo_direito = garfo_direito;
        this.threadEstado = true;
    }

    // Ciclo infinito de cada filosofo, executado em threads separados
    @Override
    public void run() {
        try {
            while (threadEstado) {
                pensar();
                pegarGarfo_esquerdo();
                pegarGarfo_direito();
                comer();
                devolverGarfo();
            }
        } catch (InterruptedException e) {
            System.out.println("Filosofo " + id + "foi interrempido.\n");
        }
    }

    // Modelo de pensamento. Define um tempo aleatorio para o filosofo pensar
    private void pensar() throws InterruptedException {
        System.out.println("Filosofo " + id + " está pensando\n");
        // Tempo de execução
        Thread.sleep(number.nextInt(10));
    }

    // Analisa a quantidade de permissões para poder pegar o garfo esquerdo
    private void pegarGarfo_esquerdo() throws InterruptedException {
        if (garfo_esquerdo.availablePermits() == 0) {
            System.out.println("Filosofo " + id + " está ESPERANDO o garfo esquerdo.\n");
        }

        garfo_esquerdo.acquire();
        System.out.println("Filosofo " + id + " está SEGURANDO o garfo esquerdo\n");
    }

    // Analisa a quantidade de permissões para poder pegar o garfo direito
    private void pegarGarfo_direito() throws InterruptedException {
        if (garfo_direito.availablePermits() == 0) {
            System.out.println("Filosofo " + id + " está ESPERANDO o garfo direito.\n");
        }

        garfo_direito.acquire();
        System.out.println("Filosofo " + id + " está SEGURANDO o garfo direito\n");
    }

    // Define um tempo aleatorio para o filosofo comer
    private void comer() throws InterruptedException {
        if (this.qtdComida > 0) {
            System.out.println("Filoso " + id + " está COMENDO");
            this.qtdComida--;
            Thread.sleep(number.nextInt(10));
        } else {
            System.out.println("A comida acabou\n");
            threadEstado = false;
            System.exit(0);
        }

    }

    // Liberar os garfos para outro filosofo poder pegar
    private void devolverGarfo() {
        garfo_esquerdo.release();
        garfo_direito.release();
        System.out.println("Filosofo " + id + " SOLTOU os garfos\n");
    }
}
