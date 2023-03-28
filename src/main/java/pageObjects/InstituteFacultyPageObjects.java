package pageObjects;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableComponents.CommonConstants;
import testBase.TestBase;

public class InstituteFacultyPageObjects extends TestBase  {
	
	@FindBy (id = "UploadNewFaculty")
	WebElement createFacultyButton;
	
	@FindBy(id = "UserName")
	WebElement facultyUsername;
	
	@FindBy(id = "Subject")
	WebElement facultySubject;
	
	@FindBy(id = "Email")
	WebElement facultyeEmail;
	
	@FindBy(id = "PhoneNumber")
	WebElement facultyPhonenumber;
	
	@FindBy(id = "address")
	WebElement facultyAddress;
	
	@FindBy(id = "biograpghy")
	WebElement facultyBiography;
	
	@FindBy(id = "Occupation")
	WebElement facultyOccupation;
	
	@FindBy(id = "Password")
	WebElement facultyPassword;
	
	@FindBy(id = "ConfirmPassword")
	WebElement facultyConfirmPassword;

	
	
	@FindBy(id = "CreateNewFaculty")
	WebElement facultyCreateButton;
	
	@FindBy(xpath = "//button[text()='OK']")
	WebElement okButton;
	
	public InstituteFacultyPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
			public String InstituteFacultyCreation (HashMap<String, String> testData) throws Exception {
				
				createFacultyButton.click();
				
				facultyUsername.sendKeys(testData.get(CommonConstants.INSTITUTE_FACULTY_USER_NAME).toString());
				
				commonMethods.selectDropdownOption(facultySubject, testData.get(CommonConstants.INSTITUTE_FACULTY_SUBJECT.toString()));
				
				facultyeEmail.sendKeys(testData.get(CommonConstants.INSTITUTE_FACULTY_EMAIL.toString()));
				facultyPhonenumber.sendKeys(testData.get(CommonConstants.INSTITUTE_FACULTY_PHONE_NUMBER.toString()));
				facultyAddress.sendKeys(testData.get(CommonConstants.INSTITUTE_FACULTY_ADDRESS.toString()));
				facultyBiography.sendKeys(testData.get(CommonConstants.INSTITUTE_FACULTY_BIOGRAPHY.toString()));
				facultyOccupation.sendKeys(testData.get(CommonConstants.INSTITUTE_FACULTY_OCCUPATION.toString()));
				facultyPassword.sendKeys(testData.get(CommonConstants.ONBOARD_INSTITUTE_PASSWORD.toString()));
				facultyConfirmPassword.sendKeys(testData.get(CommonConstants.INSTITUTE_FACULTY_CONFIRM_PASSWORD).toString());
				
				facultyCreateButton.click();
				Thread.sleep(3000);
				okButton.click();
				
				Thread.sleep(2000);
				
			
				return driver.getTitle();
				
			}
}
