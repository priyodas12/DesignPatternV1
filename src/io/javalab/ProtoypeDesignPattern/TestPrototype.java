package io.javalab.ProtoypeDesignPattern;

import java.util.List;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        AwsExamTopic awsExamTopicNow=new AwsExamTopic();
        awsExamTopicNow.insertUpdatedTopic();

        AwsExamTopic awsExamTopicUpdated= (AwsExamTopic) awsExamTopicNow.clone();
        List<String> currentList=awsExamTopicUpdated.getImportantTopics();
        currentList.add("Lambda");
        currentList.remove("Cloudwatch");

        awsExamTopicNow.getImportantTopics().forEach(System.out::println);

        System.out.println("--------------------------------------------");;

        awsExamTopicUpdated.getImportantTopics().forEach(System.out::println);
    }
}
