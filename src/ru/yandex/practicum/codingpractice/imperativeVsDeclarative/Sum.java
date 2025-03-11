package ru.yandex.practicum.codingpractice.imperativeVsDeclarative;

public class Sum {

    //этот метод, не погружаясь в детали, сделает с массивом, что описано в ItemAction
    public static int applyActionToArray(int[] array, ItemAction itemAction){
        int result = 0;
        for (int item : array) {
            result = itemAction.apply(item, result);
        }
        return result;
    }

    public static void main(String[] args){
        //подготовив данные, формируем схему их обработки
        //с помощью сочетания метода applyActionToArray и класса ItemAction
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = applyActionToArray(numbers, new ItemAction("sub"));
        System.out.println(sum);
    }

    static class ItemAction {

        private String action = "none";

        public ItemAction(String action){
            this.action = action;
        }
        //этот класс выполнит одно действие со значением и вернёт результат, когда попросят
        int apply(int item, int prevResult){
            switch (action){
                case "sum":
                    return prevResult + item;
                case "sub":
                    return prevResult - item;
                case "mul":
                    return prevResult * item;
                case "div":
                    return prevResult / item;
                default:
                    return prevResult;
            }
        }
    }
}
