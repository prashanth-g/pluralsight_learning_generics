package com.prashanth.pluralsight.learning.generics;

import java.util.List;

public class Erasure<T, B extends Comparable<B>> {
    public void unbounded() {}

    public void lists(List<String> param, List<List<B>> param2) {
        String s = param.get(0);
    }

    public void bounded(B param) {}
}
