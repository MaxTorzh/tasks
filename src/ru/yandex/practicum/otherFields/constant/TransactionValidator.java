package ru.yandex.practicum.otherFields.constant;

public class TransactionValidator {
    // объявите константы
    public static final int MAX_AMOUNT = 5000;
    public static final int MIN_AMOUNT = 1;

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    public static boolean validAmount(double amount) {
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        } else if (amount > MAX_AMOUNT){
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }
}


