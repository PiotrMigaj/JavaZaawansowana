package pl.migibud.electronics;

public class MailMachine implements EmailSender {

    private static final int MAX_ELEMENTS = 3;

    private EmailSender[] emailSenders = new EmailSender[MAX_ELEMENTS];
    private int counter;

    public void addEmailSender(EmailSender emailSender) {

        if (counter < MAX_ELEMENTS) {
            emailSenders[counter] = emailSender;
            counter++;
        }else{
            System.out.println("Array is full");
        }

    }

    @Override
    public void sendEmail(String message) {
        for (EmailSender e:emailSenders) {
            e.sendEmail(message);
        }
    }
}
