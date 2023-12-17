package Lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//        Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//        Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
//        оно должно записаться в лог-файл.
public class Task8 {
      private static final Logger LOG = Log.log(Task8.class.getName());
    public static void main(String[] args) {
        try {
            write("Lesson2/task8.txt", ".");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
        System.out.println(digit);
        return digit > 0;
    }
    public static String[] getFilesNames(String path){
        File dir = new File(path);
        String[] result = new String[0];
        File[] files;
        if(dir.isDirectory()){
            files = dir.listFiles();
            if(files != null){
                result = new String[files.length];
                for (int i = 0; i < files.length; i++) {
                    File elem = files[i];
                    String fileName = elem.getName();
                    result[i] = fileName;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
    public static void write(String path, String pathToDir) throws IOException {
        String[] data = getFilesNames(pathToDir);
        try (FileWriter fw = new FileWriter(path)) {
            for(String elem: data){
                fw.write(elem);
                fw.write("\n");
            }
            fw.flush();
        }
        if(isThrow()) LOG.log(Level.INFO, "error");
    }
}
