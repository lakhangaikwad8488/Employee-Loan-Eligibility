package main.java.yaksha;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		double loanAmount=0;
		if(employeeObj instanceof PermanentEmployee)
		{
			employeeObj.calculateSalary();
			loanAmount=0.15*employeeObj.getSalary();
		
			
		}
		if(employeeObj instanceof TemporaryEmployee)
		{         
			employeeObj.calculateSalary();
			loanAmount=0.10*employeeObj.getSalary();
			 
		}
		return loanAmount;
	}

}
