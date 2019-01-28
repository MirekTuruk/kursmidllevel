package tasks;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public List <String> search(List <String> list) {
        return list.stream().filter(element -> element.length() == 4)
                .filter(element -> element.startsWith("s")).collect(Collectors.toList());
    }
}
