package task3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set <Person> names = new HashSet <>();
        Person person = new Person("Kasia", "Bulinska");
        Person person1 = new Person("Ania", "Basinska");
        Person person2 = new Person("Ania", "Makowska");
        Person person3 = new Person("Wojtek","Filip");
        Person person4 = new Person("Zuza", "Balon");
        Person person5 = new Person("Estera", "Zuckerman");
        Person person6 = new Person("Jan", "Kowalski");
        Person person7 = new Person("Ania", "Makowska");


        names.add(person);
        names.add(person1);
        names.add(person2);
        names.add(person3);
        names.add(person4);
        names.add(person5);
        names.add(person6);

        int setSize = names.size();
        System.out.println("Number of names: " + setSize);
        boolean isThereAnia = names.contains(person7);
        System.out.println("Is Ania Makowska in this set? " + isThereAnia);
        for (Person name : names){
            System.out.println(name);
        }
    }

}

