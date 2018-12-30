package com.prashanth.pluralsight.learning.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GenericsOnMethods {
    public static void main(String[] args) {
        Person shennyOlei = new Person("Shenny Olei", 92);
        Person motirJulosi = new Person("Motir Julosi", 72);
        Person shelyCucoi = new Person("Shely Cucoi", 53);

        List<Person> people = new ArrayList<>();
        people.add(shennyOlei);
        people.add(motirJulosi);
        people.add(shelyCucoi);

        final Person youngestCastMember = min(people, new AgeComparator());
        System.out.println(youngestCastMember);
    }

    public static <T> T min(List<T> values, Comparator<T> comparator) {
        if(values.isEmpty()) {
            throw new IllegalArgumentException("List is empty cannot find minimum");
        }

        T lowestElement = values.get(0);

        for (int i = 0; i < values.size(); i++) {
            final T element = values.get(i);
            if (comparator.compare(element, lowestElement) < 0) {
                lowestElement = element;
            }
        }

        return lowestElement;
    }
}
