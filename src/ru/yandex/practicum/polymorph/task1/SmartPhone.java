package ru.yandex.practicum.polymorph.task1;

// допишите реализацию класса Smartphone
class SmartPhone extends MobilePhone {
    public void sendEmail(String messageText, String email) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    public SmartPhone(String number) {
        super(number);
    }

    public final void makeCall(String targetNumber, String appName) {
        System.out.println("Позвоним через приложение " + appName +  " по номеру " + targetNumber);
    }
}
