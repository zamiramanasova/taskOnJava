package practice;

import java.util.Locale;

public class StringOne {

    public static void main(String[] args) {
        String name = "Alice";
        String name2 = "Rome";
        System.out.println(String.join("! ",name,name2));
        System.out.println(name.length()); // size
        System.out.println(name.equals(name2)); // equals
        char[] charArray = name2.toCharArray();
        System.out.println(charArray);
        System.out.println(name2.isEmpty());
        System.out.println(name.concat(name2));
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.replace("A", "B"));
        System.out.println(name.substring(1, 3));

    }
}
