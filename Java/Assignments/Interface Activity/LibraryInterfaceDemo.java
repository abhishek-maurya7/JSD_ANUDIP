//interface
interface LibraryUser {
    //abstract methods
    void registerAccount();
    void requestBook();
}

//class KidUser emplements the methods of the interface LibraryUser
class KidUser implements LibraryUser {
    //instance variables
    int age;
    String bookType;

    //implementing abstract method
    public void registerAccount() {
        if(age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    //implementing abstract method
    public void requestBook() {
        if(bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are not allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser {
    //Instance Variables
    int age;
    String bookType;

    //Implementing abstract method
    public void registerAccount() {
        if(age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    
    //Implementing abstract method
    public void requestBook() {
        if(bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are not allowed to take only adult Fiction books");
        }
    }
}

class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUser k1 = new KidUser(); //instance of KidUser class
        //testing
        k1.age = 10;
        k1.bookType = "Kids";
        k1.registerAccount();
        k1.requestBook();
        System.out.println("---------------------------------------");

        KidUser k2 = new KidUser(); //instance of KidUser class
        k2.age = 18;
        k2.bookType = "Fiction";
        k2.registerAccount();
        k2.requestBook();
        System.out.println("---------------------------------------");

        AdultUser adult1 = new AdultUser(); //instance of AdultUser class
        //testing
        adult1.age = 5;
        adult1.bookType = "Kids";
        adult1.registerAccount();
        adult1.requestBook();
        System.out.println("---------------------------------------");
        
        AdultUser adult2 = new AdultUser(); //instance of KidUser class
        adult2.age = 23;
        adult2.bookType = "Fiction";
        adult2.registerAccount();
        adult2.requestBook();
    }
}