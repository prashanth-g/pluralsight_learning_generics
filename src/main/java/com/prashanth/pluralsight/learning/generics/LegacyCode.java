package com.prashanth.pluralsight.learning.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("String");
        list.add(1);
        list.add(new Object());

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            final Object element = iterator.next();
            System.out.println(element);
        }
    }
}
