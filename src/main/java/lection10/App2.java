package lection10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        String[] strings = {"0", "32", "24"};
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        System.out.println(list);
        list.add("23");
        list.add("45");
        list.add("12");
        list.add("4");
        list.add("9");
        list.add("7");
        System.out.println(list);

        list.sort((a, b)-> Integer.compare(Integer.parseInt(b), Integer.parseInt(a)));

        System.out.println(list);

        list.forEach(a -> System.out.println(a));

        list.forEach(System.out::println);
    }
}
