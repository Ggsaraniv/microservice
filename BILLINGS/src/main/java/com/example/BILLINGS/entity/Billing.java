package com.example.BILLINGS.entity;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
@Entity
@Table(name="billing")
public class Billing {
	 public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(int transactionId) {
		TransactionId = transactionId;
	}
	public LocalTime getTime() {
		return Time;
	}
	public void setTime(LocalTime time) {
		Time = time;
	}
	public String getPaid() {
		return Paid;
	}
	public void setPaid(String paid) {
		Paid = paid;
	}
	@ Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int Id;
	private String Name;
	@Column(name = "transaction_id")
	private int TransactionId;
	private  LocalTime Time;
	private String Paid;
}
