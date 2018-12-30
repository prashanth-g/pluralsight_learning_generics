package com.prashanth.pluralsight.learning.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        Person shennyOlei = new Person("Shenny Olei", 92);
        Person motirJulosi = new Person("Motir Julosi", 72);
        Person shelyCucoi = new Person("Shely Cucoi", 53);

        Set<Person> people = new HashSet<>();

        people.add(shennyOlei);
        people.add(shelyCucoi);
        people.add(shennyOlei);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
