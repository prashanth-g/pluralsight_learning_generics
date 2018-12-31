package com.prashanth.pluralsight.learning.generics;

public class InjectorMain {
    public static void main(String[] args) {
        Injector injector = new Injector().with("HW");

        Logger logger = injector.newInstance(Logger.class);
        logger.log();
    }
}
