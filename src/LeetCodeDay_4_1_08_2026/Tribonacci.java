package LeetCodeDay_4_1_08_2026;

import java.util.Scanner;

public class Tribonacci {

	    public static int tribonacci(int n) {

	        if (n == 0)
	            return 0;

	        if (n == 1 || n == 2)
	            return 1;

	        int ft = 0;
	        int st = 1;
	        int tt = 1;

	        for (int i = 1; i <= n; i++) {
	            int fot = ft + st + tt;
	            ft = st;
	            st = tt;
	            tt = fot;
	        }

	        return ft;
	    }

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter n: ");
	        int n = sc.nextInt();

	        System.out.println("Tribonacci Number = " + tribonacci(n));

	        sc.close();
	    }
	}

