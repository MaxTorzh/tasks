package ru.yandex.practicum.polymorph.genericks.contacts;

// дополните объявление класса Contact
abstract class Contact {
    // класс должен содержать одно полe — имя пользователя name
    private final String name;

    public Contact(String name) {
        this.name = name;
    }

    // и два три метода — getName(), sendMessage() для отправки сообщения и print() для печати информации о контакте
    public String getName() {
        return name;
    }
    public void sendMessage() {
        System.out.println("Сообщение отправлено.");
    }
    public void print() {
        System.out.println("Имя пользователя: " + name);
    }
}
