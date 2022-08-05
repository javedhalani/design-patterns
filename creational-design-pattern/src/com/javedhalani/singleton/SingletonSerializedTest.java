package com.javedhalani.singleton;

import java.io.*;

public class SingletonSerializedTest {

    public static void main(String[] args) throws
            FileNotFoundException, IOException, ClassNotFoundException {
        _7SerializedSingleton.Singleton instance1 = _7SerializedSingleton.Singleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialize from file to object
        ObjectInput input = new ObjectInputStream(new FileInputStream("test.ser"));
        _7SerializedSingleton.Singleton instance2 = (_7SerializedSingleton.Singleton) input.readObject();
        input.close();

        System.out.println("Instance 1 Hash = "+instance1.hashCode());
        System.out.println("Instance 2 Hash = "+instance2.hashCode());


    }
}
