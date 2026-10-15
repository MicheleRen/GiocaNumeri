//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.logging.Level;
import java.util.logging.Logger;

public class GiocaNumeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("INIZIO GIOCO");

        Giocatore g1 = new Giocatore("Michele");
        Thread tg1 =new Thread(g1);
        tg1.start();

        try {
            tg1.join();
        } catch (InterruptedException ex) {
            System.err.println("errore nella transizione"+
                    ex.getMessage());
        }


        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GiocaNumeri.class.getName()).log(Level.SEVERE, null, ex);
        }

        Giocatore g2 = new Giocatore("Paolo");
        Thread tg2 = new Thread(g2);
                tg2.start();

        System.out.println("FINE GIOCO");
    }

}