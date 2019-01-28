package tasks2;

import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) ;
        }
    }

    public static int sum(int i) {
        if(i == 0){
            return  0;
        }
        return i % 10 + sum(i/10);
    }
}





