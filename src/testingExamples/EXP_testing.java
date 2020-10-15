package testingExamples;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EXP_testing {
	@BeforeClass
	public void login() {
		System.out.println("logout completed");
	}
	@AfterClass
public void logout() {
	System.out.println("logout completed");
}
	@Test
	public void addemp() {
		System.out.println("Add employee");
	}
	@Test
	public void deleemp() {
		System.out.println("delete emp");
	}
}
