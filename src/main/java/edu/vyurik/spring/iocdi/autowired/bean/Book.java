package edu.vyurik.spring.iocdi.autowired.bean;

public class Book {
    private Long id;
    private String isbn;
    private String title;
    private Float price;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book - Id: " + id 
            + ", ISBN: " + isbn + ", Title: " + title 
            + ", Price: " + price;
    }
}
