package com.javedhalani.singleton;

public class _2staticBlockInitialization {

    public static void main(String[] args) {
        System.out.println("Singleton Static Block Initialization");

        Singleton instance = Singleton.getInstance();

    }

    private static class Singleton {

        private static final Singleton instance;

        /* Here we are initializing the instance when the class loads in the static block.
         * Only advantage compared to early initialization is that we can do error handling,
         * This is fine if the creation is simple. But if it is intensive like
         * connecting to Database or Filesystems then it makes sense to initialize
         * when the getInstance method is called.
         * */
        static {
            try {
                instance = new Singleton();
            } catch (Exception e) {
                throw new RuntimeException("Exception occurred when creating singleton instance");
            }
        }
        private Singleton() {

        }

        static public Singleton  getInstance() {
            return instance;
        }
    }
}
