package LeetCodeDay_18_22_08_2026;

public class equalsIgnoreCase {

	public static void main(String[] args) {
		
		String name1="Archna";
		String name2="Archna";
		
		String name3="Archna";
		String name4="Archi";
		
		String resulst=name1.equalsIgnoreCase("A")?"A":"B";
		System.out.println(resulst);
		System.out.println("Using equels");
		System.out.println(name1.equals(name2));
		System.out.println("Using equels");
		System.out.println(name3.equals(name4));

	}

}
