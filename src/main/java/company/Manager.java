package company;

import java.math.BigDecimal;
import java.util.List;

public class Manager extends Employee {

    Department department;
    private EmployeeDepartment employeeDepartments;


    private void assignBonus(EmployeeDepartment employeeDepartments) {
        this.employeeDepartments = employeeDepartments;
        if (department.employee.contains(employeeDepartments)) {
            throw new IllegalArgumentException("Zły Wydział");
        } else {
            employeeDepartments.equals(employeeDepartments);
        }

       // private void promotionEmployee(EmployeeDepartment employeeDepartments) {
                this.employeeDepartments = employeeDepartments;
        if (department.employee.contains(employeeDepartments)) {
            throw new IllegalArgumentException("Zły Wydział");
        } else{
            employeeDepartments.equals(employeeDepartments);
        }
        }
        List <Department> departments;
    }




