public class CorridaSapos{
    public static void main(String args[]){

        int numSapos = 3;
        int distanciaCorrida = 1000;
        int pulo = (int) (Math.random() * 99.9);

        for (int i = 1; i <= numSapos; i++) {
			new Sapo("SAPO_" + i, distanciaCorrida, pulo).start();
		}
    }
}