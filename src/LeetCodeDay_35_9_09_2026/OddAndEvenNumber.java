package LeetCodeDay_35_9_09_2026;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddAndEvenNumber {
	public static void main(String args[])
	{
		// odd and Even number from the list 
		
		List<Integer> listOfNumber=Arrays.asList(2,1,3,4,5,6,7,89,8);
		Map<Boolean, List<Integer>> oddAndEvenNumber=listOfNumber.stream().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(oddAndEvenNumber);
		
		// remove Duplicate number from the list
		List<Integer> listOfNum= Arrays.asList(2,4,3,2,1,2,3,5,7,6);
		listOfNum.stream().distinct().forEach(System.out::print);
		
		// frequency of each character from the String 
		String name ="My name is Archan From the Gorakhpur";
		Map<Character, Long> FrequencyOfTheCharecto=name.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.print(FrequencyOfTheCharecto);
		
		

		// frequency of each element of the array 
	 
		List<Integer> listOFArray= Arrays.asList(1,7,6,5,5,3,3,23,2,2,3,5,5,5);
	Map<Integer, Long> frequencyOfNumber=	listOFArray.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(frequencyOfNumber);
		
		// sort the list of the reverse order
		
		List<Integer> reverOfTheNuber= Arrays.asList(1,7,6,5,4,3,7,22,2,2);
		reverOfTheNuber.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
		
	}

}
