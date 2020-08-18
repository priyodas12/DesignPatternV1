package io.javalab.SingletonDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Singleton singleton1=Singleton.getOnlyInstance();
        Singleton singleton2=Singleton.getOnlyInstance();

        System.out.println("singleton1.equals(singleton2)="+singleton1.equals(singleton2));
        System.out.println(singleton1.hashCode()+","+singleton2.hashCode());

        //reflection
        Class c=Class.forName("io.javalab.SingletonDesignPattern.Singleton");

        Constructor<Singleton> cons= c.getDeclaredConstructor();

        //violating the encapsulation rule
        cons.setAccessible(true);

        Singleton singleton3=cons.newInstance();

        System.out.println("singleton1.equals(singleton3)="+singleton1.equals(singleton3));
        System.out.println(singleton1.hashCode()+","+singleton3.hashCode());


    }
}
