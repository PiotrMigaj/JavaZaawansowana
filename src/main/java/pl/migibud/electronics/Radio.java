package pl.migibud.electronics;

public class Radio extends Device{

    public Radio(String model) {
        super(model);
    }

    @Override
    public void turnOn() {
        System.out.printf("Radio %s turns on",this.model);
    }

    @Override
    public void turnOff() {
        System.out.printf("Radio %s turns off",this.model);
    }

    public void changeChanel(String chanel){
        System.out.printf("Radio o podanym modelu %s zmienia kanał na %s",this.model,chanel);
    }




}
