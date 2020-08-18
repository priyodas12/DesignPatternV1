package io.javalab.SingletonDesignPattern;

import java.io.Serializable;

// implementation of Serializable,Cloneable is for violation test cases;

public class Singleton implements Serializable,Cloneable {

    private static Singleton onlyInstance=new Singleton();

    private Singleton() {
        System.out.println("creating single object....");
    }

    public static Singleton getOnlyInstance(){
        return onlyInstance;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
