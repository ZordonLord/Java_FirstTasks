package Lesson3;

import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        // task2();
        addBooks(prose);
        addBooks(poetry);
        System.out.println(bookShop);
        // List<Integer> num = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        // num.add((int) (Math.random() * 10));
        // }
        // System.out.println(num);
        // num.sort(null);
        // System.out.println(num);
        // num.sort(Comparator.reverseOrder());
        // System.out.println(num);
        // System.out.println(Collections.max(num));
    }
    // Создать список типа ArrayList<String>.
    // Поместить в него как строки, так и целые числа.
    // Пройти по списку, найти и удалить целые числа.
    // public static void task2(){
    // ArrayList lists = new ArrayList<String>();
    // lists.add("список типа");
    // lists.add(1);
    // for (int i = 0; i < lists.size(); i++) {
    // if(lists.get(i)instanceof Integer){
    // lists.remove(i);
    // }

    // }
    // System.out.println(lists);

    // }
    // Каталог товаров книжного магазина сохранен в виде двумерного списка
    // List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего списка
    // содержится название жанра,
    // а на остальных позициях - названия книг. Напишите метод для заполнения данной
    // структуры.
    static List<List<String>> bookShop = new ArrayList<>();
    static List<String> prose = List.of("prosa", "ViM", "Byratino");
    static List<String> poetry = List.of("poetry", "ViM", "Byratino");

    public static void addBooks(List<String> books) {
        bookShop.add(books);

    }

}