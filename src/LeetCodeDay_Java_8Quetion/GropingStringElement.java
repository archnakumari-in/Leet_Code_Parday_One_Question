package LeetCodeDay_Java_8Quetion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GropingStringElement {

    public static void main(String[] args) {

        List<String> listOfStringName =
                Arrays.asList("Archna", "Archna", "Kumari", "kumari");

        Map<String, Long> listOfStringInGroupingFormat =
                listOfStringName.stream()
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        ));

        System.out.println(listOfStringInGroupingFormat);
    }
}