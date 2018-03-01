package com.company;

public class Main {

    public static void main(String[] args) {


        // String inputFile ="/Users/pablo/IdeaProjects/HashCode2018/src/com/company/a_example.in";
        // String outputFile ="/Users/pablo/IdeaProjects/HashCode2018/src/com/company/a_example.out";

        String inputFile ="/Users/benru/Workspace/hashCode2018/src/com/company/a_example.in";
        String outputFile ="/Users/benru/Workspace/hashCode2018/src/com/company/a_example.out";
        IOFileManager fileManager = new IOFileManager(inputFile, outputFile);


        System.out.println(fileManager.ReadFromFile());


    }
}
