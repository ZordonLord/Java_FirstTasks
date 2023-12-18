package Lesson6;

import java.util.HashSet;
import java.util.Set;

//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения,
//        которое является
//        а) информационной системой ветеринарной клиники
//        поместить несколько экземпляров кота в Set
public class Task14 {
    public static void main(String[] args) {
        Cat animal = new Cat(1, "Tom");
        Cat animal3 = new Cat(1, "Tom");
        Dog animal2 = new Dog(1, "Sharik");
        System.out.println(animal);
        System.out.println(animal2);
        Set<Cat> cats = new HashSet<>();
        cats.add(animal3);
        cats.add(animal);
        System.out.println(cats);
    }
}
