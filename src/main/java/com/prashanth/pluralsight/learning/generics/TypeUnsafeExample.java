package com.prashanth.pluralsight.learning.generics;

public class TypeUnsafeExample {
    public static void main(String[] args) {
        CircularBuffer<String> circularBuffer = new CircularBuffer<String>(10);

        circularBuffer.offer("pe");
        circularBuffer.offer("r");
        circularBuffer.offer("fect");

        String value = concatenate(circularBuffer);
        System.out.println(value);

    }

    private static String concatenate(CircularBuffer<String> circularBuffer) {
        StringBuilder result = new StringBuilder();

        String value;
        while((value = circularBuffer.poll()) != null) {
            result.append(value);
        }
        return result.toString();
    }
}
