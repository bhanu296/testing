package testingExamples;



import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	
		public class Exp_WD_Testing1 {
			 public WebDriver driver;
			@BeforeClass
			
			public void Startup(){
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapala bhanu\\Desktop\\SELNM\\chromedriver.exe");
			
				driver = new ChromeDriver();
			}
			@AfterClass
			public void teardown(){
			driver.quit();
		
			
			}
			@Test
			public void login() throws Exception{
				
				FileInputStream f1 = new FileInputStream("C:\\Users\\adapala bhanu\\Desktop\\NEW TOOL SELENIUM\\Book1.xls");
				Workbook w = Workbook.getWorkbook(f1);
				Sheet s = w.getSheet(0);
				String un = s.getCell(0,1).getContents();
				String pw= s.getCell(1,1).getContents();
				Reporter.log("un");
				Reporter.log("pw");
		
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("application opened");
		Reporter.log("application opened");
		driver.findElement(By.name("txtUserName")).sendKeys(un);
		driver.findElement(By.name("txtPassword")).sendKeys(pw);
		driver.findElement(By.name("Submit")).click();
		System.out.println("login completed");
		Reporter.log("login completed");
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("logout completed");
		Reporter.log("logout completed");
		
		
		
		
		
		
	}
	}


