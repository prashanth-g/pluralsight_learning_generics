package com.prashanth.pluralsight.learning.generics;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {

    public static void main(String[] args) {
        Person shennyOlei = new Person("Shenny Olei", 92);
        Person motirJulosi = new Person("Motir Julosi", 72);

        List<Person> madMen = new ArrayList<>();
        madMen.add(shennyOlei);
        madMen.add(motirJulosi);
        madMen.add(new Person("Shely Cucoi", 53));

        for (Person person : madMen) {
            System.out.println(person);
        }

    }
}
