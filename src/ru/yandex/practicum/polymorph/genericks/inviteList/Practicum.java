package ru.yandex.practicum.polymorph.genericks.inviteList;

import java.util.ArrayList;

public class Practicum {

    public static void main(String[] args) {
        Guest guest1 = new Guest("Николай", "Яблонев");
        Guest guest2 = new Guest("Екатерина", "Майская");
        VipGuest guest3 = new VipGuest("Иван", "Комаров");

        ArrayList<Guest> guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);

        ArrayList<VipGuest> bestFriends = new ArrayList<>();
        bestFriends.add(guest3);

        //создаём список гостей с использованием wildcard
        GuestsList<Guest> allGuestsList = new GuestsList<>();

        //приглашаем обычных гостей
        allGuestsList.invite(guests);
        //приглашаем лучших друзей
        allGuestsList.invite(bestFriends);

        allGuestsList.printAllGuests();

    }
}
