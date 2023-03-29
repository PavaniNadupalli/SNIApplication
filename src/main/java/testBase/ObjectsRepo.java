package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.CommonLoginPageObjects;

import pageObjects.InstituteFacultyPageObjects;
import pageObjects.InstituteOnboardingRegistrationObjects;
import pageObjects.HomePageObjects;
//import pageObjects.SelectPriceOptionsPageObjects;
import reusableComponents.CommonMethods;

public class ObjectsRepo {
	
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static HomePageObjects homePage;
	public static CommonLoginPageObjects commonLoginPage;
	public static InstituteOnboardingRegistrationObjects OnboardingInstituionRegistration;
	public static InstituteFacultyPageObjects instituteFacultyCreation;
	
	public CommonMethods commonMethods = new CommonMethods();
}
