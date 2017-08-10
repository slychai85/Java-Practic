package lection11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleOK {
    public static int readConsoleOK () {
        int a = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader
                                            (new UncloseInputSream(System.in)));) {
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
