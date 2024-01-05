import java.util.Scanner;
public class InterestCalculator {
	//instance variables
	double principal;
	int time;
	double interest;
	
	//method to calculate interest for given number of years
	double calculateInterest(double principal, int time) {
		if(principal > 10000) {
			interest = time * (principal / 100)*10;
		} else if(principal > 5000) {
			interest = time * (principal / 100)*8;
		} else if(principal > 0) {
			interest = time * (principal / 100)*5;
		}
		return interest;
	}
	//main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //importing scanner
		System.out.print("Enter your principal amount: ");
		double amount = sc.nextDouble();
		System.out.print("Number of Years: ");
		int time = sc.nextInt();
		
		//
		InterestCalculator a = new InterestCalculator();
		//calling method
		double i = a.calculateInterest(amount, time);
		System.out.println(i);
	}

}
