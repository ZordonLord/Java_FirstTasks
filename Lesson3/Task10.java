package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Заполнить список названиями планет Солнечной системы в произвольном порядке с
 * повторениями.
 * Вывести название каждой планеты и количество его повторений в списке.
 */
public class Task10 {
    
    static List<String> planets = new ArrayList<>();

    public static void main(String[] args) {
        init();
        System.out.println(getPlanetsWithCount());
    }

    private static void init() {
        planets.add("Earth");
        planets.add("Mars"); // 01
        planets.add("Earth");
        planets.add("Pluto");
        planets.add("Earth");
        planets.add("Pluto");
    }

    private static List<String> getPlanetsWithCount() {
        List<String> temp = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < planets.size(); i++) {
            String planet = planets.get(i);

            if (!temp.contains(planet)) {
                temp.add(planet);
                int count = 0;

                for (int j = 0; j < planets.size(); j++) {
                    if (planets.get(j).equals(planet))
                        count++;
                }
                builder.append(planet).append(": ").append(count).append(",");
                // Earth: 3, Mars: 1, Pluto: 3,
            }
        }
        // String[] = {"Earth: 3", "Mars: 1", "Pluto: 3"}
        return Arrays.asList(builder.toString().split(","));
    }
}