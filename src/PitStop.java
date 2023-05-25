import java.util.Random;
import java.util.concurrent.Semaphore;

public class PitStop {
    private Semaphore pitSemaphore;

    public PitStop() {
        pitSemaphore = new Semaphore(1); 
    }

    public void performPitStop(Vetture car) {
        
        try {
                System.out.println("\nAuto numero : " + car.getCarNumber() + "\ndel team : " + car.getTeam() + "\n------- sta entrando nel box -------");
    
                pitSemaphore.acquire();

                

                System.out.println("\nAuto numero : " + car.getCarNumber() + "\ndel team : " + car.getTeam() + "\n------- è nel box --------");
                
                Random random = new Random();
                int pitStopTime = random.nextInt(5) + 1;
                Thread.sleep(pitStopTime * 1000);
    
                System.out.println("\nAuto numero : " + car.getCarNumber() + "\ndel team : " + car.getTeam() + "\n------- ha completato il cambio gomme -------");
    
                pitSemaphore.release();
                

                



        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        
    }


}
