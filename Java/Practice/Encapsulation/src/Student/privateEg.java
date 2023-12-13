package Student;
import Anudip.privateAccessModifier;
public class privateEg {

	public static void main(String[] args) {

		privateAccessModifier p = new privateAccessModifier();
		System.out.println("Accessing private variable from different package: " + p.getMyFirstName());
		/*
		 * We can't access the private variables of the privateAccessModifier class
		 * We can only access them using getter method
		 */
	}

}
