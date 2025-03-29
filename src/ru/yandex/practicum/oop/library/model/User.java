package ru.yandex.practicum.oop.library.model;

import java.time.LocalDate;

public class User implements HasId {
    int id;
    String fullName;
    LocalDate dateOfBirth;

    @Override
    public int getId() {
        return 0;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
