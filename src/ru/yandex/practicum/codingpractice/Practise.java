package ru.yandex.practicum.codingpractice;

import java.util.HashMap;

public class Practise {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Россия", "Москва");
        capitals.put("Италия", "Рим");
        System.out.println("Столица России - " + capitals.get("Россия"));
    }
}

