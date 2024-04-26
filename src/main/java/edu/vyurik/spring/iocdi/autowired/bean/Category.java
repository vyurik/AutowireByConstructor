package edu.vyurik.spring.iocdi.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Category {
    private Long id;
    private String name;
	
    private Book book;
    
    // for autowiring by constructor
	//@Autowired
	public Category(Long id, String name, @Qualifier("bookPushkin") Book book) {
		System.out.println("Autowiring by constructor used");
		this.id = id;
		this.name = name;
		this.book = book;
	}
	
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Book getBook() {
		return book;
    }
	
	//No need for setter when Autowired by Constractor.
	
    public String toString() {
        return "Category -- Id: " + id + ", Name: " + name + ", Book : " + book.toString(); 
    }

}
