package ru.geekbrains;

import java.util.Arrays;

public class DZ3 {


    public static void main(String[] args) {
        doLesson_Fruits();

        System.out.println();

        String[] massive = {"Kryg ", "Kvadrat ", "Treygolnik"};
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i]);
        }
        System.out.println();

        changeMassive(massive, 0,2);
    }

    public static void changeMassive(Object[] massive, int a, int b) {
        Object temp = massive[a];
        massive[a] = massive[b];
        massive[b] = temp;
        System.out.println(Arrays.toString(massive));
    }

    private static void doLesson_Fruits() {
        Box<Apple> appleBox = new Box<Apple>(1);
        Box<Orange> orangeBox = new Box<Orange>(1.5);
        Box<Apple> appleBox2 = new Box<Apple>(1);

        for (int i = 0; i < 3; i++) {

            orangeBox.addFruit(new Orange());
            appleBox.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
        }

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        appleBox2.addFruit(new Apple());


        System.out.println("Weight appleBox: " + appleBox.getBoxWeight());
        System.out.println("Weight orangeBox: " + orangeBox.getBoxWeight());
        System.out.println("Weights equals - " + appleBox.compare(orangeBox));
        System.out.println("---------------------------------------------");

        appleBox.addFruits(appleBox2);

    }

}
