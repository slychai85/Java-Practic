package lection01;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

public class Shape {
    @Getter
    @Setter
    @AllArgsConstructor
    @ToString
    public static class Color {
        int red, green, blue;
    }
}
