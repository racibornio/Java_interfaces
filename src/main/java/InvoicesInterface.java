import java.util.Date;

public interface InvoicesInterface {

    void issueTheInvoice(String issuer, String receiver, double net);


    void issueTheInvoice();

    void sendReminder();

}
