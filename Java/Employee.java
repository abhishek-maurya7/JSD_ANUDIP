class Employee {
    //declaring protected variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;

    //creating a contructor to intialize variables with recieved values
    Employee(int id, int age, String name, boolean isPermanent) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.isPermanent = isPermanent;
    }

    //main method
    public static void main(String args[]) {

        //creating object of Employee class and passing values
        //casting value of double to int
        Employee e = new Employee(235, (int) 35.5, "ABC XYZ", false);

        System.out.println("Successfully started");
    }
}
