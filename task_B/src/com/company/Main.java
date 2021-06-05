package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Song song = new Song("Nothing else matters", "Metallica", "So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters", "«Power ballad»");

        FileWriter fileWriter = new FileWriter("song2.txt");
        fileWriter.write(song.toString());
        fileWriter.close();
    }
}
