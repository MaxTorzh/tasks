package ru.yandex.practicum.oop.library.model;

public class Author implements HasId {
    private int id;
    private String fullName;

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
