package LeetCodeDay_20_24_08_2026;


import java.util.HashMap;

public class FindLucky {

    public static int findLucky(int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequency
        for (int i = 0; i < arr.length; i++) {

            int ele = arr[i];

            if (hm.containsKey(ele)) {

                hm.put(ele, hm.get(ele) + 1);

            } else {

                hm.put(ele, 1);
            }
        }

        int ans = -1;

        // Find lucky number
        for (int key : hm.keySet()) {

            if (hm.get(key) == key) {

                ans = Math.max(ans, key);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 3, 4};

        int result = findLucky(arr);

        System.out.println("Lucky Number = " + result);
    }
}