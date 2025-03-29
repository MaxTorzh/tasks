package ru.yandex.practicum.oop.library.model;

public abstract class LibraryItem implements HasId {
    private int id;
    private String isbn;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }
}
