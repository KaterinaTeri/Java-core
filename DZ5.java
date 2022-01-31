package ru.geekbrains;

import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class DZ5 {
    public static void main(String[] args) {
        saveData("saveData.csv");
        readFile();
    }

    private static void readFile() {
        AppData data = new AppData();
        data.readFromFile("example.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToCSV("new_example.csv");
    }

    private static void saveData(String sFileName) {
        try {
            FileWriter writer = new FileWriter(sFileName);
            writer.append("Name");
            writer.append('\n');
            writer.append("Katerina D");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}