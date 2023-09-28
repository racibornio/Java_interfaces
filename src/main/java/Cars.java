public class Cars extends Vehicles {
    @Override
    public void startEngine() {
        System.out.println("The car engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println("The car engine stopped.");
    }
}
