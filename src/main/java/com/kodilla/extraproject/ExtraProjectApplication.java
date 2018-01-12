package com.kodilla.extraproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.lang.*;
import java.io.*;


@SpringBootApplication
public class ExtraProjectApplication {

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