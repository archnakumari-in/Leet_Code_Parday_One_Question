package LeetCodeDay_Java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfString {
	public static void main(String[] args) {
		String nameOfString="Archna kumari chauhan";
		 Map<Character, Long> nameOfStringOf =nameOfString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		 System.out.println(nameOfStringOf);
		
	}

}
