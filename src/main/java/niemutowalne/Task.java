package niemutowalne;

import java.util.*;
import java.util.stream.IntStream;

import static java.lang.Long.sum;

public class Task {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList()));
    }
    public static int sum(List <Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, -list.get(i));
            }
        }
        return total;
    }

}











