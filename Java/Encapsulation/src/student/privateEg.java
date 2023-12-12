package student;
import anudip.privateAccessModifier;
public class privateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateAccessModifier p = new privateAccessModifier();
		System.out.println("Accessing private variable from different package: " + p.getMyFirstName());
		/*
		 * We can't access the private variables of the privateAccessModifier class
		 * We can only access them using getter method
		 */
	}

}
