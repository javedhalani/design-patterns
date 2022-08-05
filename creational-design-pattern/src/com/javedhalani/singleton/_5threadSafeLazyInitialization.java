package com.javedhalani.singleton;

import java.util.Objects;

public class _5threadSafeLazyInitialization {

    public static void main(String[] args) {
        System.out.println("Singleton Thread Safe Lazy Initialization");

        Singleton instance = Singleton.getInstance();

    }

    private static class Singleton {

        private static Singleton instance;
        private Singleton() {

        }

        public static Singleton  getInstance() {
            /* Here we are initializing the instance when the method getInstance is called,
             * hence lazy initialization. Compared to the previous implementation,
             * here we synchronize near to the creation, hence we have double-checking.
             * */
            if(Objects.isNull(instance)) {
                synchronized (Singleton.class){
                    if(Objects.isNull(instance)) {
                        try {
                            instance = new Singleton();
                        } catch (Exception e) {
                            throw new RuntimeException("Exception occurred when creating singleton instance");
                        }
                    }
                }

            }
            return instance;
        }
    }
}
