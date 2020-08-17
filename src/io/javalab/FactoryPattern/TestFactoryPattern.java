package io.javalab.FactoryPattern;

public class TestFactoryPattern {
    public static void main(String[] args) {

        EC2Factory ec2Factory=new EC2Factory();

        ec2Factory.lunchCustomizedEC2Instance("windows").descriptionDetails();
    }

}
