package com.prashanth.pluralsight.learning.generics;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Injector {
    private Map<Class<?>, Object> objectGraph = new HashMap<>();

    public Injector with(Object value) {
        objectGraph.put(value.getClass(), value);
        return this;
    }

    public <T> T newInstance(final Class<T> type) {
        return (T) objectGraph.computeIfAbsent(type, this::instantiate);
    }

    private Object instantiate(Class<?> type) {
        try {
            return type.getDeclaredConstructors()[0]
                    .newInstance(this.objectGraph.get(String.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
