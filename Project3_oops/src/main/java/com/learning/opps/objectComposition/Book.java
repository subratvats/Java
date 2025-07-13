package com.learning.opps.objectComposition;

import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String author;

    private ArrayList<Review> reviews = new ArrayList<>();

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void setReview(Review review) {
        this.reviews.add(review);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", review=" + reviews +
                '}';
    }
}
