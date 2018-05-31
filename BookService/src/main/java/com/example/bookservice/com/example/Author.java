package com.example.bookservice.com.example;

import org.springframework.stereotype.Repository;

@Repository
public class Author{
    long authorId;
    String name;

    public Author() {
    }

    public Author(long authorId, String name) {
        this.authorId = authorId;
        this.name = name;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
