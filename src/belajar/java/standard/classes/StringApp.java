package belajar.java.standard.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Eko Kurniawan Khanedy";
        String lowerCase = name.toLowerCase();
        String upperCase = name.toUpperCase();

        char[] charArray = upperCase.toCharArray();

        for (char c : charArray) {
            System.out.println(c);
        }

        System.out.println(name);
        System.out.println(lowerCase);
        System.out.println(upperCase);
    }
}
