package practice;

public class StringOne {

    public static void main(String[] args) {
        String name = "Alice";
        String name2 = "Rome";
        System.out.println(name.length()); // size
        System.out.println(name.equals(name2)); // equals
        char[] charArray = name2.toCharArray();
        System.out.println(charArray);
        System.out.println(name2.isEmpty());
        System.out.println(name.concat(name2));

    }
}
