package com.javedhalani.singleton;

public class _6billPughLazyInitialization {

    public static void main(String[] args) {
        System.out.println("Singleton Bill Pugh Lazy Initialization");

        Singleton instance = Singleton.getInstance();

    }

    private static class Singleton {
        private Singleton() {

        }

        private static final class SingletonHelper {
            public static final Singleton INSTANCE = new Singleton();
        }

        public static Singleton  getInstance() {
            /* Here we are initializing the instance when the method getInstance is called using nested class,
             * hence lazy initialization. Compared to the previous implementation,
             * the nested class is loaded when the getInstance method is called. On class loading the instance
             * is created. Hence, subsequent calls will not create the class. This is a very simple implementation and
             * is also thread safe.
             * */
            return SingletonHelper.INSTANCE;
        }
    }
}
