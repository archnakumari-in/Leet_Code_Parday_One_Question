package LeetCodeDay_18_22_08_2026;

import java.util.Arrays;
import java.util.List;

public class DuplicateIgnoreCase {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "JAVA", "Spring", "spring", "Python", "Java");

        names.stream().filter(name -> names.stream().filter(x -> x.equalsIgnoreCase(name)).count() > 1) .distinct()
             .forEach(System.out::println);
    }
}