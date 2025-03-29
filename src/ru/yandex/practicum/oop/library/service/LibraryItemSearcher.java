package ru.yandex.practicum.oop.library.service;

import ru.yandex.practicum.oop.library.model.Author;
import ru.yandex.practicum.oop.library.model.Book;
import ru.yandex.practicum.oop.library.model.LibraryItem;

import java.util.ArrayList;
import java.util.Collection;

public class LibraryItemSearcher {
    public Collection<Book> findByAuthor (Author author) {
        return new ArrayList<>();
    }

    public Collection<LibraryItem> findByName(String name) {
        return new ArrayList<>();
    }
}
