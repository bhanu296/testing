package com.hrms.testscripts;


import org.testng.annotations.Test;

import com.hrms.lib.*;

public class TC001 {
//public static void main(String args[]) throws Exception{
	@Test
	public void TC001() throws Exception {
		
		
	General g =new General();
	g.openapplication();
	g.login();
	g.addemp();
	g.delemp();
	g.logout();
	g.closebrowser();
	
	
}
}


