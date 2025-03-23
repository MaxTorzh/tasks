package ru.yandex.practicum.abstracts.task1;

public abstract class Pet {
    private String voice;

    protected Pet(String voice) {
        this.voice = voice;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void sleep() {
        System.out.println("Сплю");
    }

    public void play() {
        System.out.println("Играю");
    }

    public abstract void giveVoice();

    public abstract int getPawsCount();
}
