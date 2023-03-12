public class TestaProduto {

    public static void main(String[] args) {
        PilhaSincronizada pilha = new PilhaSincronizada();
        
        Producer produtor = new Producer(pilha);
        Thread producer = new Thread(produtor);
        producer.start();

        Consumer consumidor = new Consumer(pilha);
        Thread consumer = new Thread(consumidor);
        consumer.start();
        }

}