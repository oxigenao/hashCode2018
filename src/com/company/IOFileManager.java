package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by orti9 on 08/02/2016.
 */
public class IOFileManager {


    final static Charset ENCODING = StandardCharsets.US_ASCII;
    private Path InputFilePath;
    private Path OutputFilePath;
    private ArrayList<String> OutPutLines = new ArrayList<>();

    public IOFileManager(String InputFile,String OutputFile){
        this.InputFilePath =  Paths.get(InputFile);
        this.OutputFilePath = Paths.get(OutputFile);
    };

    // le del fichero  y  lo introduce en la matrix
    public ArrayList<ArrayList<String>> ReadFromFile(){

        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

        try (Scanner scanner =  new Scanner(InputFilePath, ENCODING.name())){

            while (scanner.hasNextLine()){

                data.add(new ArrayList<>(Arrays.asList(scanner.nextLine().split(" "))));

                //process each line in some way

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return  data;

    }
    //inicializa la matriz tras leer la priemra linea

    //escribe en la lista de string de salida
    public void WriteLineToOutputList(int idx,String data)  {
        OutPutLines.add(idx,data);

    }
    //vuelca la lista de string de salida en un fichero
    public void writeToOutput()throws IOException{
        Files.write(OutputFilePath, OutPutLines, ENCODING);
    }
}
