package ru.yandex.practicum.polymorph.genericks.contacts;

// унаследуйте класс от базового класса, описывающего контакт Contact
class Address extends Contact {
    private final String city;
    private final String address;

    public Address(String name, String city, String address) {
        super(name);
        this.city = city;
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    // метод sendMessage переопределяет метод базового класса
    @Override
    public void sendMessage() {
        System.out.println("Отправим открытку в город " + city + " по адресу: " + address);
    }

    @Override
    public void print() {
        System.out.println("Город: " + getCity());
        System.out.println("Адрес: " + getAddress());
    }

}
