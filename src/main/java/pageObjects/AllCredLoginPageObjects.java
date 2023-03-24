package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableComponents.CommonConstants;
import testBase.TestBase;

public class AllCredLoginPageObjects extends TestBase {
	
	@FindBy(name = "LoginAs")
	WebElement LoginAs;
	
	@FindBy(name = "UserName")
	WebElement username;
	
	@FindBy(name = "Password")
	WebElement password;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement Login;
	


	//constructor - to use initElement method
		public AllCredLoginPageObjects() {
			PageFactory.initElements(driver, this);
		}
		
		//for click on motorcycle link on homepage
		public String allCredLogin(HashMap<String, String> testData) throws Exception {
			System.out.println(driver);
			//LoginAs.click();
			commonMethods.selectDropdownOption(LoginAs, testData.get(CommonConstants.ROLE).toString());
			username.sendKeys(testData.get(CommonConstants.USER_NAME).toString());
			password.sendKeys(testData.get(CommonConstants.PASSWORD).toString());
			Login.click();
			return driver.getTitle();
		}
	
	
	
}
