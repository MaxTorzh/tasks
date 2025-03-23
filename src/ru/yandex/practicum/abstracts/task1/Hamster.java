package ru.yandex.practicum.abstracts.task1;

public class Hamster extends Pet {

    public Hamster() {
        super("Хрум!");
    }

    public void hideFood() {
        System.out.println("Вся еда — в щёчках!");
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
