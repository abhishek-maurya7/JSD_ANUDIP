
public class StringAssignment {

	public static void main(String[] args) {
		//original string
		String str = "Welcome to Java World";
		
		//printing character at 5th position
		System.out.println("Character at position 5: " + str.charAt(5));
		
		//lexicographic comparison
		System.out.println("Result of lexicographic comparision: " + str.compareToIgnoreCase("Welcome"));
		
		//concatenating original string with another string
		System.out.println("After concatenation: " + str.concat(" Let us learn"));	
		
		//printing index of occurrence of first a
		System.out.println("Index of first occurence of a: " + str.indexOf("a"));
		
		//printing string after replace+ing all a's by e
		System.out.println("After replacing all a's by e's: " + str.replaceAll("a", "e"));
		
		//printing substring starting from 4 to 10
		System.out.println("String between 4th and 10th Position: " + str.substring(4, 11));
		
		//printing original string in lowercase
		System.out.println("Lowercase: " + str.toLowerCase());
		
	}

}
