package ru.yandex.practicum.tests.cookieFactory;

public class FortuneCookie {
    private final String fortuneText;
    public FortuneCookie(String fortuneText) {
        this.fortuneText = fortuneText;
    }

    public String getFortuneText() {
        return this.fortuneText;
    }
}
