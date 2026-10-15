/*
 * Applicazione multithreading e diagramma degli stati
 */


import java.util.logging.Level;
import java.util.logging.Logger;


public class Giocatore implements Runnable{
    String nome;
    private String parola;
    private int punteggio;

    /**
     *
     * @param nome nome del Giocatore
     */
    public Giocatore(String nome){
        this.nome = nome;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    /**
     * gioca, metodo che implementa la logica del gioco e calcola il punteggio
     */
    public void gioca(){
        int numero = 19;
        String parola = "Divertiti";
        setParola(parola);


        for (int i=0; i<numero; i++){
            System.out.println("Giocatore : " + nome + " i: " + i);
            try {
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException ex) {
                //istruzioni per gestire errore
                System.err.println("errore nella transizione da running a sleeping");
                ex.getMessage();
            }
        }


        setPunteggio(100);

        System.out.println("Giocatore : " + nome + " parola: " + getParola() + " punteggio: " + punteggio);
    }

    public void comunica(){
    }

    @Override
    public void run(){
        gioca();
    }

}

