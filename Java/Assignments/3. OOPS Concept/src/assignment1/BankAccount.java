package assignment1;

class BankAccount {
    //declaring variables
    String accountHolderName;
    String bankName;
    double accountBalance;

    //creating constructor and initializing values
    BankAccount(String accountHolderName, String bankName, double accountBalance) {
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
        this.accountBalance = accountBalance;
    }
    //method to fetch the balalnce
    double getBalance() {
        return accountBalance;
    }

    //method to make deposit
    double deposit(double depositAmount) {
        accountBalance = accountBalance + depositAmount;
        return accountBalance;
    }

    //method for making withdrawls
    double withdraw(double withdrawalAmount) {
        accountBalance = accountBalance - withdrawalAmount;
        return accountBalance;
    }

    //main method
    public static void main(String[] args) {
        //Creating instance of bankAccount class and passing values to the constructor
        BankAccount ICICI = new BankAccount("Abhishek Maurya", "ICICI", 15000);
        //calling methods and printing returned values
        System.out.println("Account Holder: " + ICICI.accountHolderName);
        System.out.println("ICICI Current Balance: " + ICICI.getBalance());
        System.out.println("ICICI Balance after deposit: " + ICICI.deposit(1200));
        System.out.println("ICICI Balance after withdrwal: " + ICICI.withdraw(100));
        System.out.println("");

        //Creating instance of bankAccount class and passing values to the constructor
        BankAccount HDFC = new BankAccount("John Doe", "HDFC", 20000);
        //calling methods and printing returned values
        System.out.println("Account Holder: " + HDFC.accountHolderName);
        System.out.println("HDFC Current Balance: " + HDFC.getBalance());
        System.out.println("HDFC Balance after deposit: " + HDFC.deposit(1200));
        System.out.println("HDFC Balance after withdrwal: " + HDFC.withdraw(100));
        System.out.println("");
        
        //Creating instance of bankAccount class and passing values to the constructor
        BankAccount SBI = new BankAccount("ABC XYZ", "SBI", 5000);
        //calling methods and printing returned values
        System.out.println("Account Holder: " + SBI.accountHolderName);
        System.out.println("SBI Current Balance: " + SBI.getBalance());
        System.out.println("SBI Balance after deposit: " + SBI.deposit(1200));
        System.out.println("SBI Balance after withdrwal: " + SBI.withdraw(100));
    }
}