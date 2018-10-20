package com.myapps.spring;

import java.util.List;

public class Library {
	List<Book> books = null;

	public void initialize(){
		System.out.println("Initializing library with books");
	}
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void shutdown(){
		System.out.println("The library has shut down");
	}
}
