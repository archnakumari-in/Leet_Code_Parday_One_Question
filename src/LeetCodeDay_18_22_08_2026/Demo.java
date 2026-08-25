package LeetCodeDay_18_22_08_2026;

public class Demo {
	public static void main(String[] args) {
	
		double sum=sumOfTwoNumber(5,3);
		System.out.println(sum);
		int sub=subOfTwoNumber(10,5);
		System.out.println(sub);
		float mul=mulOfTwoNumber(10,5);
		System.out.println(mul);
		long div=divOfTwoNumber(10,2);
		System.out.println(div);
		
		int a=(3>4||5>6)?1:2;
		System.out.println("Tarnariy Opratar Use");
		
		System.out.println(a);
		
	}

	private static long divOfTwoNumber(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}

	private static float mulOfTwoNumber(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	private static int subOfTwoNumber(int i, int j) {
		// TODO Auto-generated method stub
		return i-j;
	}

	private static double sumOfTwoNumber(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}

}
