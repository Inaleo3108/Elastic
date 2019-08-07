package Data;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;

public class DataLogin 
{
	//private static final String By = null;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://login.yahoo.com/";
		driver.get (baseUrl);
		
		driver.findElement(By.id("login-username")).sendKeys("inaleo.colaco@yahoo.in");
		Thread.sleep(3000);
		driver.findElement(By.name("signin")).click();
		
	}

	
}
