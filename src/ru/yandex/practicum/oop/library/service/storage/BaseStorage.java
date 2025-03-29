package ru.yandex.practicum.oop.library.service.storage;

import ru.yandex.practicum.oop.library.model.HasId;

public abstract class BaseStorage <T extends HasId> {
    public abstract void save(T item);

    public abstract T get(int id);
}
