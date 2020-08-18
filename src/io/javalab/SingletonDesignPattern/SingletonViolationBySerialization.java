package io.javalab.SingletonDesignPattern;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonViolationBySerialization {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {

        Singleton singleton1=Singleton.getOnlyInstance();

        //serialization
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        objectOutputStream.writeObject(singleton1);

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("singleton.ser"));
        Singleton singleton3= (Singleton) objectInputStream.readObject();

        System.out.println("singleton1.equals(singleton3)="+singleton1.equals(singleton3));
        System.out.println(singleton1.hashCode()+","+singleton3.hashCode());
    }
}
