package company;

public abstract class Employee {

    public Employee() {
    }

    private static int salary;
    private static String name;
    private static String surname;
    private static int localDate;
    private static int iD;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + iD +
                ", name=" + name + '\'' +
                ", surname=" + surname +
                ", salary=" + salary +
                ", date=" + localDate +
                '}';
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(int salary) {
        Employee.salary = salary;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Employee.name = name;
    }

    public static String getSurname() {
        return surname;
    }

    public static void setSurname(String surname) {
        Employee.surname = surname;
    }

    public static int getLocalDate() {
        return localDate;
    }

    public static void setLocalDate(int localDate) {
        Employee.localDate = localDate;
    }

    public static int getiD() {
        return iD;
    }

    public static void setiD(int iD) {
        Employee.iD = iD;
    }


}
