package LeetCodeDay_UseEquelIgnorCase;

public class MultipleDiffrentTypeOfData {
public static void main(String[] args) {
	String name = "archna";
	String role = "ADMIN";
	int age = 25;
	double salary = 35000.50;
	boolean active = true;

	if (name.equalsIgnoreCase("ARCHNA")
	        && role.equalsIgnoreCase("admin")
	        && age >= 18
	        && salary > 30000
	        && active) {

	    System.out.println("All conditions are satisfied");

	} else {
	    System.out.println("Conditions are not satisfied");
	}
}

}
