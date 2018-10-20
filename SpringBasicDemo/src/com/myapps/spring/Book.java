package com.myapps.spring;

public class Book {
	String name, author, category;
	boolean available;
	
	public Book(String name, String author, String category) {
		super();
		this.name = name;
		this.author = author;
		this.category = category;
	}

	public Book() {
		super();
	}

	public void initialize(){
		System.out.println("Initializing book: " + name);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void shutdown(){
		System.out.println("Destroying book: " + name);
	}
}
