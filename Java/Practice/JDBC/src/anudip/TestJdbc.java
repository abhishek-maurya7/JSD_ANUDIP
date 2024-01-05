package anudip;

import java.util.Scanner;

import anudip.entity.Customer;
import anudip.serviceImpl.CustomerServiceImpl;

public class TestJdbc {
	public static void main(String[] args) {
		CustomerServiceImpl cc = new CustomerServiceImpl();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Add \n 2. Update \n 3. Delete \n 4. Show \n 5. Exit");
			System.out.println();
			
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("Enter id");
				int cid = sc.nextInt();
				System.out.println("Enter name");
				String cname = sc.next();
				sc.nextLine();
				System.out.println("Enter phone");
				long cphone = sc.nextLong();
				sc.nextLine();
				System.out.println("Enter addr");
				String caddr = sc.nextLine();
				System.out.println(caddr);
				Customer customer = new Customer(cid, cname, cphone, caddr);
				boolean isadded = cc.addCustomer(customer);
				if(isadded) {
					System.out.println("inserted successfully");
				}else {
					System.out.println("Failed");
				}
				break;
			case 2:
				System.out.print("Enter ID: ");
				int cid1 = sc.nextInt();
				System.out.print("Enter new phone number: ");
				long newCphone = sc.nextLong();
				boolean isUpdated  = cc.editCustomer(cid1, newCphone);
				if(isUpdated) {
					System.out.println("Updated successfully");
				} else {
					System.out.println("Update Failed.");
				}
				break;
			case 3:
				System.out.print("Enter ID:");
				int cid2 = sc.nextInt();
				boolean isDeleted = cc.removeCustomer(cid2);
				if(isDeleted) {
					System.out.println("Deleted Successfully");
				} else {
					System.out.print("Failed");
				}
				break;
			case 4: 
				cc.showCustomers();
				break;
			case 5: 
				System.out.println("Thank you");
				System.exit(0);
				break;
			}
		}

	}

}
