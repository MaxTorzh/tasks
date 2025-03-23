package ru.yandex.practicum.abstracts.task1;

public class Fish extends Pet {

    public Fish() {
        super("Буль!");
    }

    @Override
    public void giveVoice() {
        System.out.println(getVoice());
    }

    @Override
    public int getPawsCount() {
        return 0;
    }
}
