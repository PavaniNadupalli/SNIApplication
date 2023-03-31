package testPages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class InstituteFacultyPage_Test extends TestBase {
	
	

	String fileName = "//src//test//resources//testData//AllCredsLogins_TestData.xlsx";
	
	ExcelOperations excelInstiuteSheet = new ExcelOperations(fileName, "InstituteOnboardFacultyDetails");
	

	

	@Test(dataProvider = "institutefacultyflow")
	public void loginInstituteAfterOnboardRegistration(Object obj1) throws Exception {
		System.out.println("Pavani");
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		System.out.println(testData);

		homePage.naviagte_clickOnSignIn();

		commonLoginPage.login(testData);

		String title1 = instituteFacultyCreation.InstituteFacultyCreation(testData);
		System.out.println("The Ttitle is " + title1);
		Thread.sleep(3000);
		System.out.println("before logout");
		homePage.logoutButton();
		System.out.println("after logout");
		
		Thread.sleep(3000);
	
		homePage.clickOnSignIn();
		
		commonLoginPage.LoginAsFacultyCreatedByInstitute(testData);
		Thread.sleep(2000);
		homePage.logoutButton();
	

	}
	
	
	

	@DataProvider(name = "institutefacultyflow")
	public Object[][] testDataSupplier1() throws Exception {
		System.out.println("Anuhya" + "Vamsi== 1234");
		Object[][] obj = new Object[excelInstiuteSheet.getRowCount()][1];
		for (int i = 1; i <= excelInstiuteSheet.getRowCount(); i++) {
			HashMap<String, String> testData = excelInstiuteSheet.getTestDataInMap(i);
			obj[i - 1][0] = testData;
			System.out.println("Anuhya" + "Vamsi");
			System.out.println(testData);

		}

		return obj;
	}

	
	
	


	
}


