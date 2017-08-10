package lection12;

import lombok.Data;

import java.io.IOException;

public class App4 {
    public static void main(String[] args) {
        copy("Mama", "Papa");
    }

    public static void copy(String path1, String path2) {
        try(MyReader reader = new MyReader(path1);
            MyWriter writer = new MyWriter(path2)) {
            writer.write(reader.read());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
@Data
class MyReader implements AutoCloseable {
    private String path;

    public MyReader(String path) {
        setPath(path);
    }

    public String read() throws IOException {
        if(true) {
            throw new IOException("read()");
        }
        return "some string";
    }

    @Override
    public void close() throws Exception {
        if(true) {
            throw new IOException("MyReader.close()");
        }
    }
}
@Data
class MyWriter implements AutoCloseable {
    private String path;
    public MyWriter(String path) {
        setPath(path);
    }
    public void write (String s) {
    }

    @Override
    public void close() throws Exception {
        if(true) {
            throw new IOException("MyWriter.close()");
        }
    }
}