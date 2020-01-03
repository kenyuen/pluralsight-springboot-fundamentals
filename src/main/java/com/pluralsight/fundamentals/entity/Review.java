package com.pluralsight.fundamentals.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    @Id
    private String id;
    private Integer rating;
    private String text;

    public Review() {
    }

    public Review(String id) {
        this.id = id;
    }

    public Review(Integer rating, String text) {
        this.rating = rating;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", rating=" + rating + ", text=" + text + "]";
    }
}
