package testingExamples;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;


public class ExampleForTestNgAnnotations {
	
	@BeforeClass 
		public void login() {
		
			System.out.println("login completed");
		}
	@AfterClass
	public void logout() {
		System.out.println("logout completed");
	}
	
	@Test(priority=2)
	public void Addemp() {
		System.out.println("add employee");
	}
	
	
	@Test(priority=1)
	public void deleteemp() {
		System.out.println("delete employee");
	}

}
