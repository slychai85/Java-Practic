package lection01;

import java.util.Arrays;
import java.util.Comparator;

public class App1 {
    public static void main(String[] args) {
        Shape.Color color = new Shape.Color(235, 545, 432);
        System.out.println(color);
        System.out.println(color.getBlue());
        Circle circle = new Circle(12, 23, 34);
        System.out.println(circle);
        Circle.Point point = circle.new Point(2, 3);
        System.out.println(point);
        System.out.println(circle.getCenter());

        String[] strings = {"1", "43", "3", "63", "0", "5", "75"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println("========================================");
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return Integer.compare(Integer.parseInt(s), Integer.parseInt(t1));
            }
        });
        System.out.println(Arrays.toString(strings));

        DayWeek day1 = DayWeek.MONDAY;
        System.out.println(day1);
        day1.setNumber(2);
        System.out.println(day1);
    }
}
