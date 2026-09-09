package LeetCodeDay_34_8_09_2026;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class java8Question {

	public static void main (String args[]) {
		
		// odd and even  number from the list of integer
		
		List<Integer> listOfInteger= Arrays.asList(1,3,4,6,7,88,4,4,3,3);
		Map<Boolean, List<Integer>>  oddAndEvenNumber=listOfInteger.stream().collect(Collectors.partitioningBy(i->i%2==1));
		System.out.println(oddAndEvenNumber);
		
		// remover the odd and even number from the list of Integer
		List<Integer> listOfNumber= Arrays.asList(2,1,2,3,4,5,6,7,7);
		listOfNumber.stream().distinct().forEach(System.out::print);
		
		// frequency of number 
		
	}
}
