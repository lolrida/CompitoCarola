import java.util.Random;

/**
 * Questa classe rappresenta una monoposto di Formula 1.
 */
public class Vetture {
    private int carNumber;
    private String team;

    /**
     * Costruisce un oggetto Car con il numero identificativo e la scuderia specificati.
     *
     * @param carNumber il numero identificativo della monoposto
     * @param team      la scuderia di appartenenza della monoposto
     */

    public Vetture(int carNumber, String team) {
        this.carNumber = carNumber;
        this.team = team;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public String getTeam() {
        return team;
    }
    
    /**
     * Simula il percorso di un giro di pista della monoposto.
     *
     * @param tgiro il numero del giro di pista
     */

    public void drive() {
        Random random = new Random();
        int tgiro = random.nextInt(4) + 1;
        try {
            System.out.println("\nAuto numero : " + carNumber + "\ndel team : " + team + "\n-------- sta percorrendo il giro di pista --------");
            Thread.sleep(tgiro * 1000);
            System.out.println("\nAuto numero : " + carNumber + "\ndel team : " + team + "\n------- ha completato il giro di pista -------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        
    }

    }
}
