package org.testing.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hindi_BM_TAM {
	//@BeforeMethod
	
	@BeforeMethod
	public void UserRegistration(){
		System.out.println("User is getting registered");
	}
	
	
	@Test
	public void UserLogin() {
		System.out.println("User is able to login");
	}
	
	@Test
	public void UserMoneycounter() {
		System.out.println("User is able to transfer funds to another account");
	}
	
	@AfterMethod
	public void UserLogout() {
		System.out.println("User is able to  logout");
	}
	

	

}
