package com.javedhalani.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        _1eagerInitialization.Singleton instance1 = _1eagerInitialization.Singleton.getInstance();
        _1eagerInitialization.Singleton instance2 = null;

        try {
            Constructor[] constructors = _1eagerInitialization.Singleton.class.getDeclaredConstructors();
            for (Constructor constructor: constructors) {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (_1eagerInitialization.Singleton) constructor.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}
