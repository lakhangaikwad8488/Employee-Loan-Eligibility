package test.java.yaksha;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.java.yaksha.Employee;
import main.java.yaksha.Loan;

import main.java.yaksha.PermanentEmployee;
import main.java.yaksha.TemporaryEmployee;
import main.java.yaksha.TestUtils;



class MainTest {

	
	 
	@Test
	void testCalculateLoanAmount() throws IOException {
		Loan loan=new Loan();
		  Employee p=new PermanentEmployee(1, "Ritika", 50000);
		  Employee t=new TemporaryEmployee(56, "Sohan", 200, 100);
		  p.calculateSalary();
		  t.calculateSalary();
	 
				//assertEquals(6600.0, loanAmountP);
				 
				//assertEquals(2000.0, loanAmountT);
				 TestUtils.yakshaAssert(TestUtils.currentTest(),loan.calculateLoanAmount(p)==6600.0==true?"true":"false",TestUtils.businessTestFile);

		  
	}
	
	@Test
	void testCalculateSalary() throws IOException {
		
		Employee p=new PermanentEmployee(1, "Ritika", 50000);
		  Employee t=new TemporaryEmployee(56, "Sohan", 200, 100);
		  p.calculateSalary();
		  t.calculateSalary();
		  //assertEquals(44000.0,p.getSalary());
		TestUtils.yakshaAssert(TestUtils.currentTest(),p.getSalary()==44000==true?"true":"false",TestUtils.businessTestFile);

		  //assertEquals(20000.0,t.getSalary());
	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);	             

	}	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);
	}	 
		
}
