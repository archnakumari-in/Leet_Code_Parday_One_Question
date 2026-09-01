package LeetCodeDay_Java8;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNumber {
	public static void main(String[] args) {
		List<Integer> ListOfNumber=Arrays.asList(6,7,4,4,3,2,1,1);
		ListOfNumber.stream().distinct().forEach(System.out::print);
	}

}
