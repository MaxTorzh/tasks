package ru.yandex.practicum.polymorph.task1;

class MobilePhone extends Phone {
    public void sendSms(String messageText, String targetNumber) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }

    public MobilePhone(String number) {
        super(number);
    }
}
