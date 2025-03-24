package ru.yandex.practicum.polymorph.genericks.questionTask;

import java.util.HashMap;

public class AnswerHolder<T extends Number> implements SmartPrintable {
    private String question;
    private T answer;

    // Конструктор с вопросом и ответом
    public AnswerHolder(String question, T answer) {
        this.question = question;
        this.answer = answer;
    }

    // Метод замены ответа из HashMap
    public void replaceAnswer(HashMap<String, ? extends Number> answerMap) {
        if (answerMap.containsKey(question)) {
            this.answer = (T) answerMap.get(question); // Приведение к T (Number)
        }
    }

    @Override
    public void printSmart() {
        System.out.println("Ответ на вопрос '" + question + "' равен " + answer.intValue());
    }
}
