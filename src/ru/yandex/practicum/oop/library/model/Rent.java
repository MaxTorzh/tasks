package ru.yandex.practicum.oop.library.model;

import java.time.LocalDate;

public class Rent implements HasId {
    User user;
    LibraryItem libraryItem;
    LocalDate returnDate;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LibraryItem getLibraryItem() {
        return libraryItem;
    }

    public void setLibraryItem(LibraryItem libraryItem) {
        this.libraryItem = libraryItem;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public int getId() {
        return 0;
    }
}
