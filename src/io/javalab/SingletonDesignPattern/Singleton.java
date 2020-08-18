package io.javalab.SingletonDesignPattern;

public class Singleton {

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
}
