package com.prashanth.pluralsight.learning.generics;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReifiableExamples {
    public static void main(String[] args) {

        List<String> text = new ArrayList<>();
        Class<?> arrayList = text.getClass();
        final TypeVariable<? extends Class<?>>[] typeParameters = arrayList.getTypeParameters();
        System.out.println(Arrays.toString(typeParameters));

        final ParameterizedType genericSuperclass = (ParameterizedType) StringList.class.getGenericSuperclass();
        System.out.println(Arrays.toString(genericSuperclass.getActualTypeArguments()));
    }

    public static class StringList extends ArrayList<String> {

    }
}
