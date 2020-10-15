package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;



public class General extends Global{
	public void openapplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\adapala bhanu\\Desktop\\SELNM\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to(url);
		System.out.println("application opened");//console
		Reporter.log("application opened");//HTML report
		
	}
	public void closebrowser() {
		driver.close();
		System.out.println("application closed");
		Reporter.log("application closed");
		
		
		
	}

	public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		
		driver.close();
		
		
	}
		public void logout() {
			driver.findElement(By.linkText(link_logout)).click();
		}
			public void addemp() {
				System.out.println("add employee");
			}
			public void delemp() {
				System.out.println("delete employee");
		}
	}

