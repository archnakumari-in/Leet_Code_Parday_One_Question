package LeetCodeDay_5_2_08_2026;

public class Water_Bottles1518 {
	
	

	    public static int numWaterBottles(int numBottles, int numExchange) {

	        int ans = numBottles;

	        while (numBottles >= numExchange) {
	            int changed = numBottles / numExchange;
	            int rem = numBottles % numExchange;
	            ans += changed;
	            numBottles = changed + rem;
	        }

	        return ans;
	    }

	    public static void main(String[] args) {

	        System.out.println(numWaterBottles(9, 3));   // 13
	        System.out.println(numWaterBottles(15, 4));  // 19
	    }
	}
	


