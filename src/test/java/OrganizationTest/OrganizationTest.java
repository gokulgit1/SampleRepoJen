package OrganizationTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class OrganizationTest 
{
	//WebDriver driver;
	@Test(groups="regression")
	public void createOrg()
	{
		/*String value = System.getProperty("url");
		String browser = System.getProperty("browser");
		if(browser=="chrome")
			driver=new ChromeDriver();
		else if(browser=="FireFox")
			driver=new FirefoxDriver();
		driver.get(value);*/
		System.out.println("sucessfully created");
		//driver.close();
	}
}
