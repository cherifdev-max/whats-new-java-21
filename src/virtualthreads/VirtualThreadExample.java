package virtualthreads;

public class VirtualThreadExample {

    public static void main(String[] args) throws InterruptedException {
        // Crée et démarre un thread virtuel
        Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Je suis un thread virtuel ! 👋");
        });

        // Attend que le thread virtuel se termine
        virtualThread.join();
    }
}
