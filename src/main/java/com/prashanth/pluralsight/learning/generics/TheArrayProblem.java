package com.prashanth.pluralsight.learning.generics;

import java.util.Arrays;

public class TheArrayProblem {
    public static void main(String[] args) {

        Person shennyOlei = new Person("Shenny Olei", 92);
        Person motirJulosi = new Person("Motir Julosi", 72);

        Person[] madMen = {shennyOlei, motirJulosi};

        System.out.println(Arrays.toString(madMen));

        Person shelyCucoi = new Person("Shely Cucoi", 53);

        madMen = add(shelyCucoi, madMen);

        System.out.println(Arrays.toString(madMen));
    }

    private static Person[] add(final Person person, Person[] madMen) {
        final int length = madMen.length;
        madMen = Arrays.copyOf(madMen, length + 1);
        madMen[length] = person;
        return madMen;
    }
}
