package lection11;

import java.io.IOException;

public class App3 {
    public static void main(String[] args) throws IOException {
        System.out.println(ReadConsoleOK.readConsoleOK());
        System.out.println(ReadConsoleOK.readConsoleOK());

        System.in.close();
        B b = new B();
        try {
            b.read();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("======================");
            e.getCause().printStackTrace();
        }

        System.out.println(ReadConsole.readConsole()); // exception
    }
}

