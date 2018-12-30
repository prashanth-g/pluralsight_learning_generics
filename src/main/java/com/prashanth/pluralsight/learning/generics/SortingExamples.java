package com.prashanth.pluralsight.learning.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingExamples {
    public static void main(String[] args) {

        /*
        * GENERICS CLASSES AND INTERFACES
        *
        * Implementing a generic type
        *   AgeComparator implements Comparator<Person>
        *
        * Passing a parameter to a generic type
        *   ReverseComparator<T> implements Comparator<T>
        *
        * Type Bounds
        *   SortedPair<T> extends Comparable<T>>
        * * */

        Person shennyOlei = new Person("Shenny Olei", 92);
        Person motirJulosi = new Person("Motir Julosi", 72);
        Person shelyCucoi = new Person("Shely Cucoi", 53);

        List<Person> people = new ArrayList<>();
        people.add(shennyOlei);
        people.add(motirJulosi);
        people.add(shelyCucoi);

        System.out.println(people);
        // IMPLEMENTING GENERIC TYPE
        Collections.sort(people ,new AgeComparator());
        System.out.println("Sorted :"+ people);

        // PASSING A PARAMETER TO A GENERIC TYPE
        Collections.sort(people ,new ReverseComparator<>(new AgeComparator()));
        System.out.println("Reverse order :" +people);

    }
}
