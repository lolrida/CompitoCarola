public class GaraMacchine extends Thread{
    
    private Vetture car;
    private PitStop pitStop;

    public GaraMacchine(Vetture car, PitStop pitStop) {
        this.car = car;
        this.pitStop = pitStop;
    }

    @Override 
    public void run(){
        for (int i = 1; i <= 10; i++) {
            car.drive();
            System.out.println("\n\nGIRO-"+i + " completato da " + car.getTeam());
            if (i % 3 == 0) {
                System.out.println("Auto numero : " + car.getCarNumber() + "\ndel team :" + car.getTeam() + "\n------- deve effettuare il cambio gomme al giro di gara # " + i + " -------");

                pitStop.performPitStop(car);

                System.out.println("Auto numero : " + car.getCarNumber() + "\ndel team : " + car.getTeam() + "\n-------- ha completato il cambio gomme al giro di gara # " + i + " ed esce dal box -------");
            
            }
        }


    }



}
