package Lesson5;

import java.util.Map;
import java.util.Stack;

public class Task13 {
    static Map<Character, Character> map = Map.of('(', ')', '[', ']', '{', '}');

    public static void main(String[] args) {
        System.out.println(isValid("{a+]}{(d*3)}"));
    }

    public static boolean isValid(String expression) {// (, [, ], )
        char[] exp = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char elem : exp) {
            if (map.containsKey(elem)) {
                stack.push(elem);// stack == (,
            } else if (map.containsValue(elem)) {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();// top = [
                char value = map.get(top);
                if (value != elem)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}