package lection11;

import java.io.IOException;

public class MyReadException extends RuntimeException {
    public MyReadException(Exception e) {
        super(e);
    }
}
