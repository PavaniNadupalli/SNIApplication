package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pageObjects.AllCredLoginPageObjects;
import pageObjects.InstituteDashBoardObjects;
import pageObjects.InstituteFacultyPageObjects;
import pageObjects.InstituteOnboardingRegistrationObjects;
import pageObjects.LoginPageObjects;
//import pageObjects.SelectPriceOptionsPageObjects;
import reusableComponents.CommonMethods;

public class ObjectsRepo {
	
	
	public static ExtentReports extent;
	public static ExtentTest test;
	public static LoginPageObjects loginPage;
	public static AllCredLoginPageObjects allCredLogPage;
	public static InstituteDashBoardObjects instituteDashBoard;
	public static InstituteOnboardingRegistrationObjects OnboardingInstituionRegistration;
	public static InstituteFacultyPageObjects instituteFacultyCreation;
	public CommonMethods commonMethods = new CommonMethods();
}
