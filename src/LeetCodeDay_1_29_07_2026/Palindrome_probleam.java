package LeetCodeDay_1_29_07_2026;

public class Palindrome_probleam {
	
public static boolean isPalindrome( int x) {
	// step one negative number never palindrome 
	if(x<0) {
		
	
	return false;
	
}
	 int original = x;
     int reverse = 0;
     
     // step 2 reverse the number
     
     while(x !=0) {
    	 int digit=x%10;
    	 reverse= reverse*10+digit;
    	 x=x=10;
    	 
    	 
    	 
     }
     // step compare origin and reverse number 
     return original== reverse;
     
     
	
}
public static void main(String[] args) {
	
	 System.out.println(isPalindrome(121));   // true
     System.out.println(isPalindrome(-121));  // false
     System.out.println(isPalindrome(10));    // false


}
}
