import java.util.Random;

public class Vetture {
    private int carNumber;
    private String team;

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

    public void drive() {
        Random random = new Random();
        int lapTime = random.nextInt(4) + 1;
        try {
            System.out.println("\nAuto numero : " + carNumber + "\ndel team : " + team + "\n-------- sta percorrendo il giro di pista --------");
            Thread.sleep(lapTime * 1000);
            System.out.println("\nAuto numero : " + carNumber + "\ndel team : " + team + "\n------- ha completato il giro di pista -------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        
    }

    }
}
