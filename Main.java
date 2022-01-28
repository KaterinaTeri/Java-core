package ru.geekbrains;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        doColor();
        doTelefone();
    }

    private static void doColor() {
        Map<String, Integer> hm = new HashMap<>();
        String[] colors = {"Red", "Blue", "Yellow", "Black", "White", "Orange", "Red", "Black", "Braun", "Grey"};

        for (int i = 0; i < colors.length; i++) {
            if (hm.containsKey(colors[i]))
                hm.put(colors[i], hm.get(colors[i]) + 1);
            else
                hm.put(colors[i], 1);
        }
        System.out.println(hm);
        System.out.println("--------------------------------");

        }


    private static void doTelefone() {
        Directory directory = new Directory();

        directory.add("Anna", "111");
        directory.add("Boris", "222");
        directory.add("Vladimir", "333");
        directory.add("Gennadiy", "444");
        directory.add("Anna", "555");
        directory.add("Dmitriy", "666");
        directory.add("Elena", "777");
        directory.add("Elena", "888");
        directory.add("Vladimir", "999");

        System.out.println(directory.get("Anna"));
        System.out.println(directory.get("Boris"));
        System.out.println(directory.get("Elena"));
        System.out.println(directory.get("Dmitriy"));
    }
}
