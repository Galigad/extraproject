package com.kodilla.extraproject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NameCounter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Jan", "Marek", "Karol", "Jan", "Marek", "Jan");
        countAndPrint(names);
    }

    public static void countAndPrint(List<String> names) {
        Map<String, Integer> repeatingNames = new HashMap<String, Integer>();
        for (String name : names) {
            if (repeatingNames.containsKey(name)) {
                repeatingNames.put(name, repeatingNames.get(name) + 1);
            } else {
                repeatingNames.put(name, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : repeatingNames.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
