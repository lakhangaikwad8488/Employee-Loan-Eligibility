package main.java.yaksha;

public class Main {

	public static void main(String[] args) {
		Loan loan=new Loan();
		Employee pe=new PermanentEmployee(1, "Ritika", 50000);
		Employee te=new TemporaryEmployee(56, "Sohan", 200, 100);
		double loanAmount_pe=loan.calculateLoanAmount(pe);
		double loanAmount_te=loan.calculateLoanAmount(te);
		System.out.println(pe.getEmployeeName()+" "+"loan amount is "+loanAmount_pe);
		System.out.println(te.getEmployeeName()+" "+"loan amount is "+loanAmount_te);
	}
}
