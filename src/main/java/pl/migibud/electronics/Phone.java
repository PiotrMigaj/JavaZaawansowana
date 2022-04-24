package pl.migibud.electronics;

public class Phone extends Device implements EmailSender {

    private String number;

    public Phone(String model, String number) {
        super(model);
        this.number = number;
    }

    public void makeCall(String number) {
        System.out.println("Calling number: " + number);
    }

    @Override
    public void turnOn() {
        System.out.printf("Phone %s turns on", this.model);
    }

    @Override
    public void turnOff() {
        System.out.printf("Phone %s turns off", this.model);
    }

    @Override
    public void sendEmail(String message) {
        System.out.printf("Phone %s send message: %s \n",this.model,message);
    }
}
