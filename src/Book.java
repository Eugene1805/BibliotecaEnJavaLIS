import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private String isbn;
    private String gender;
    private String author;
    private Integer publicationYear;
    private Integer availableCopies;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(Integer availableCopies) {
        this.availableCopies = availableCopies;
    }

    public void push(Book book){
        System.out.println("Libro agregado exitosamente");
    }

    public void pop(Book book){
        System.out.println("Libro eliminado exitosamente");
    }

    public void update(Book book){
        System.out.println("Libro actualizado correctamente");
    }

    @org.jetbrains.annotations.NotNull
    public static List<Book> getMostBorrowed(){
        System.out.println("Top más prestados");
        List<Book> top = new ArrayList<>();
        return top;
    }

    public static @NotNull List<Book> getLessBorrowed(){
        System.out.println("Top menos prestados");
        List<Book> top = new ArrayList<>();
        return top;
    }
}

