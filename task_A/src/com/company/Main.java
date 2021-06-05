package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("song1.txt");
        Song song = new Song();
        Scanner in = new Scanner(fileReader);

        song.setName(in.nextLine());
        song.setAuthor(in.nextLine());
        song.setGenre(in.nextLine());

        String str = "";
        while(in.hasNextLine()){
            str += in.nextLine();
            str += "\n";
        }
        song.setTextOfSong(str);
        fileReader.close();
        System.out.println(song.getName());
        System.out.println(song.getAuthor());
        System.out.println(song.getGenre());
        System.out.println(song.getTextOfSong());
    }
}
