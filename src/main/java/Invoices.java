import java.util.Date;

public abstract class Invoices  implements InvoicesInterface{
    String issuer = null;
    String receiver = null;
    double net = 0;
    int vat = 0;

    double gros = 0;

    Date issueDate;

    @Override
    public void issueTheInvoice() {

    }


    @Override
    public void sendReminder() {

    }

    public abstract void issueTheInvoice(String issuer, String receiver, double net);
}
