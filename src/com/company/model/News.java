package com.company.model;

import java.util.Date;

public class News {
    private int id;
    private String title;
    private String text;
    private Date publicationTime;

    public News() {
    }

    public News(int id, String title, String text, Date publicationTime) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.publicationTime = publicationTime;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", publicationTime=" + publicationTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }
}
