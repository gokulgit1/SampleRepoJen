package com.crm.espinaca.ContactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ContactTest
{
	//WebDriver driver ;
	@Test
	public void createContact()
	{
		//driver=new FirefoxDriver();
		//String browser = System.getProperty("Browser");
		//System.out.println(browser);
		//String url = System.getProperty("URL");
		//System.out.println(url);		
		System.out.println("contact created successfully");
		//driver.close();
	}
	@Test(groups="regression")
	public void createContactandDelete()
	{
		//driver=new ChromeDriver();
		System.out.println("successfully deleted");
		System.out.println("Gokul");
		//driver.close();
	}
}

