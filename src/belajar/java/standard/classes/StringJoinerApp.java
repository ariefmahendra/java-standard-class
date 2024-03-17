package belajar.java.standard.classes;

import java.util.StringJoiner;

public class StringJoinerApp {

    /**
     *
     * String joiner digunakan untuk menggabungkan string
     * sangat cocok untuk menggabungkan array string dengan format tertentu
     * output [Arief||Mahendra]
     */

    public static void main(String[] args) {

        String[] names = {"Arief", "Mahendra"};
        StringJoiner joiner = new StringJoiner("||", "[", "]");

        for (String name : names) {
            joiner.add(name);
        }

        System.out.println(joiner);
    }

}