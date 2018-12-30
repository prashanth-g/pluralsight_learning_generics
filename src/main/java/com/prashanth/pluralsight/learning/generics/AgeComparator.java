package com.prashanth.pluralsight.learning.generics;

import sun.dc.path.PathError;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(final Person left, Person right) {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
