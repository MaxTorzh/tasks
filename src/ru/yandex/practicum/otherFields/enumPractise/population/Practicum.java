package ru.yandex.practicum.otherFields.enumPractise.population;

public class Practicum {
    public static void main(String[] args) {
        PopulationInformer populatioInformer = new PopulationInformer();
        System.out.println(populatioInformer.getPopulationPercent(Continent.ASIA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.AFRICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.NORTH_AMERICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.SOUTH_AMERICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.ANTARCTICA));
        System.out.println(populatioInformer.getPopulationPercent(Continent.AUSTRALIA));
    }
}
