package ru.yandex.practicum.polymorph.genericks.inviteList;

class Guest {

    String name;
    String surname;

    public Guest(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getGuestDescription() {
        return "Гость: " + name + " " + surname;
    }
}
