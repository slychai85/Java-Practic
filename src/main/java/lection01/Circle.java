package lection01;

import lombok.*;

@Getter
@Setter
@ToString
public class Circle {
    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    class Point {
        private int x;
        private int y;
    }
    private Point center;
    private int radius;
    public Circle(int x, int y, int radius) {
        setCenter(new Point(x, y));
        setRadius(radius);
    }
}
