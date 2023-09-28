public interface InvoicesInterface {
    String issuer = null;
    String receiver = null;
    double net = 0;
    int vat = 0;
    double gros = 0;

    void issueProFormaInvoice();

    void issueInvoice();

    void issueCorrectionInvoice();

    void sendReminder();

}
