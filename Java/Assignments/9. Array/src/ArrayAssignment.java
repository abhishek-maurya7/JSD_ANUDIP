import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment {
	
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
		
		//calculating sum of the array
		int sum = 0;
		for(int j = 0; j < arrayNumbers.length; j++) {
			sum += arrayNumbers[j];
		}
		
		//printing sum and average
		System.out.println("Sum of all numbers: " + sum);
		System.out.println("Average of all numbers: " + sum / size);
	}
}
