package ru.geekbrains;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {
    private Map<String, List<String>> directoryHm = new HashMap<>();
    private List<String> phoneNumber;

    public void add(String surname, String phone_number) {
        if (directoryHm.containsKey(surname)) {
            phoneNumber = directoryHm.get(surname);
            phoneNumber.add(phone_number);
            directoryHm.put(surname, phoneNumber);
        } else {
            phoneNumber = new ArrayList<>();
            phoneNumber.add(phone_number);
            directoryHm.put(surname, phoneNumber);
        }
    }

    public List<String> get(String surname) {
        return directoryHm.get(surname);
    }

}
