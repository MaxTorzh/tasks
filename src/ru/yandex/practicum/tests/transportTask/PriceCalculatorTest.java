package ru.yandex.practicum.tests.transportTask;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.BIKE, 0) < 0);
    }

    @Test
    public void shouldReturn200ForBikeAndDistanceIs20Km() {
        int actual = priceCalculator.calculatePrice(TransportType.BIKE, 20);
        Assertions.assertEquals(200, actual);
    }

    @Test
    public void shouldBeTrueWhenBikeAndDistanceIs21Km() {
        int actual = priceCalculator.calculatePrice(TransportType.BIKE, 21);
        Assertions.assertTrue(-200 < actual);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.CAR, 0) < 0);
    }

    @Test
    public void shouldReturn7000ForCarAndDistanceIs1000Km() {
        int actual = priceCalculator.calculatePrice(TransportType.CAR, 1000);
        Assertions.assertEquals(7000, actual);
    }

    @Test
    public void shouldBeTrueWhenCarAndDistanceIs1001Km() {
        int actual = priceCalculator.calculatePrice(TransportType.CAR, 1001);
        Assertions.assertTrue(-7000 < actual);
    }

    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
    Assertions.assertTrue(priceCalculator.calculatePrice(TransportType.TRUCK, 0) < 0);
    }

    @Test
    public void shouldReturn5ForTruckAndDistanceIs1Km() {
        int actual = priceCalculator.calculatePrice(TransportType.TRUCK, 1);
        Assertions.assertEquals(5, actual);
    }

    @Test
    public void shouldBeNullWhenDroneAndDistanceIs0Km() {
        Assertions.assertNull(priceCalculator.calculatePrice(TransportType.DRONE, 0));
    }
}
