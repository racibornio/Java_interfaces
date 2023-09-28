public abstract class Vehicles implements CarsSmokeTest {
    String type;
    int yearOfProduction;
    String manufacturer;

    CarsSmokeTest carsSmokeTest = new CarsSmokeTest() {
        @Override
        public void startEngine() {

        }

        @Override
        public void stopEngine() {

        }
    }

}
