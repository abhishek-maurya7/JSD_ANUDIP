class Student {
    //declaring private variables
    private String studentName;
    private String collegeName;
    private int studentID;

    //Creating constructor to initialize varibles
    Student(String studentName, String collegeName, int studentID) {
        this.studentName = studentName;
        this.collegeName = collegeName;
        this.studentID = studentID;
    }

    //main method
    public static void main(String args[]) {
        //Creating an object of the Student class and passing values to constructor
        Student s = new Student("Abhishek Maurya", "Mumbai Univeristy", 256);

        System.out.println("Successful");
    }
}