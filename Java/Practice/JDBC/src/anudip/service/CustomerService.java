package anudip.service;

import anudip.entity.Customer;

public interface CustomerService {
	boolean addCustomer(Customer cust);
	boolean editCustomer(int id, long cphone);
	boolean removeCustomer(int cid);
	void showCustomers();
}
