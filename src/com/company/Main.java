package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader;
        FileWriter fileWriter;
        String nameOfFile = "firstFile.txt";

        try {
            File fileSize = new File(nameOfFile);
            try{
                File file = new File(nameOfFile);
                if(!file.canRead()){
                    throw new FileNotFoundException("Файл не доступен!");
                }
            }catch (FileNotFoundException fnf){
                System.out.println(fnf.getMessage());
            }
            if (fileSize.length() > 100) {
                throw new IllegalStateException("Код слишком большой!");
            }
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
        try{
            fileReader = new FileReader(nameOfFile);
            fileWriter = new FileWriter("secondFile.txt");
            Scanner in = new Scanner(fileReader);
            String str = "";
            while(in.hasNextLine()){
                str += in.next();
            }
            fileWriter.write(str);
            fileReader.close();
            fileWriter.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
