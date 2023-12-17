class TaxCalculator {

    double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if(empName.length() == 0) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }
        if(!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        } else {
            if(empSal > 100000) {
                return empSal * 8 / 100;
            } else if(empSal > 50000) {
                return empSal * 6 /100;
            } else if(empSal > 30000) {
                return empSal * 5 / 100;
            } else if(empSal> 10000) {
                return empSal * 4 / 100;
            } else {
                throw new TaxNotEligibleException("The employee does not need to pay tax");
            }
        }
    }

    public static void main(String[] args) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        TaxCalculator t = new TaxCalculator();
        // double taxTest1 = t.calculateTax("Ron", false, 34000.0);
        // double taxTest2 = t.calculateTax("Tim", true, 1000.0);
        double taxTest3 = t.calculateTax("Jack", true, 55000.0);
        //double taxTest4 = t.calculateTax("", true, 30000.0);
        System.out.println("Tax amount is " + taxTest3);
    }
}
