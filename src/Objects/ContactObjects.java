package Objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactObjects 
{
	 @FindBy(how = How.NAME, using = "FirstName")
	 public static WebElement firstname;
	 
	 @FindBy(how = How.ID,using = "Lastname")
	 public static WebElement lastname;
	 
	 @FindBy(how = How.ID, using = "Company")
	 public static WebElement Company;
	 
	 @FindBy (how = How.ID, using = "Email")
	 public static WebElement Email;
	 
	 @FindBy (how = How.ID,using="Phone")
	 public static WebElement Phone;
	 
	 @FindBy(how = How.CSS, using = "[name='Use_Case__c'][value='Application Search']")
	 public static WebElement Usecasedrpdwn;
	 
	 @FindBy(how = How.CSS, using = "[name='Job_Function__c'][value='Technical/IT/Dev Operations']")
	 public static WebElement Jobfunction;
	 
	 @FindBy (how = How.CSS, using = "[name='tempTextforForm'][value = 'Consulting']")
	 public static WebElement chckbx;
}
