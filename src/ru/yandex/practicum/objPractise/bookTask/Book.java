package ru.yandex.practicum.objPractise.bookTask;

import java.util.Objects;

class Book {
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false; // можно оформить и так
        Book otherBook = (Book) obj;
        return Objects.equals(title, otherBook.title) &&
                Objects.equals(author, otherBook.author);
    }

    // переопределите hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    public class Practicum {
        public static void main(String[] args) {
            Book book1 = new Book("Три мушкетёра", "Александр Дюма");
            Book book2 = new Book("Три мушкетёра", "Александр Дюма");
            System.out.println(book1.hashCode());
            System.out.println(book2.hashCode());
        }
    }
}