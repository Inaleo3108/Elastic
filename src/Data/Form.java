package Data;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Actions.ActionsContact;
import Objects.ContactObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;

public class Form 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe");
		WebDriver driver =new ChromeDriver ();
		
		String baseUrl ="https://www.elastic.co/contact";
		driver.get(baseUrl);
		
		ActionsContact.Textbox(ActionsContact.firstname,"test123",driver);
		ActionsContact.Textbox(ActionsContact.lastname,"test1234", driver);
		ActionsContact.Textbox(ActionsContact.Company,"Test123", driver);
		ActionsContact.Textbox(ActionsContact.Email,"test@123", driver);
		ActionsContact.Textbox(ActionsContact.Phone, "123456", driver);
		ActionsContact.Drpdwn(ActionsContact.Usecasedrpdwn, "Application Search", driver);
		ActionsContact.Drpdwn(ActionsContact.Jobfunction, "DBA", driver);
		ActionsContact.Checkbox(ActionsContact.chckbx,"Consulting", driver);
		
		
		Select UsecaseA = new Select (driver.findElement(By.name("Use_Case__c")));
		UsecaseA.selectByVisibleText("Application Search");
		
		Select UsecaseB = new Select (driver.findElement(By.name("Job_Function__c")));
		UsecaseB.selectByVisibleText("Technical/IT/Dev Operations");
		
		driver.findElement(By.xpath("//label[contains (text(),'Training')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	}

}
