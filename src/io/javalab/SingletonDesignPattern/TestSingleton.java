package io.javalab.SingletonDesignPattern;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton singleton1=Singleton.getOnlyInstance();
        Singleton singleton2=Singleton.getOnlyInstance();

        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1.hashCode()+","+singleton2.hashCode());
    }
}
