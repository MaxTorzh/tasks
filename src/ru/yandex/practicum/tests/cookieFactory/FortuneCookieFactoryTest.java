package ru.yandex.practicum.tests.cookieFactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortuneCookieFactoryTest {

    private FortuneCookieFactory factory;

    @BeforeEach
    void setup() {
        FortuneConfig config = new FortuneConfig(true); // Конфиг не влияет на счетчик
        factory = new FortuneCookieFactory(
                config,
                new ArrayList<>(List.of("positive")),
                new ArrayList<>(List.of("negative"))
        );
    }

    @Test
    void shouldIncrementCountByOneAfterOneCookieBaked() {
        factory.bakeFortuneCookie();
        assertEquals(1, factory.getCookiesBaked());
    }

    @Test
    void shouldIncrementCountByTwoAfterTwoCookiesBaked() {
        factory.bakeFortuneCookie();
        factory.bakeFortuneCookie();
        assertEquals(2, factory.getCookiesBaked());
    }

    @Test
    void shouldSetCounterToZeroAfterResetCookieCreatedCall() {
        factory.bakeFortuneCookie();
        assertEquals(1, factory.getCookiesBaked());

        factory.resetCookiesCreated();
        assertEquals(0, factory.getCookiesBaked());
    }
}
