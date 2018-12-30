package com.prashanth.pluralsight.learning.generics;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {
        Person shennyOlei = new Person("Shenny Olei", 92);
        Person motirJulosi = new Person("Motir Julosi", 72);
        Person shelyCucoi = new Person("Shely Cucoi", 53);

        Map<String, Person> madMen = new HashMap<>();

        madMen.put(shennyOlei.getName(), shennyOlei);
        System.out.println(madMen.get("Shenny Olei"));
    }
}
