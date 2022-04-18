package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 
{
	
	@Test
	public void WebLoginCarloan() 
	{
		//selenium
		System.out.println("WebLogincar");
	}
	
	//BeforeMethod specific to class file  
	@BeforeMethod
	public void BeforeEvery() 
	{
		System.out.println("WebLoginCar (It will execute before every class)");
	}
	
	@AfterMethod
	public void AfterEvery() 
	{
		System.out.println("WebLoginCar (It will execute after every class)");
	}
	
	
	
	@Test
	public void MobileLoginCarloan() 
	{
		//Appium
		System.out.println("MobileLoginCar");
	}
	
	@BeforeSuite
	public void Bfsuite() 
	{
		System.out.println("I am The Number One");
	}

	@Test
	public void MobileSignInCarloan() 
	{
		//Appium
		System.out.println("Mobile  SignIn");
	}
	
	@Test
	public void MobileSignOutCarloan() 
	{
		//Appium
		System.out.println("Mobile SignOut");
	}
	
	
	@Test
	public void ApiCarLoan() 
	{
		//Rest Assured
		System.out.println("ApiLoginCar");
	}
	
	

}
