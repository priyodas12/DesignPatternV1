package io.javalab.SingletonDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonViolationByClone {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, CloneNotSupportedException {

        Singleton singleton1=Singleton.getOnlyInstance();

        //Clone
        Singleton singleton3= (Singleton) singleton1.clone();

        System.out.println("singleton1.equals(singleton3)="+singleton1.equals(singleton3));
        System.out.println(singleton1.hashCode()+","+singleton3.hashCode());
    }
}
