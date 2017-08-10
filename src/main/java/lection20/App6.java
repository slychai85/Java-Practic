package lection20;

public class App6 {
    public static void main(String[] args) {
        System.out.println("Hello Git!");

        String ss = "Mama mila papy";
        String ss1 = "Mama mila papa";

        int i = 5;
        String s = String.valueOf(i);
        String s1 = Integer.toString(i);
        String s2 = "" + i;
        boolean aa = s.endsWith(s1);
        boolean bb = s.startsWith(s2);
        int a = s.compareTo(s1);
        int b = s.compareToIgnoreCase(s1);
        boolean aaa = s.equals(i);
        System.out.println(ss.regionMatches(12, ss1, 12, 2));

    }
}
