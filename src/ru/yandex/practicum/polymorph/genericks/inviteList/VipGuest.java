package ru.yandex.practicum.polymorph.genericks.inviteList;

class VipGuest extends Guest {

    public VipGuest(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getGuestDescription() {
        return "VIP-гость: " + name + " " + surname;
    }
}
