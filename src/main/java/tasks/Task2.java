package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {


    public List <String> upperCase(List <String> list) {
        return list.stream().map(element -> element.toUpperCase()).collect(Collectors.toList());

    }
            public static void main (String[]args){




    }
}


