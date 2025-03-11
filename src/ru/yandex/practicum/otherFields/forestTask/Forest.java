package ru.yandex.practicum.otherFields.forestTask;

import java.util.ArrayList;

public class Forest {
    private ArrayList<MountainHare> hares;

    // объявите недостающие переменные и добавьте конструктор
    private static String season;

    public Forest(ArrayList<MountainHare> hares) {
        this.hares = hares;
    }

    // добавьте метод setSeason(String newSeason)
    // в этом методе реализуйте логику смены цвета шубок зайцев-беляков
    public static void setSeason(String newSeason) {
        season = newSeason;
        if (season.equals("зима")) {
            MountainHare.color = "белый";
        } else {
            MountainHare.color = "серо-рыжий";
        }
    }

    // добавьте метод printHares()
    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}