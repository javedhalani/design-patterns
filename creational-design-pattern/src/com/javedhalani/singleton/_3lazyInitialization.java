package com.javedhalani.singleton;

import java.util.Objects;

public class _3lazyInitialization {

    public static void main(String[] args) {
        System.out.println("Singleton Lazy Initialization");

        Singleton instance = Singleton.getInstance();

    }

    private static class Singleton {

        private static Singleton instance;
        private Singleton() {

        }

        static public Singleton  getInstance() {
            /* Here we are initializing the instance when the method getInstance is called,
             * hence lazy initialization. However, this works fine in case of Single threaded environment.
             * In multithreaded env, it may happen two threads enter the if condition, then we will have
             * two instances.
             * */
            if(Objects.isNull(instance)) {
                try {
                    instance = new Singleton();
                } catch (Exception e) {
                    throw new RuntimeException("Exception occurred when creating singleton instance");
                }
            }
            return instance;
        }
    }
}
