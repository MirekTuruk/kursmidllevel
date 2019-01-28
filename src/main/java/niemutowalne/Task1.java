package niemutowalne;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(sum(Collections.unmodifiableList(Arrays.asList(-1, 2))));

    }

    public static int sum(List <Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++)
            if (list.get(i) < 0) {
                list.set(i, -list.get(i));
            }
        return total;
    }

}







