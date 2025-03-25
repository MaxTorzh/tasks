package ru.yandex.practicum.tests.cookieFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FortuneCookieControllerTest {

    private static FortuneCookieController goodFactoryController;
    private static FortuneCookieController badFactoryController;

    @BeforeAll
    static void setupAll() {
        goodFactoryController = create(true);
        badFactoryController = create(false);
    }

    private static FortuneCookieController create(boolean isPositive) {
        FortuneConfig config = new FortuneConfig(isPositive);
        FortuneCookieFactory factory = new FortuneCookieFactory(
                config,
                new ArrayList<>(List.of("positive")),
                new ArrayList<>(List.of("negative"))
        );
        return new FortuneCookieController(factory);
    }

    @Test
    void shouldReturnPositiveFortune() {
        FortuneCookie cookie = goodFactoryController.tellFortune();
        assertEquals("positive", cookie.getFortuneText());
    }

    @Test
    void shouldReturnNegativeFortune() {
        FortuneCookie cookie = badFactoryController.tellFortune();
        assertEquals("negative", cookie.getFortuneText());
    }
}