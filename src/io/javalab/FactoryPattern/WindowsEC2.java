package io.javalab.FactoryPattern;

public class WindowsEC2 implements EC2Lunch {


    @Override
    public void descriptionDetails() {
        System.out.println("Lunching Windows2016 Instance with 30GB root vol in Ohio Region with per/hour billing");
    }
}
