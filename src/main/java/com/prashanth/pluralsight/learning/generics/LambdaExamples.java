package com.prashanth.pluralsight.learning.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExamples {

    public static void main(String[] args) {
        Person shennyOlei = new Person("Shenny Olei", 92);
        Person motirJulosi = new Person("Motir Julosi", 72);
        Person shelyCucoi = new Person("Shely Cucoi", 53);

        Predicate<Person> isOld = person -> person.getAge() > 80;

        List<Person> people = new ArrayList<>();
        people.add(shennyOlei);
        people.add(motirJulosi);
        people.add(shelyCucoi);

        final Map<Boolean, List<Person>> oldAndYoungPeople =
                people.stream()
                        .collect(Collectors.partitioningBy(isOld));

        System.out.println(oldAndYoungPeople);
    }

}
