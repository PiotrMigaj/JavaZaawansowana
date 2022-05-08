package pl.migibud.collections;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    public Map<String,Person> phoneBookHashMap = new HashMap<>();

    public void addPerson(String number, Person person) throws Exception {

        validateNumber(number);
        if (person ==null){
            throw new Exception("Wrong input data.");
        }
        phoneBookHashMap.put(number,person);
    }

    public Person searchPerson(String number) throws Exception {
        validateNumber(number);
        if (phoneBookHashMap.containsKey(number)){
            return phoneBookHashMap.get(number);
        }
        throw new Exception("There is no such person in phone book.");
    }

    private void validateNumber(String number) throws Exception {
        if (!number.matches("[\\d]{9}")){
            throw new Exception("Wrong number.");
        }
    }

    public void removePerson(String number) throws Exception {
        validateNumber(number);
        if (phoneBookHashMap.containsKey(number)){
            phoneBookHashMap.remove(number);
        }else{
            throw new Exception("There is no such person in phone book.");
        }
    }

    public Map<String,Person> getSortedPhoneBook(){
        return this.phoneBookHashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(p1,p2)->p1, LinkedHashMap::new));
    }

}
