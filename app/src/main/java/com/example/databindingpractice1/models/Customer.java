package com.example.databindingpractice1.models;

public class Customer {
    String cname;

    public Customer(String cname) {
        this.cname = cname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
