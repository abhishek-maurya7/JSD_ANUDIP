package anudip;

public class privateAccessModifier {
	//initialized private variables
	private String myFirstName = "Abhishek";
	private String myLastName = " Maurya";
	
	/* 
	 * private keyword makes these variables unaccessible outside of this class 
	 * Other classes within same package or different package cannot access these variables
	 * In order to access private variables from outside the class we need a getter and setter methods
	 */
	public String getMyFirstName() {
		return myFirstName;
	}

	public String getMyLastName() {
		return myLastName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		privateAccessModifier p = new privateAccessModifier();
		System.out.println("Accessing private modifier in same class: " + p.myFirstName + p.myLastName);
	}
}
