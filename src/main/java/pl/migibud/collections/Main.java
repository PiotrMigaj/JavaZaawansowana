package pl.migibud.collections;

import java.util.Optional;

import static pl.migibud.collections.Gender.FEMALE;
import static pl.migibud.collections.Gender.MALE;

public class Main {

    public static void main(String[] args) throws Exception {


        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPerson("669678478",new Person("Piotr",50,MALE));
        phoneBook.addPerson("669678471",new Person("Piotr",24,MALE));
        phoneBook.addPerson("669678472",new Person("Piotr",36,MALE));
        phoneBook.addPerson("669678475",new Person("Piotr",78,MALE));

        //Person person = phoneBook.searchPerson("669678475");
        //System.out.println(person);

        //Optional<Person> optionalPerson = Optional.ofNullable(phoneBook.searchPerson("669678475"));
        //Person person1 = Optional.ofNullable(phoneBook.searchPerson("669678475")).orElseThrow(Exception::new);

        //phoneBook.removePerson("669678476");
        System.out.println(phoneBook.phoneBookHashMap);
        System.out.println(phoneBook.getSortedPhoneBook());


        //System.out.println(person1);

        ShoppingQueue shoppingQueue = new ShoppingQueue();
        shoppingQueue.addCustomer(new Person("Piotr",32,MALE));
        System.out.println(shoppingQueue.serviceCustomer());
        System.out.println(shoppingQueue.serviceCustomer());
        System.out.println(shoppingQueue.serviceCustomer());




    }

}
