package testingExamples;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;



public class ExampleForTestNgAnnonations1 {
	
		 @BeforeMethod
		public void login(){
		System.out.println("login completed");
		}
		 @AfterMethod
		public void logout(){
		System.out.println("logout completed");
		}
		@Test	
		public void addemp() {
		System.out.println("Adding new emp");
		}
		@Test(priority=1)
		public void delemp() {
		System.out.println("delete emp");

		
}
}
