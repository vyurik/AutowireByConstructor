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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Category category = (Category) object;
        return java.util.Objects.equals(id, category.id) && java.util.Objects.equals(name, category.name) && java.util.Objects.equals(book, category.book);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, name, book);
    }
}
