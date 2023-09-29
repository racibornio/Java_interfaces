import java.util.Date;

public class ProFormaInvoice extends Invoices implements InvoicesInterface {

    @Override
    public void issueTheInvoice(String issuer, String receiver, double net) {
        super.issuer = issuer;
        super.receiver = receiver;
    }

    public ProFormaInvoice issueProFormaInvoice(String issuer, String receiver, double net) {

        ProFormaInvoice proFormaInvoice23 = null;
        int vat23 = 23;
        super.issuer = issuer;
        super.receiver = receiver;
        super.gros = net * vat23;
        System.out.println("The invoice has been issued.");

        return proFormaInvoice23;
    }

}
