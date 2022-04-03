package JavaCore_Sabina_4;

import java.util.*;

public class Task3 {
        public static void main(String[] args) {
            String[] words = {"Слава", "Вова", "Юра", "Маша", "Слава", "Коля", "Слава", "Маша", "Вова", "Катя"};

            // Task 1.a
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            System.out.println(map);
            System.out.println("");

            // subtask 1.b.
            Set<String> uniq = new HashSet<>(Arrays.asList(words));
            System.out.println(uniq);
            System.out.println("");

            // subtask 2
            Phonebook pb = new Phonebook();

            pb.add("Иванов", "+7(963-929-20-20");
            pb.add("Петров", "+7(916)967-14-23");
            pb.add("Петров", "+7(905)566-51-83");

            System.out.println(pb.get("Петров"));
        }

}
