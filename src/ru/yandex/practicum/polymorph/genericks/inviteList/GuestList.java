package ru.yandex.practicum.polymorph.genericks.inviteList;

import java.util.ArrayList;

class GuestsList <T extends Guest> {
    ArrayList<T> guests = new ArrayList<>();

    public void invite(ArrayList<? extends T> guestsToInvite) {
        for (T guest : guestsToInvite) {
            guests.add(guest);
        }
    }

    public void printAllGuests() {
        for (T guest : guests) {
            System.out.println(guest.getGuestDescription());
        }
    }
}
