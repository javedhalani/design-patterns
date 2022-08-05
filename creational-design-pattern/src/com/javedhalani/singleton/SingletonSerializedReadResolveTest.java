package com.javedhalani.singleton;

import java.io.*;

public class SingletonSerializedReadResolveTest {

    public static void main(String[] args) throws
            FileNotFoundException, IOException, ClassNotFoundException {
        _7SerializedSingletonReadResolve.Singleton instance1 = _7SerializedSingletonReadResolve.Singleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.ser"));
        out.writeObject(instance1);
        out.close();

        // Deserialize from file to object
        ObjectInput input = new ObjectInputStream(new FileInputStream("test.ser"));
        _7SerializedSingletonReadResolve.Singleton instance2 = (_7SerializedSingletonReadResolve.Singleton) input.readObject();
        input.close();

        System.out.println("Instance 1 Hash = "+instance1.hashCode());
        System.out.println("Instance 2 Hash = "+instance2.hashCode());


    }
}
