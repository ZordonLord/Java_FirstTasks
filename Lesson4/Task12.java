package Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//        Принимает от пользователя строку вида
//        text:num
//        Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
//        Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
public class Task12 {
    static LinkedList<String> data = new LinkedList<>();
    public static void main(String[] args) {
        while (true) {
            run();
        }
    }

    public static String prompt() {
        try (Scanner scan = new Scanner(System.in)) {
            return scan.next();
        }
    }

    public static void run() {
        System.out.println("Введите данные: ");
        String text = prompt();
        String[] array = text.split(":");
        String word = array[0];
        int index = Integer.parseInt(array[1]);
        if (index > data.size()) {
            for (int i = data.size(); i < index; i++) {
                data.add(i, null);
            }
        }
        if (!word.equalsIgnoreCase("print")) {
            data.add(index, word);
        }
        else {
            System.out.println(data.get(index));
            if (data.get(index) != null) {
                data.remove(index);
            }
        }
    }
}
