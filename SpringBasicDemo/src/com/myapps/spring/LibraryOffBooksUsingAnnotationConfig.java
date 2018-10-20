package com.myapps.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class LibraryOffBooksUsingAnnotationConfig {

	public static void main(String[] args) {
		//getSingleBookInfo();
		getAllBooksInfo();
	}
	
	public static void getSingleBookInfo() {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(LibraryConfig.class);
		
		Book book = (Book) ctx.getBean("book1");
		showBookInfo(book);
	}
	
	public static void getAllBooksInfo() {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(LibraryConfig.class);
		
		Library library = (Library) ctx.getBean("library");
		List<Book> list = library.getBooks();
		
		for(Book book:list){
			showBookInfo(book);
		}
	}
	
	private static void showBookInfo(Book book){
		System.out.println("--" + book.getName() + "-- by " + book.getAuthor() + " : " + (book.isAvailable()?"available": "NOT available"));
	}
}
