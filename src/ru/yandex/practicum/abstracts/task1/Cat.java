package ru.yandex.practicum.abstracts.task1;

public class Cat extends Pet {

    public Cat() {
        super("Мяу!");
    }

    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    @Override
    public void giveVoice() {
        System.out.println(getVoice());
    }

    @Override
    public int getPawsCount() {
        return 4;
    }
}
