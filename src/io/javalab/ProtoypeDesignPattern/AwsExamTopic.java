package io.javalab.ProtoypeDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AwsExamTopic implements Cloneable{

    public List<String> importantTopics;

    public AwsExamTopic(List<String> importantTopics) {
        this.importantTopics = importantTopics;
    }

    public AwsExamTopic(){
        //default constructor
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> tempList=new ArrayList<>();
        tempList.addAll(this.getImportantTopics());
        return new AwsExamTopic(tempList);
    }

    public void insertUpdatedTopic() {
        String [] topics={"EC2","EBS","S3","RDS","DynamoDB","VPC","Cloudwatch"};
        importantTopics=new ArrayList<>();
        importantTopics.addAll(Arrays.asList(topics));
    }

    public List<String> getImportantTopics(){
        return importantTopics;
    }
}
