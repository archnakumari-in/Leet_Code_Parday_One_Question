package LeetCodeDay_42_17_09_2026;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        // Max Priority Queue
        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        System.out.println("Original Stones:");

        for (int ele : stones) {
            System.out.print(ele + " ");
            pq.add(ele);
        }

        System.out.println("\n");
        System.out.println("Initial Priority Queue = " + pq);

        int round = 1;

        while (pq.size() > 1) {

            System.out.println("\n========== Round " + round + " ==========");

            int max = pq.remove();
            int smax = pq.remove();

            System.out.println("Largest Stone  = " + max);
            System.out.println("Second Largest = " + smax);

            int nstone = max - smax;

            System.out.println(
                    "New Stone = " + max + " - " + smax + " = " + nstone
            );

            if (nstone != 0) {

                pq.add(nstone);

                System.out.println(
                        "New stone " + nstone + " added to Priority Queue"
                );

            } else {

                System.out.println(
                        "Both stones destroyed because they were equal"
                );
            }

            System.out.println("Priority Queue Now = " + pq);

            round++;
        }

        if (pq.size() == 0) {

            return 0;

        } else {

            return pq.remove();
        }
    }

    public static void main(String[] args) {

        int[] stones = {2, 7, 4, 1, 8, 1};

        int answer = lastStoneWeight(stones);

        System.out.println("\n================================");
        System.out.println("Last Stone Weight = " + answer);
        System.out.println("================================");
    }

}
