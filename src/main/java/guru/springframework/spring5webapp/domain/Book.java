package guru.springframework.spring5webapp.domain;

import java.util.Set;

public class Book {
    private String tittle;
    private String isbn;
    private Set<Author> authors;

    public Book() {
    }

    public Book(String tittle, String isbn, Set<Author> authors) {
        this.tittle = tittle;
        this.isbn = isbn;
        this.authors = authors;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
