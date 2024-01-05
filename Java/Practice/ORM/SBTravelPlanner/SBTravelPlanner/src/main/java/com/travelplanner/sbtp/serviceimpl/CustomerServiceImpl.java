package com.travelplanner.sbtp.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.travelplanner.sbtp.entity.Customer;
import com.travelplanner.sbtp.exception.CustomerIDNotFoundException;
import com.travelplanner.sbtp.repository.CustomerRepository;
import com.travelplanner.sbtp.service.CustomerService;

//business logic for entity customer
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository custRepo;
	
	//Registering customer into db table using save of JpaRepository
	@Override
	public Customer registerCustomer(Customer customer) {
		return custRepo.save(customer);
	}

	@Override
	public Customer editCustomer(Customer customer, int cId) {
		// TODO Auto-generated method stub
		return null;
	}

	//removing an customer record from db table using deleteBy() of JpaRepository
 	@Override
	public void removeCusomer(int cId) {
		custRepo.findById(cId).orElseThrow(
				() -> new CustomerIDNotFoundException("Entered customed id is not found") 
		);
		custRepo.deleteById(cId);
	}

	//fetch an customer record from db table using findById() of JpaRepository
	@Override
	public Customer fetchCustomerDetail(int cId) {
		return custRepo.findById(cId).orElseThrow(
			() -> new CustomerIDNotFoundException("Invalid Customer ID is passed")
		);
	}

}
