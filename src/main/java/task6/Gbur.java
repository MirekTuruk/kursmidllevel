package task6;

public class Gbur extends Human {

    @Override
    public Object przywitajSie() {
        return "Nie Przeszkadzaj Mi";
    }
    private Gbur(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
    }
    public static class Builder {
        private String name;
        private String surname;
        private int age;

        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public Builder age (int age){
            age = age;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

