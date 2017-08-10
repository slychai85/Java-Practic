package lection11;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UncloseInputSream extends FilterInputStream {
    public UncloseInputSream(InputStream in) {
        super(in);
    }

    @Override
    public void close() throws IOException {
        // NOP
    }
}
