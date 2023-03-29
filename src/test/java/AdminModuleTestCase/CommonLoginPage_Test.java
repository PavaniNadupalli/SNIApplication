package AdminModuleTestCase;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reusableComponents.CommonConstants;
import reusableComponents.ExcelOperations;
import testBase.ObjectsRepo;
import testBase.TestBase;

public class CommonLoginPage_Test extends TestBase {

	String fileName = "//src//test//resources//testData//AllCredsLogins_TestData.xlsx";

	ExcelOperations excel = new ExcelOperations(fileName, "AllRoleLogins");

	ExcelOperations excelInstiuteSheet = new ExcelOperations(fileName, "InstituteOnboardFacultyDetails");

	@Test(dataProvider = "allLogin")
	public void login(Object obj1) throws Exception {
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		System.out.println("In login method");
		homePage.naviagte_clickOnSignIn();
		System.out.println("after click on sign in");
		String title = commonLoginPage.commonLogin(testData);
		System.out.println("The Title is:" + title);
		WebElement logout = driver.findElement(By.partialLinkText("Log-Out"));
		logout.click();
		driver.close();

	}

	@Test(dataProvider = "institutefacultyflow")
	public void loginInstituteAfterOnboardRegistration(Object obj1) throws Exception {
		System.out.println("Pavani");
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		System.out.println(testData);

		homePage.naviagte_clickOnSignIn();

		commonLoginPage.commonLogin(testData);

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
		driver.close();
		

	}

	// Data provider method --> return object array

	@DataProvider(name = "allLogin")
	public Object[][] testDataSupplier() throws Exception {
		Object[][] obj = new Object[excel.getRowCount()][1];
		for (int i = 1; i <= excel.getRowCount(); i++) {
			HashMap<String, String> testData = excel.getTestDataInMap(i);
			obj[i - 1][0] = testData;
		}
		return obj;

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