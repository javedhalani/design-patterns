package com.javedhalani.singleton;

import java.io.ObjectStreamException;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class _7SerializedSingletonReadResolve {

    public static void main(String[] args) {
        System.out.println("Singleton Bill Pugh (Serialized) Lazy Initialization");

        Singleton instance = Singleton.getInstance();

    }

    static class Singleton implements Serializable {
        private Singleton() {

        }

        private static final class SingletonHelper {
            public static final _7SerializedSingletonReadResolve.Singleton INSTANCE = new _7SerializedSingletonReadResolve.Singleton();
        }

        @Serial
        private Object readResolve() throws ObjectStreamException {
            return getInstance();
        }


        public static Singleton  getInstance() {
            /* Here we are initializing the instance when the method getInstance is called using nested class,
             * hence lazy initialization. Compared to the previous implementation,
             * the nested class is loaded when the getInstance method is called.
             * On class loading the instance is created. Hence, subsequent calls will not create the class.
             * This is a very simple implementation and is also thread safe.
             * We also implement the readResolve method so that object is created after the deserialization process.
             * */
            return SingletonHelper.INSTANCE;
        }
    }
}
