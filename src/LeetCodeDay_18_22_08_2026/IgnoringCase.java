package LeetCodeDay_18_22_08_2026;

import java.util.Arrays;
import java.util.List;

public class IgnoringCase {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Archna", "Rahul", "Priya", "Amit");
		String searchName = "archna";
		boolean result = names.stream().anyMatch(name -> name.equalsIgnoreCase(searchName));

		System.out.println(result);
	}

}
