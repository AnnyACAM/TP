public class Sapo extends Thread{
    
    private String nomeSapo;
    static int distanciaPercorrida = 0;
    private int distanciaPulo; 
    public int distanciaCorrida;

    public int getDistanciaPulo()                       {     return distanciaPulo;   }
    public void setDistanciaPulo(int distanciaPulo)     {     this.distanciaPulo = distanciaPulo;    }

    public String getNomeSapo()                         {     return nomeSapo;       }
    public void setNomeSapo(String nomeSapo)            {      this.nomeSapo = nomeSapo;      }
    

    public Sapo (String nome, int distanciaTotalCorrida, int distanciaPulo) {
		setNomeSapo(nome);
		this.distanciaCorrida = distanciaTotalCorrida;
		setDistanciaPulo(distanciaPulo);
	}

    public void run(){
        try{
           while(distanciaPercorrida < distanciaCorrida){
                distanciaPercorrida += distanciaPulo;
                Thread.sleep(distanciaPulo);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
		System.out.println(getNomeSapo() + " terminou a corrida!");
    }
     
}