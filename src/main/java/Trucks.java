public class Trucks extends Vehicles {
    @Override
    public void startEngine() {
        System.out.println("The truck engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The truck engine stopped.");
    }
}
