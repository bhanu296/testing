package testingExamples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Exp_WD_Testing {
	WebDriver driver;

	@BeforeClass
public void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapala bhanu\\Desktop\\SELNM\\chromedriver.exe");
	driver =new ChromeDriver();
	
}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
@Test
public void tc001(){
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println("application opened");
	Reporter.log("application opened");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Reporter.log("login completed");
	driver.findElement(By.linkText("Logout")).click();
	
	System.out.println("logout completed");
	Reporter.log("logout completed");
	
	
	
	
	
}
}