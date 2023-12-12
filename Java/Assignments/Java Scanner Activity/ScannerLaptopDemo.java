import java.util.Scanner;

class ScannerLaptopDemo {
    public static void main(String args[]) {
        int option;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nEnter Option:\nAdd-1\nSubtract-2\nMultiply-3\nEven/OddNumber -4\nQuit-5");
            System.out.println("Enter your choice: ");
            option = sc.nextInt();
            
            switch(option) {
                case 1: 
                    System.out.println("Enter two numbers to be added: ");
                    int num1 = sc.nextInt(); 
                    int num2 = sc.nextInt();
                    System.out.println("The result is " + (num1 + num2));
                    break;
                case 2: 
                    System.out.println("Enter two numbers to be subtracted: ");
                    int num3 = sc.nextInt(); 
                    int num4 = sc.nextInt();
                    System.out.println("The result is " + (num3 - num4));
                    break;
                case 3: 
                    System.out.println("Enter two numbers to be multiplied: ");
                    int num5 = sc.nextInt(); 
                    int num6 = sc.nextInt();
                    System.out.println("The result is " + (num5 * num6));
                    break;
                case 4: 
                    System.out.println("Enter numbers to check even or odd: ");
                    int num7 = sc.nextInt(); 
                    if (num7 % 2 == 0) {
                        System.out.println("Number is even");
                    } else {
                        System.out.println("Number is odd");
                    }
                    break;
		        case 5:
                    System.out.println("Quitting");
                    break;
                default: 
                    System.out.println("Invalid Input");
            }
        } while (option != 5);
    }
}