package ru.yandex.practicum.oop.library.model;

public class Book extends LibraryItem {
    int publishYear;

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    Author author;
}
