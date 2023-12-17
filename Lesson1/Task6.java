//Записать в файл следующие данные:
//
//        Name Surname Age
//        Kate Smith 20
//        Paul Green 25
//        Mike Black 23

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task6 {
    public static void main(String[] args) {
        String s = "Name Surname Age\nKate Smith 20";
        File file = new File("Lesson1/task6.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write(s);
            fw.flush();
        } catch (IOException e) {
            System.out.println("error");
        }

    }
}
