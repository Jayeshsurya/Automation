package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		WebDriver driver =new ChromeDriver();
		WebElement firsttext=driver.findElement(By.xpath("//body/h1[2]"));
		System.out.println("Hello Guys, I am launching automation test cases");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://jksuryawanshi.azurewebsites.net/webapp/");
		String text =firsttext.getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("This is the first change done"));
		driver.close();
	}
}
