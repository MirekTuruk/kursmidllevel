package task5;

import java.util.ArrayList;

public class RemovePeople {
    public static void main(String[] args) {
        Person ben = new Person("Ben");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person(new String("Ben")));
        persons.add(new Person(new String("Alyssa")));
        persons.add(new Person(new String("Alice")));
        for (Person person : persons){
            if (person.hasSameName(ben)) {
                persons.remove(person);
            }
        }
        System.out.println(persons);
    }
}

