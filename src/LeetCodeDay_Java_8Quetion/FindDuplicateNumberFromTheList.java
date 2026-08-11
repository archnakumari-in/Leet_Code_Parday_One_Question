package LeetCodeDay_Java_8Quetion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumberFromTheList {
	public static void main(String args[]) {
		
	
	List<Integer>listONumber= Arrays.asList(1,4,3,2,2,1,1,1,14,5,6,7,6);
	 Set<Integer> duplicates = listONumber.stream()
             .filter(n -> Collections.frequency(listONumber, n) > 1)
             .collect(Collectors.toSet());
	 System.out.print(duplicates);
	
	 	
	}
	

}
