package com.javedhalani.singleton;

import java.io.Serializable;

public class _7SerializedSingleton {

    public static void main(String[] args) {
        System.out.println("Singleton Bill Pugh (Serialized) Lazy Initialization");

        Singleton instance = Singleton.getInstance();

    }

    static class Singleton implements Serializable {
        private Singleton() {

        }

        private static final class SingletonHelper {
            public static final _7SerializedSingleton.Singleton INSTANCE = new _7SerializedSingleton.Singleton();
        }

        public static Singleton  getInstance() {
            /* Here we are initializing the instance when the method getInstance is called using nested class,
             * hence lazy initialization. Compared to the previous implementation,
             * the nested class is loaded when the getInstance method is called.
             * On class loading the instance is created. Hence, subsequent calls will not create the class.
             * This is a very simple implementation and is also thread safe.
             * However, it will break if we try to serialize and then deserialize.
             * */
            return SingletonHelper.INSTANCE;
        }
    }
}
