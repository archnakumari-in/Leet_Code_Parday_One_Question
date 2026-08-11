package LeetCodeDay_Java_8Quetion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenOddNumber {
	public static void main(String[] args) {
		List<Integer> listOfNumber= Arrays.asList(2,6,5,4,3,2,1,1,1,23,4);

	Map<Integer, Long> listOfOddAndEvenNumber=	listOfNumber.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(listOfOddAndEvenNumber);
		
		
	 
		
	}

}
