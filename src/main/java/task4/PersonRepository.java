package task4;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {

    private List <Person> people = new ArrayList <>();

    public void addPerson(Person person) {
        boolean peopleWithTheSameId = people.stream().anyMatch(person1 -> person.getiD() == person.getiD());
        if (people.contains(person)) {
            throw new IllegalArgumentException("Takie samo ID");
        } else {
            people.add(person);
        }
    }

    public void getPerson(Person person) {
        return;
    }


    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
    personRepository.addPerson(new Person(1, "Adam", "Dudek", 22));
    personRepository.addPerson(new Person(2, "Maria", "Bulinska", 20));

    }
}





