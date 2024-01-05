import java.util.Arrays;
import java.util.Scanner;

public class arraySortingAssignment {
	
	public static void main(String[] args) {
		//creating object of scanner
		Scanner sc = new Scanner(System.in);
				
		//Taking size of array from user
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
				
		//declaring an array of the given size
		int arrayNumbers[] = new int[size];
			
		//taking elements (numbers) from the user and adding them to an array
		int i = 0;
		while(i < size) {
			System.out.println("Enter number " + (i+1));
			arrayNumbers[i] = sc.nextInt();
			i++;
		}
		
		//sorting the array
		Arrays.sort(arrayNumbers);
		
		//printing elements of the array
		System.out.println("Sorted array: ");
		for(int number: arrayNumbers) {
			System.out.println(number);
		}
	}
}
