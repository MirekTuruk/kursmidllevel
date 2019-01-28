package company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee() {
            List <Employee> employee = new ArrayList <>();
            List <Employee> optional = employee
                    .stream()
            //        .filter(element -> element.equals(employee) || element.position.equals("Seller"))
                    .collect(Collectors.toList());

            {
         //       if (employee.position.equals("Seller") && optional.size() > 0) {

          //      } else if (optional.isEmpty() && optional.get(0).equals(employee)) {

                }

        //    }
        };
    }
}

