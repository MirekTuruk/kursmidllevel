package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public List <String> getString(List<Integer>list){
        return list.stream().map(element -> element%2 == 0 ? "p" + element : "n" + element)
                .collect(Collectors.toList());
    }
}
