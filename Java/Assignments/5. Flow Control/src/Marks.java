import java.util.Scanner;

public class Marks {
	//declaring instance variables
	int subject1;
	int subject2;
	int subject3;
	int subject4;
	int subject5;
	int total;
	double average;
	String grade;
	
	//constructor
    public Marks(int subject1, int subject2, int subject3, int subject4, int subject5) {
		super();
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
	}
    
    //method to calculate total
    int calculateTotal() {
    	return subject1 + subject2 + subject3 + subject4 + subject5;
    }
    
    //method to calculate avarage
    double calculateAverage() {
    	return this.calculateTotal() / 5;
     }
    
    //method that calculates grade based on average marks
    String calculateGrade() {
    	if(calculateAverage() > 90) {
    		grade = "Ex";
    	} else if(calculateAverage() > 80) {
    		grade = "A";
    	} else if(calculateAverage() > 60) {
    		grade = "B";
    	} else if(calculateAverage() >= 40) {
    		grade = "C";
    	} else {
    		grade = "F";
    	}
    	return grade;
    }
    
    //main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//taking values with scanner
		System.out.print("Enter subject 1 marks: ");
		int subject1 = sc.nextInt();
		System.out.print("Enter subject 2 marks: ");
		int subject2 = sc.nextInt();
		System.out.print("Enter subject 3 marks: ");
		int subject3 = sc.nextInt();
		System.out.print("Enter subject 4 marks: ");
		int subject4 = sc.nextInt();
		System.out.print("Enter subject 5 marks: ");
		int subject5 = sc.nextInt();
		
		//creating object and passing values
		Marks student1 = new Marks(subject1, subject2, subject3, subject4, subject5);

		//calling methods and printing them
		System.out.println("\nTotal marks: " + student1.calculateTotal() + "\nAverage Marks: " + student1.calculateAverage() + "\nGrade: " + student1.calculateGrade());
	}
}
