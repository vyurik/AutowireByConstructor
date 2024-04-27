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

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Book book = (Book) object;
        return java.util.Objects.equals(id, book.id) && java.util.Objects.equals(isbn, book.isbn) && java.util.Objects.equals(title, book.title) && java.util.Objects.equals(price, book.price);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id, isbn, title, price);
    }
}
