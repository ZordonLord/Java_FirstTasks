//Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class Task5 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] strArr = str.split(" ");
//        System.out.println(Arrays.toString(strArr));
        for (int i = strArr.length-1; i >= 0; i--) {
            System.out.print(strArr[i] + " ");
        }
    }
}
