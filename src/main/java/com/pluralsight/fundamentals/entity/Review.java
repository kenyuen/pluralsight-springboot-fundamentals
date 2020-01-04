package com.pluralsight.fundamentals.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
public class Review {
    @Id
    private String id;
    private Integer rating;
    private String text;
    private String snackId;

    public Review() {
    }

    public Review(Integer rating, String text, String snackId) {
        this.rating = rating;
        this.text = text;
        this.snackId = snackId;
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

    public String getSnackId() {
        return snackId;
    }

    public void setSnack_id(String snackId) {
        this.snackId = snackId;
    }

    @Override
    public String toString() {
        return "Review [id=" + id + ", rating=" + rating + ", text=" + text + ", snackId=" + snackId + "]";
    }
}
