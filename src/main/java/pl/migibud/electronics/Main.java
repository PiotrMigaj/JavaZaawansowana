package pl.migibud.electronics;

public class Main {

    public static void main(String[] args) {

        MailMachine mailMachine = new MailMachine();

        Phone phone = new Phone("Samsung S10","888-888-888");
        Phone iPhone = new Phone("iPhone 11","777-777-777");
        Tablet tablet = new Tablet("galaxy sTab");
        Radio radio = new Radio("Moje małe radyjko");

        mailMachine.addEmailSender(phone);
        mailMachine.addEmailSender(iPhone);
        mailMachine.addEmailSender(tablet);

        mailMachine.sendEmail("To ja");

    }

}
