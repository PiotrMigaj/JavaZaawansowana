package pl.migibud.thread;

public class Counter {

    private int count =0;
    public void increment(){
        count+=1;
    }
    public synchronized int getCount(){
        return this.count;
    }
}
