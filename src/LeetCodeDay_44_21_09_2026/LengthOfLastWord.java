package LeetCodeDay_44_21_09_2026;

public class LengthOfLastWord {

	public static int lengthOflastWord(String s) {

		int count = 0;

		System.out.println(" input String =\"" + s + "/");
		System.out.println("\n Starting  from the right  side........\n");
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			System.out.println("i = " + i + ", ch = '" + ch + "'");
			if (ch != ' ') {
				count++;

				System.out.println("Not space count  =" + count);
			}

			else if (count != 0) {
				System.out.println(" space found and count !=0->stop");
				break;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		String s = "Hello World";

		int answer = lengthOflastWord(s);

		System.out.println("\n==============================");
		System.out.println("Length of Last Word = " + answer);
		System.out.println("==============================");
		System.out.println("  ");
	}
}