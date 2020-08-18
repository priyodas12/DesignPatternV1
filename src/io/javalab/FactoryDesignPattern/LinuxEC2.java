package io.javalab.FactoryDesignPattern;

public class LinuxEC2 implements EC2Lunch{

    @Override
    public void descriptionDetails() {
        System.out.println("Lunching Linux Instance with 8GB root vol in Mumbai Region with per/sec billing");
    }

}
