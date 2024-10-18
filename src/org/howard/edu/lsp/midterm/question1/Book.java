package org.howard.edu.lsp.midterm.question1;

/**
 * The Book class represents a book in a library.
 * 
 * It contains attributes like title, author, ISBN, and year published, and
 * includes methods to compare two Book objects based on ISBN and author.
 * 
 * @version 1.0
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructor to initialize a Book object with given attributes.
     * 
     * @param title         The title of the book.
     * @param author        The author of the book.
     * @param ISBN          The unique ISBN of the book.
     * @param yearPublished The year the book was published.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // Getters and setters for encapsulation
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Overrides equals method to compare two books based on ISBN and author.
     * 
     * @param obj The object to be compared with this Book.
     * @return true if the books have the same ISBN and author, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    /**
     * Overrides toString method to provide a string representation of the Book
     * object.
     * 
     * @return A string representation of the Book object.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
