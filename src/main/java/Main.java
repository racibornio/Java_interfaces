import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.startEngine();
        car1.stopEngine();

        Trucks truck1 = new Trucks();
        truck1.startEngine();
        truck1.stopEngine();

        ProFormaInvoice proFormaInvoice1 = new ProFormaInvoice();
        proFormaInvoice1.issueProFormaInvoice("Service provider", "Client", 123.34);

    }
}
