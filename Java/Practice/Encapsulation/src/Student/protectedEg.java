package Student;
import Anudip.protectedAccessModifier;
/*
 * Protected variables can only be accessed within the same package
 * If we want to access them in another package then we need to inherit the class first*/
public class protectedEg extends protectedAccessModifier{
	public static void main(String args[]) {
		protectedEg y = new protectedEg();
		System.out.println("Accessing protected variables.....");
		System.out.println(y.collegeName + ", " + y.city);
	}
}
