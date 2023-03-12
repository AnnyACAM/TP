public class Trabalhador extends Thread {
    
    String produto;
    int tempo;
    private boolean flag = false;
    int i = 0;

    public Trabalhador(String produto, int tempo){
        this.produto = produto;
        this.tempo = tempo;
    }   

    public void parar(){
            flag = true;
    }

    public void run(){
        while(flag == false){
        for (int i = 0; i < 50; i ++) {
            System.out.println(i + " " + produto);

            try {
                sleep((long)(Math.random() * tempo));
            } catch(InterruptedException e) {}
        }
        parar();
        System.out.println ("Terminei" + produto);
    }
}

}