package pageObjects;


import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponents.CommonConstants;
import testBase.TestBase;

public class InstituteOnboardingRegistrationObjects extends TestBase {
	
	
	
		@FindBy(id = "institutename")
		WebElement instituteFullName ;
	
		@FindBy(id = "InstMailid")
		WebElement instituteEmail ;
	
		@FindBy(id = "InstcontactNumber")
		WebElement institutePhoneNumber ;
	
		
		@FindBy(id = "InstMallingAddress")
		WebElement instituteMailingAddress ;
	
		@FindBy(id = "statelist")
		WebElement instituteState;
	
		@FindBy(id = "citylist")
		WebElement instituteCity;
	
		@FindBy(id ="InstPhoto")
		WebElement institutePhoto;
	
		@FindBy(id = "Password")
		WebElement institutePassword;
	
		@FindBy(id = "ConfirmPassword")
		WebElement instituteConfirmPassword;
		
		@FindBy(id = "NewChannelpartnerRegister")
		WebElement instituteRegisterButton;
	
	
			public InstituteOnboardingRegistrationObjects() {
				PageFactory.initElements(driver, this);
			}
			
			
			   public String onboardingInstituteRegistration(HashMap<String, String> testData) throws Exception {
				   
				//RegistrationPage of institute Data		    
				   instituteFullName.sendKeys(testData.get(CommonConstants.ONBOARD_INSTITUTE_FULL_NAME).toString());
				   instituteEmail.sendKeys(testData.get(CommonConstants.ONBOARD_INSTITUTE_EMAIL).toString());
				   institutePhoneNumber.sendKeys(testData.get(CommonConstants.ONBOARD_INSTITUTE_PHONE_NUMBER).toString());
				   instituteMailingAddress.sendKeys(testData.get(CommonConstants.ONBOARD_INSTITUTE_MAILING_ADDRESS).toString());
				
					    
					   // using common methods for drop down
					commonMethods.selectDropdownOption(instituteState, testData.get(CommonConstants.ONBOARD_INSTITUTE_STATE).toString());
					commonMethods.selectDropdownOption(instituteCity, testData.get(CommonConstants.ONBOARD_INSTITUTE_CITY).toString());
					    
					// RegistrationPage of institute data
					institutePassword.sendKeys(testData.get(CommonConstants.ONBOARD_INSTITUTE_PASSWORD).toString());
					instituteConfirmPassword.sendKeys(testData.get(CommonConstants.ONBOARD_INSTITUTE_CONFIRM_PASSWORD).toString());
					System.out.println("Anuhya========");
					    // using robot class in common methods for file upload
					    commonMethods.selectFileUpLoad(institutePhoto, testData.get(CommonConstants.ONBOARD_INSTITUTE_FILE_UPLOAD).toString(), driver);
						System.out.println("Anuhya+++++++++++++++++++");
					   Thread.sleep(5000);
					   
					    // using java script executor for clicking on register button
					    JavascriptExecutor executor =  (JavascriptExecutor)driver;
					    executor.executeScript("arguments[0].click();", instituteRegisterButton);
					   
					     
					  
						return driver.getTitle();
					}
				
			
}
