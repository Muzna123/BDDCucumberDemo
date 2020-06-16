package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		System.out.println("Executed Before Scenario");
	}
	
	@After
	public void tearDown() {
		System.out.println("Executed After Scenario");
	}
	
	@Before("@SmokeTest")
	public void smokesetUp() {
		System.out.println("Executed Before Smoke Scenario");
	}
	
	@After("@SmokeTest")
	public void smoketearDown() {
		System.out.println("Executed After Smoke Scenario");
	}
	
	@Before("@Regression")
	public void regsetUp() {
		System.out.println("Executed Before Regression Scenario");
	}
	
	@After("@Regression")
	public void regtearDown() {
		System.out.println("Executed After Regression Scenario");
	}

}
