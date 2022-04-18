package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 
{
	@Test
	public void Ploan() 
	{
		System.out.println("Nice one");
	}
	
	@BeforeTest
	public void prerequiste() 
	{
		System.out.println("I am going to execute first ");
	}
	

}
