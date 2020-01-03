package com.pluralsight.fundamentals.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "snack")
public class Snack {
    @Id
    private String id;
    private String name;
    private Float amount;

    public Snack() {

    }

    public Snack(String id) {
        this.id = id;
    }

    public Snack(String name, Float amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Snack [id=" + id + ", name=" + name + ", amount=" + amount + "]";
    }

}

/*

    @Transient
    var reviews: List<Review> = ArrayList()

*/
