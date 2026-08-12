package LeetCodeDay_15_12_08_2026;

public class BulbSwitch {

    public static int bulbSwitch(int n) {

        int count = 0;
        int i = 1;

        while (i * i <= n) {

            count++;
            i++;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 5;

        int result = bulbSwitch(n);

        System.out.println("Number of Bulbs = " + n);
        System.out.println("Bulbs remaining ON = " + result);
    }
}