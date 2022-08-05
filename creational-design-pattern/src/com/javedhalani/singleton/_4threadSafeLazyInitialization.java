package com.javedhalani.singleton;

import java.util.Objects;

public class _4threadSafeLazyInitialization {

    public static void main(String[] args) {
        System.out.println("Singleton Thread Safe Lazy Initialization");

        Singleton instance = Singleton.getInstance();

    }

    private static class Singleton {

        private static Singleton instance;
        private Singleton() {

        }

        public static synchronized Singleton  getInstance() {
            /* Here we are initializing the instance when the method getInstance is called,
             * hence lazy initialization. As we have used the synchronized keyword on the method,
             * hence it will be thread safe.However, it has a hit on the performance since now there
             * will be additional overhead whenever the method is accessed.
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
