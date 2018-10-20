package com.myapps.spring;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfig {

	// Sample config as it appears in XML file:
	/*<bean id="library" class="com.myapps.spring.Library">
	<property name="books">*/
	
	@Bean(initMethod="initialize", destroyMethod="shutdown")
	
	public Library library(List<Book> books){
		Library library = new Library();
		library.setBooks(books);
		return library;
	}
	
	// Sample config as it appears in XML file:
	/*<bean id="book1" class="com.myapps.spring.Book">
		<property name="name" value="The wings of fire" />
		<property name="author" value="Dr. A.P.J. Abdul Kalam" />
		<property name="category" value="Autobiographies" />
		<property name="available" value="true" />
	</bean>*/
	
	@Bean(initMethod="initialize", destroyMethod="shutdown")
	public Book book1(){
		Book book = new Book();
		book.setName("My Life In Tibet");
		book.setAuthor("Guru Ding Le Mei");
		book.setAvailable(true);
		book.setCategory("Philosophical");
		return book;
	}
	
	@Bean(initMethod="initialize", destroyMethod="shutdown")
	public Book book2(){
		Book book = new Book();
		book.setName("My experiments with truth");
		book.setAuthor("M.k. Gandhi");
		book.setAvailable(true);
		book.setCategory("Philosophical");
		return book;
	}
	
	@Bean(initMethod="initialize", destroyMethod="shutdown")
	public Book book3(){
		Book book = new Book();
		book.setName("Discovery of India");
		book.setAuthor("Jawaharlal Nehru");
		book.setAvailable(false);
		book.setCategory("History");
		return book;
	}
	
}