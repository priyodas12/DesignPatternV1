package io.javalab.FactoryDesignPattern;

public class EC2Factory {

    public EC2Lunch lunchCustomizedEC2Instance(String type){

        if (type == null || type.isEmpty()) {
            return null;
        }
        if ("linux".equals(type)) {
            return new LinuxEC2();
        }
        else if ("windows".equals(type)) {
            return new WindowsEC2();
        }
        return null;

    }
}
