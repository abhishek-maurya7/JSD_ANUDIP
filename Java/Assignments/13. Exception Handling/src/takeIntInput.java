import java.util.Scanner;

public class takeIntInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//using try-catch block to catch block handle exception
		try {
			System.out.print("Enter a number: ");
			
			//taking an integer input from user
			int number = sc.nextInt();
			
			System.out.println("You entered: " + number);
		} catch (NumberFormatException e) {
			//catching and handling NumberFormatException if user passes non-integer value
			System.out.println("Please enter a valid integer.");
		}
	}
}
