package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(){}

    public Post (String text){
        this.id = id;
        this.text = text;
        this.likes = 0;
        this.creationDate = new Date();
    }

    public Long getId() { return id; }

    public Date getCreationDate() { return creationDate; }
    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }
}
