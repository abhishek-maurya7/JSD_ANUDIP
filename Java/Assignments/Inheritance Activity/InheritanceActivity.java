class Employee {
    //declaring instance variables
    long employeeID;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance;
    double HRA;

    //constructor
    Employee() {
        //initializing instance variables
        this.specialAllowance = 250.80;
        this.HRA = 1000.50;
    }

    //overloading constructor
    Employee(long Id, String Name, String Address, long Phone) {
        this.employeeID = Id;
        this.employeeName = Name;
        this.employeeAddress = Address;
        this.employeePhone = Phone;
    }

    //method for salary calculation
    void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * HRA / 100);
        System.out.println("Salary: " + salary);
    }
    //method for calculating transport allowance
    void calculateTransportAllowance() {
        double transportAllowance = 10*basicSalary/100;
        System.out.println("Transport: " + transportAllowance);
    }
}

//inheriting emplpyee class 
class Manager extends Employee {
    //constuctor
    Manager(long Id, String Name, String Address, long Phone, double Salary) {
        this.employeeID = Id;
        this.employeeName = Name;
        this.employeeAddress = Address;
        this.employeePhone = Phone;
        this.basicSalary = Salary;
    }

    //method to calculate transport allowance of manager
    void calculateTransportAllowance() {
        double transportAllowance = 15*basicSalary/100;
        System.out.println("Transport Allowance: " + transportAllowance);
    }
}

//inheriting employee class
class Trainee extends Employee {
    // constructor
    Trainee(long Id, String Name, String Address, long Phone, double Salary) {
        this.employeeID = Id;
        this.employeeName = Name;
        this.employeeAddress = Address;
        this.employeePhone = Phone;
        this.basicSalary = Salary;
    }
}

class InheritanceActivity {
    public static void main(String[] args) {
        //creating object of manager class
        Manager m1 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
        m1.calculateSalary();

        //creating object of Trainee class
        Trainee t1 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
        t1.calculateSalary();

        m1.calculateTransportAllowance();
        t1.calculateTransportAllowance();
    }
}
