package Hardware_Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreMain {
    public static void main(String[] args) {
        Notebooks notebook1 = new Notebooks("Sony", "черный", 15000, 2, 500, "Linux");
        Notebooks notebook2 = new Notebooks("HP", "красный", 20000, 4, 750, "Windows10");
        Notebooks notebook3 = new Notebooks("DNS", "синий", 35000, 8, 1500, "Windows11");
        Notebooks notebook4 = new Notebooks("MacBook", "белый", 99999, 16, 1000, "MacOS");
        Goods monitor1  = new Goods("Монитор Aos", "белый", 25000);
        Goods monitor2  = new Goods("Монитор Samsung", "черный", 12000);

        List<Goods> catalog = new ArrayList<>();
        catalog.add(notebook1);
        catalog.add(notebook2);
        catalog.add(notebook3);
        catalog.add(notebook4);
        catalog.add(monitor1);
        catalog.add(monitor2);

        System.out.println("1. Показать все товары");
        System.out.println("2. Поиск ноутбука по ОЗУ");
        System.out.println("3. Поиск ноутбука по объему диска");
        System.out.println("4. Выход");
        System.out.println("Введите цифру пункта меню: ");
        try (Scanner scanner = new Scanner(System.in, "cp866")) {
            Integer choice = Integer.parseInt(scanner.next());
            if (choice == 1) {
                for (Goods goods : catalog) {
                    System.out.println(goods.displayInfo());
                }
            } else if (choice == 2) {
                System.out.println("Введите минимальный объем ОЗУ: ");
                Integer choiceRam = Integer.parseInt(scanner.next());
                Boolean flag = false;
                for (Goods goods : catalog) {
                    if (goods instanceof Notebooks) {
                        Notebooks notebooks = (Notebooks) goods;
                        if(choiceRam <= notebooks.getRam()){
                            System.out.println(goods.displayInfo());
                            flag = true;
                        }
                    }    
                }
                if (flag == false) {
                    System.out.println("Такого товара нет");
                    System.exit(0);
                }
            } else if (choice == 3) {
                System.out.println("Введите минимальный объем диска: ");
                Integer choiceRom = Integer.parseInt(scanner.next());
                Boolean flag = false;
                for (Goods goods : catalog) {
                    if (goods instanceof Notebooks) {
                        Notebooks notebooks = (Notebooks) goods;
                        if(choiceRom <= notebooks.getRom()){
                            System.out.println(goods.displayInfo());
                            flag = true;
                        }
                    }     
                }
                if (flag == false) {
                    System.out.println("Такого товара нет");
                    System.exit(0);
                }
            } else if (choice == 4) {
                System.exit(0);
            } else {
                System.out.println("Такого пункта нет");
                System.exit(0);
            }
        }
    }
}
