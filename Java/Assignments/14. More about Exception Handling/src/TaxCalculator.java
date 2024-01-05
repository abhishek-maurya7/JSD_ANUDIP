public class TaxCalculator {
	//method to calculate tax amount and throw appropriate exceptions
	double taxAmount(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{
		double taxAmount = 0;
		
		//throwing EmployeeNameInvalidException exception if name is null 
		if(empName == null || empName.isEmpty()) {
			throw new EmployeeNameInvalidException("Employee name not valid:  \"The employee name cannot be empty\"");
		}
		
		//throwing CountryNotValidException exception if user is not an indian citizen
		if(!isIndian) {
			throw new CountryNotValidException("Country not valid:  \"The employee should be an Indian citizen for calculating tax\"");
		}

		//calculating tax if user is Indian citizen
		if(isIndian) {
			//calculating taxAmount based on different conditions
			if(empSal > 100000) {
				taxAmount = empSal * 8 / 100;
			} else if(empSal > 50000) {
				taxAmount = empSal * 6 / 100;
			} else if(empSal > 30000) {
				taxAmount = empSal * 5 / 100;
			} else if(empSal > 10000) {
				taxAmount = empSal * 4 / 100;
			} else {
				//throwing TaxNotEligibleException if salary is less than or equal to 10000
				throw new TaxNotEligibleException("Not eligible for Tax calculation:  \"The employee does not need to pay tax\"");
			}
		}
		return taxAmount;
	}
	
//	//entry method
//	public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
//		//creating objects of CalculatorSimulator class and invoking constructor with values
//		CalculatorSimulator employee1 = new CalculatorSimulator("Abhishek M", true, 100001);
//		CalculatorSimulator employee2 = new CalculatorSimulator(null, true, 100001);
//		CalculatorSimulator employee3 = new CalculatorSimulator("John Doe", false , 45000);
//		
//		//calling method taxAmount() and printing returned value
// 		System.out.println(employee1.empName + "'s Tax amount is: " + employee1.taxAmount());
// 		//System.out.println(employee2.empName + "'s Tax amount is: " + employee2.taxAmount());
// 		System.out.println(employee3.empName + "'s Tax amount is: " + employee3.taxAmount());
//	}
}