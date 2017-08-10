package lection11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public static int readConsole () {
        int a = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Input integer");
            a = Integer.parseInt(br.readLine());
            return a;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } finally {
            return 1;
        }
    }
}
class A {
    public String read() {
        return "";
    }
}
class B extends A {
    @Override
    public String read() {
        String result = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader
                                    (new UncloseInputSream(System.in)))) {
            System.out.println("Input string:");
            result = br.readLine();
        } catch(IOException e) {
            throw new MyReadException(e);
        }
        return result;
    }
}