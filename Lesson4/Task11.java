package Lesson4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task11 {
    private static int LENGTH = 10000000;

    public static void main(String[] args) {

        // task0();
        System.out.println("ArrayList: " + test(new ArrayList<>()));
        System.out.println("Linked: " + test(new LinkedList<>()));
    }

    // 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов. 2)
    // Замерьте время,
    // за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

    // private static void task0() {
    //     List<Integer> intArrayList = new ArrayList<>();
    //     List<Integer> intLinkedList = new LinkedList<>();

    //     long startTime = System.currentTimeMillis();

    //     for (int i = 0; i < LENGTH; i++) {
    //         intArrayList.add(i);
    //     }

    //     long endTime = System.currentTimeMillis();

    //     double result = (endTime - startTime);

    //     System.out.printf("Run time for ArrayList: %s %s %n", result, "ms");

    //     long startTime2 = System.currentTimeMillis();

    //     for (int i = 0; i < LENGTH; i++) {
    //         intLinkedList.add(i);
    //     }
    //     long endTime2 = System.currentTimeMillis();

    //     result = (endTime2 - startTime2);
    //     System.out.printf("Run time for LinkedList: %s %s %n", result, "ms");

    // }

    private static long test(List<Integer> ints) {
        for (int i = 0; i < LENGTH; i++) {
            ints.add(i);
        }

        int count = 0;
        long start = System.currentTimeMillis();
        while (count != 1000) {
            ints.add(4000, new Random().nextInt(10));
            count += 2;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
