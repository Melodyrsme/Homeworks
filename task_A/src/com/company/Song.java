package com.company;

public class Song {
    private String name;
    private String Author;
    private String textOfSong;
    private String genre;

    public Song(){
    }

    public Song(String name, String author, String textOfSong, String genre) {
        this.name = name;
        Author = author;
        this.textOfSong = textOfSong;
        this.genre = genre;
    }

    @Override
    public String toString(){
        return String.format("Название песни - %s\nИсполнитель - %s\nЖанр песни - %s\nТекст песни:\n%s\n",
                this.name, this.Author, this.genre, this.textOfSong);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTextOfSong() {
        return textOfSong;
    }

    public void setTextOfSong(String textOfSong) {
        this.textOfSong = textOfSong;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
