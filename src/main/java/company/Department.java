package company;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private final int assignBonus;
    private String programmer;

    private Department(int assignBonus, String programmer, List <EmployeeDepartment> employee, String salesman) {
        this.assignBonus = assignBonus;
        this.programmer = programmer;
        this.employee = employee;
        this.salesman = salesman;
    }

    List <EmployeeDepartment> employee = new ArrayList <>();


    private Department(String programmer, String salesman, int bonus) {
        this.programmer = programmer;
        this.salesman = salesman;
        this.assignBonus = bonus;
    }

    String salesman;

    {

    }

    private void hireNewEmployee(EmployeeDepartment employeeDepartment) {
        if (employee.contains(employeeDepartment)) {
            throw new  IllegalArgumentException("Pracownik już zatrudniony");
        } else {
            employee.add(employeeDepartment);
        }

    }

    private void releaseEmployee(EmployeeDepartment employeeDepartment) {
        if (employee.contains(employeeDepartment)) {
            throw new IllegalArgumentException("Brak pracownika");
        } else {
            employee.remove(employeeDepartment);
        }
    }

    private void hireNewSalesman(EmployeeDepartment employeeDepartment) {
        if (employee.contains(employeeDepartment)) {
            throw new IllegalArgumentException("Sprzedawca zatrudniony");
        } else {
            employee.isEmpty();
        }
    }
    private int assignBonus (Employee employee){
        return assignBonus(employee);
    }
}


