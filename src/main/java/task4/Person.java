package task4;

public class Person {

    private int iD;
    private String name;
    private String surname;
    private int age;

    public Person(int iD, String name, String surname, int age) {
        this.iD = iD;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {

    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
