public class TestaProduto{
    public static void main(String args[]){

        PilhaSincronizada pilha = new PilhaSincronizada();

        Producer produtor = new Producer(pilha);
        Thread produc = new Thread(produtor);
        produc.start();

        Consumer consumidor = new Consumer(pilha);
        Thread consum = new Thread (consumidor);
        consum.start();

    }
}