import java.util.Scanner;

public class convertInput {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number as a string: ");
            
            // taking input string form user
            String userInput = scanner.nextLine();
            System.out.println("Before conversion: " + userInput);
            
            // converting string to integer
            int convertedNumber = Integer.parseInt(userInput);
            System.out.println("After conversion: " + convertedNumber);
        } catch (NumberFormatException e) {
            // Catch NumberFormatException if the conversion fails
            System.out.println("Please enter a valid integer.");
        } catch (NullPointerException e) {
            // Catch NullPointerException if the user input is null
            System.out.println("Input cannot be null. Please enter something");
        }
    }
}
