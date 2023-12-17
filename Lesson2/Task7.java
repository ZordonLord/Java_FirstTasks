package Lesson2;

//Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

public class Task7 {
    public static void main(String[] args) {
        System.out.println(palyndrom("арозаупаланалапуазора"));
    }
    public static boolean palyndrom(String pal){
//        StringBuilder sb = new StringBuilder(pal);
        return new StringBuilder(pal).reverse().toString().equals(pal);
    }
}
