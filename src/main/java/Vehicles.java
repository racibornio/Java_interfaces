public abstract class Vehicles implements CarsSmokeTest {
    String type;
    int yearOfProduction;
    String manufacturer;

    CarsSmokeTest carsSmokeTest = new CarsSmokeTest() {
        @Override
        public void startEngine() {
            System.out.println("The engine started.");
        }

        @Override
        public void stopEngine() {
            System.out.println("The engine stopped.");
        }
    };

}
