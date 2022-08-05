package com.javedhalani.singleton;

public class _1eagerInitialization {

    public static void main(String[] args) {
        System.out.println("Singleton Eager Initialization");

        Singleton instance = Singleton.getInstance();

    }

    static class Singleton {
        /* Here we are initializing the instance when the class loads.
        * This is fine if the creation is simple. But if it is intensive like
        * connecting to Database or Filesystems then it makes sense to initialize
        * when the getInstance method is called.
        * */
        private static final Singleton instance = new Singleton();

        private Singleton() {

        }

        static public Singleton  getInstance() {
            return instance;
        }
    }
}
