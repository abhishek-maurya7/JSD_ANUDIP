public class Student {
	//instance variables
	String name;
	int age;
	String department;
	
	//default constructor
	public Student() {
		this.name = "Unknown";
		this.age = 20;
		this.department = "Unassigned";
	}
	
	//parameterized constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.department = "IT";
	}
	//parameterized constructor
	public Student(String name, int age, String department) {
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	//main method
	public static void main(String[] args) {
		
		//creating objects and passing values to the constructors
		Student student1 = new Student();
		Student student2 = new Student("John", 25);
		Student student3 = new Student("Alice", 22, "HR");
		
		System.out.println("Student 1- Name : " + student1.name + ", Age : " + student1.age + ", Department : " + student1.department);
	    System.out.println("Student 2- Name : " + student2.name + ", Age : " + student2.age + ", Department : " + student2.department);
	    System.out.println("Student 3- Name : " + student3.name + ", Age : " + student3.age + ", Department : " + student3.department);
	}
}
