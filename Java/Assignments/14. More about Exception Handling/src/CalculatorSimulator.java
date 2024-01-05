class CalculatorSimulator {
	public static void main(String args[]) {
		
		//creating an object of the TaxCalculator class
		TaxCalculator tax = new TaxCalculator();
		
		//test case 1
		try {
			//calling taxAmount() method using object and assigning returned value to the totalTax variable
			double totalTax = tax.taxAmount("Ron", false, 34000);
			System.out.println("Tax amount is " + totalTax);
		} catch(EmployeeNameInvalidException e) {
			//catching and handling EmployeeNameInvalidException exception when name is null
			e.printStackTrace();
		} catch (CountryNotValidException e) {
			//catching and handling CountryNotValidException  when country is not india
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			//catching and handling taxNotEligibleException when salary is below or equal to 10000
			e.printStackTrace();
		}
		
		//test case 2
		try {
			double totalTax = tax.taxAmount("Tim", true, 1000);
			System.out.println("Tax amount is " + totalTax);
		} catch(EmployeeNameInvalidException e) {
			e.printStackTrace();
		} catch (CountryNotValidException e) {
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			e.printStackTrace();
		}
		
		//test case 3
		try {
			double totalTax = tax.taxAmount("Jack", true, 55000);
			System.out.println("Tax amount is " + totalTax);
		} catch(EmployeeNameInvalidException e) {
			e.printStackTrace();
		} catch (CountryNotValidException e) {
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			e.printStackTrace();
		}
		
		//test case 4
		try {
			double totalTax = tax.taxAmount("", true, 30000);
			System.out.println("Total amount is " + totalTax);
		} catch(EmployeeNameInvalidException e) {
			e.printStackTrace();
		} catch (CountryNotValidException e) {
			e.printStackTrace();
		} catch (TaxNotEligibleException e) {
			e.printStackTrace();
		}
	}
}

