package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class InstituteDashBoardObjects extends TestBase 
{
			@FindBy (xpath = "//p[contains(text(),'Faculty')]")
			WebElement FacultyLink;
			
			public InstituteDashBoardObjects() {
				PageFactory.initElements(driver, this);
			}
			
			public void  ClickOnFaculty()  {
				
				FacultyLink.click();
				
				
			}
}
