package task5;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean hasSameName(Person person){
        return person.name.equals(this.name);
        if (name.equals (this.name)){
            this.name.remove(name);
        }
    }


    @Override
    public String toString(){
        return "[Name: " + this.name + "]";
    }
}



