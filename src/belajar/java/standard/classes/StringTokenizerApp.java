package belajar.java.standard.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String text = "Eko Kurniawan Khannedy";
        StringTokenizer stringTokenizer = new StringTokenizer(text, " ");

        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }
}
