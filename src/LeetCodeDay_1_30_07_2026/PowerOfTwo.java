package LeetCodeDay_1_30_07_2026;

public class PowerOfTwo {
	public static boolean isPowerOfTwo(int x) {
		if(x<=0) {
			return false;
			
		}
		while(x%2==0) {
			x=x/2;
			
		}
		return x==1;
	}
	public static void main(String[] args) {
		   System.out.println(isPowerOfTwo(1));	
		   System.out.println(isPowerOfTwo(2));
		   System.out.println(isPowerOfTwo(3));
		   
	
	}

}
