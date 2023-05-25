public class App {
    public static void main(String[] args) throws Exception {
        PitStop pitStop = new PitStop();

        Vetture[] cars = {
                new Vetture(1, "Ferrari"),
                new Vetture(2, "Mercedes"),
                new Vetture(3, "RedBull"),
                new Vetture(4, "McLaren"),
                new Vetture(5, "Alpine"),
        };

        GaraMacchine[] garaMacchine = new GaraMacchine[cars.length];

        for (int i = 0; i < cars.length; i++) {
            garaMacchine[i] = new GaraMacchine(cars[i], pitStop);
            garaMacchine[i].start();
        }

        try {
            for (GaraMacchine G : garaMacchine) {
                G.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("FINE GARA");
    }
}

