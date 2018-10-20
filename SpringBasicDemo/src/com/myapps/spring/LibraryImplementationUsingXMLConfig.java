package com.myapps.spring;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryImplementationUsingXMLConfig {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ctx.registerShutdownHook();
		Book theBook = (Book) ctx.getBean("book");
		System.out.println("\n"+theBook.getName() + " by:" + theBook.getAuthor() + " is: " + (theBook.isAvailable()?"available": "NOT available"));
		
		System.out.println("\nOther books in the library");
		
		Library library = (Library) ctx.getBean("library");
		List<Book> list = library.getBooks();
		
		System.out.println();
		for(Book book:list){
			printBookJson(book);
			//System.out.println(book.getName()+" by "+book.getAuthor() + " is: " + (book.isAvailable()?"available": "NOT available"));
		}
		System.out.println();
	}
	
	private static void printBookJson(Book book){
		
	}
}
