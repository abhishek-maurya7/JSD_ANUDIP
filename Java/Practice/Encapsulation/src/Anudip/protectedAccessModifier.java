package Anudip;

public class protectedAccessModifier {
	
	//protected variables
	protected String collegeName = "Mumbai University";
	protected String city = "Mumbai";
	
	public static void main(String args[]) {
		protectedAccessModifier x = new protectedAccessModifier();
		System.out.println("Accessing protected variables in same class\n" + x.collegeName + ", " + x.city);
	}
}
