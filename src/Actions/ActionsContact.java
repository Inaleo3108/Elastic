package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Objects.ContactObjects;

public class ActionsContact extends ContactObjects
{
	WebDriver driver;
	public static void Textbox(WebElement element,String value,WebDriver driver)
	{
		element.sendKeys(value);
	}
	public static void Checkbox(WebElement element,String value,WebDriver driver)
	{
		element.click();
	}
	public static void Drpdwn(WebElement element,String value,WebDriver driver)
	{
		element.click();
	}
}

