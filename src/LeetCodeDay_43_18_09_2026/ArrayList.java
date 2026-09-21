package LeetCodeDay_43_18_09_2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayList {

	public static void main(String[] args) {
		List<Integer>listOfNumber= Arrays.asList(2,8,7,6,5,4,3,2,1);
	Map<Integer,Long> listOfNumbers=	listOfNumber.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(listOfNumbers);
		
	
	}
}
