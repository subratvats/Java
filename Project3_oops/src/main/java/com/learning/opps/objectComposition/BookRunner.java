package com.learning.opps.objectComposition;



public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(1,"OOPS","SUbrat");
        book.setReview(new Review(1,"Great book",5));
        book.setReview(new Review(2,"Amazing book",5));

        System.out.println(book);
    }
}
