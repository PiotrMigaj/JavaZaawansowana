package pl.migibud.electronics;

public class Tablet extends Device implements EmailSender {

    public Tablet(String model) {
        super(model);
    }

    public void sendMessage(String type, String message){
        if("email".equals(type)){
            this.sendEmail(message);
        }else{
            System.out.printf("Tablet %s send message of type %s, with message: %s",this.model,type,message);
        }
    }

    @Override
    public void turnOn() {
        System.out.printf("Tablet %s turns on",this.model);
    }

    @Override
    public void turnOff() {
        System.out.printf("Tablet %s turns off",this.model);
    }

    @Override
    public void sendEmail(String message) {
        System.out.printf("Wysyłamy emaila z tabletu %s o treści %s \n",this.model,message);
    }
}
