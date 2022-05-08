package pl.migibud.collections;

import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;

public class ShoppingQueue {

    Queue<Person> personQueue = new PriorityQueue<>();

    public void addCustomer(Person person){
        if (person!=null){
            personQueue.add(person);
        }
    }

    public Person serviceCustomer() throws Exception {
        return Optional.ofNullable(personQueue.poll()).orElseThrow(()->new Exception("There is no more people to service."));
    }



}
