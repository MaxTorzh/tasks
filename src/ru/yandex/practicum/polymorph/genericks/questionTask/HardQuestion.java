package ru.yandex.practicum.polymorph.genericks.questionTask;

public class HardQuestion implements SmartPrintable {
    private String questionText;

    // Конструктор с текстом вопроса
    public HardQuestion(String questionText) {
        this.questionText = questionText;
    }

    @Override
    public void printSmart() {
        System.out.println("Текст очень сложного вопроса: " + questionText);
    }
}
