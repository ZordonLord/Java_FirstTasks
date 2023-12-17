import java.util.Scanner;

/**
// Написать программу, которая попросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        try (Scanner scanner = new Scanner(System.in,"cp866")) {
            String name = scanner.next();
            System.out.println("Привет ".concat(name));
        }
    }
    
}