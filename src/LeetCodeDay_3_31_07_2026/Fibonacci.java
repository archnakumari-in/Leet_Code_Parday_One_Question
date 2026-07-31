package LeetCodeDay_3_31_07_2026;

public class Fibonacci {
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}
		int ft=0;
		int st=1;
		for(int i=1;i<=n;i++) {
			int tt=	ft +st;
			ft=st;
			st=tt;
			
		}
		return ft;
		
	}
	public static void main(String[] args) {
		System.out.println("fib(0)="+fib(0));
		System.out.println("fib(1)="+fib(1));
		System.out.println("fib(2)="+fib(2));
		System.out.println("fib(3)="+fib(3));
		System.out.println("fib(4)="+fib(4));
		System.out.println("fib(5)="+fib(5));
		System.out.println("fib(6)="+fib(6));
		System.out.println("fib(7)="+fib(7));
		System.out.println("fib(8)="+fib(8));
	}

}
