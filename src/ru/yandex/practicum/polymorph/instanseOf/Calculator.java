package ru.yandex.practicum.polymorph.instanseOf;

import java.util.List;

public class Calculator {

    public static Double calculate(List<MediaItem> mediaItems) {
        // Напишите реализацию метода, который будет возвращать общее количество дней,
        // потраченных на просмотр фильмов и сериалов
        double totalMinutes = 0;
        for (MediaItem mediaItem : mediaItems) {
            if (mediaItem instanceof Movie) {
                Movie movie = (Movie) mediaItem;
                totalMinutes += movie.getRuntime();
            } else if (mediaItem instanceof Series) {
                Series series = (Series) mediaItem;
                totalMinutes += series.getRuntime() * series.getSeriesCount();
            }
        }
        return totalMinutes / (60 * 24);
    }
}
