import java.util.Scanner;

class salary {
    static float calculate(int basicSalary) {
        float hra;
        float da;
        if (basicSalary > 15000) {
            hra = 0.2f * basicSalary;
            da = 0.6f * basicSalary;
        } else {
            hra = 3000;
            da = 0.7f * basicSalary;
        }
        return basicSalary + hra + da;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int userChoice;

        do {
            System.out.print("Enter basic salary: ");
            int basicSalary = sc.nextInt();

            float grossSalary = calculate(basicSalary);
            
            System.out.println("Gross Salary: " + grossSalary);
            System.out.print("Enter 1 to continue, 0 to exit: ");
            userChoice = sc.nextInt();
        } while (userChoice == 1);
    }
}