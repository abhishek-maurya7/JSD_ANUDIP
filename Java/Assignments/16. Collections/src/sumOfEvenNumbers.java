import java.util.ArrayList;

public class sumOfEvenNumbers {

	public static void main(String[] args) {
		
		//Declaring an empty arraylist
		ArrayList<Integer> numbers = new ArrayList<>();
		
		//adding numbers to the arraylist using add()
		numbers.add(8);
		numbers.add(5);
		numbers.add(7);
		numbers.add(4);
		numbers.add(2);
		numbers.add(4);
		numbers.add(12);
		numbers.add(4);
		numbers.add(6);
		numbers.add(4);
		
		int sum = 0; //to store sum
		
		//advanced for loop
		for(int number : numbers) {
			
			//checking whether the number is even
			if(number % 2 == 0) {				
				sum += number;
			}
		}
		
		//printing
		System.out.println("Sum of even numbers: "+sum);
	} 

}
