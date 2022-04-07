package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void beforevalidation() 
	{
		System.out.println(" Mobile before hooks");
		
	}
	@After("@WebTest")
	public void aftervalidation() 
	{
		System.out.println(" Mobile after hooks");
	}
}
