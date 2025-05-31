package com.example.BILLINGS.ResponseDTO;

import java.time.LocalTime;

import lombok.Data;

import java.time.LocalTime;

public class ResponseDTO {

    private int id;
    private String name;
    private int transactionId;
    private LocalTime time;
    private String paid;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public String getPaid() {
        return paid;
    }
    public void setPaid(String paid) {
        this.paid = paid;
    }
}
