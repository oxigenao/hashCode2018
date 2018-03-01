package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>>  data;

        // String inputFile ="/Users/pablo/IdeaProjects/HashCode2018/src/com/company/a_example.in";
        // String outputFile ="/Users/pablo/IdeaProjects/HashCode2018/src/com/company/a_example.out";

        String inputFile ="/Users/benru/Workspace/hashCode2018/src/com/company/a_example.in";
        String outputFile ="/Users/benru/Workspace/hashCode2018/src/com/company/a_example.out";
        IOFileManager fileManager = new IOFileManager(inputFile, outputFile);


        data = fileManager.ReadFromFile();
        System.out.println(data);


    }
}
