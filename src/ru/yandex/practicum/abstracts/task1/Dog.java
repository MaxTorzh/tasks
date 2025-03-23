package ru.yandex.practicum.abstracts.task1;

public class Dog extends Pet {

    public Dog() {
        super("Гав!");
    }

    public void bringStick() {
        System.out.println("Принёс палочку, как хороший мальчик!");
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
