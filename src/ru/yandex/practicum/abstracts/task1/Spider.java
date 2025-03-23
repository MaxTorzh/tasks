package ru.yandex.practicum.abstracts.task1;

public class Spider extends Pet {

    public Spider() {
        super("Шшш!");
    }

    @Override
    public void giveVoice() {
        System.out.println(getVoice());
    }

    @Override
    public int getPawsCount() {
        return 8;
    }
}
