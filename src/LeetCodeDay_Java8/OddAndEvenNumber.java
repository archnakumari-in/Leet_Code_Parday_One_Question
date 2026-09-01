package LeetCodeDay_Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEvenNumber {
	public static void main(String[] args) {
		
		List<Integer> listOfNumber= Arrays.asList(1,7,6,4,32,2,5,1,1);
		Map<Boolean, List<Integer>> oddAndEvenNumberFromTheList =listOfNumber.stream().collect(Collectors.partitioningBy(i->i%2==0));
		System.out.println(oddAndEvenNumberFromTheList);
	}

}
