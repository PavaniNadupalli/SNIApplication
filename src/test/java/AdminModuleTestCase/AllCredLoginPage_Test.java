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

public class AllCredLoginPage_Test extends TestBase {

	String fileName = "//src//test//resources//testData//AllCredsLogins_TestData.xlsx";

	ExcelOperations excel = new ExcelOperations(fileName, "AllRoleLogins");
    
	ExcelOperations excelInstiuteSheet = new ExcelOperations(fileName , "OnboardingRegisteredInstitute");
	
	
	
	/*
	 * @Test(dataProvider = "allLogin") public void login(Object obj1) throws
	 * Exception { HashMap<String, String> testData = (HashMap<String, String>)
	 * obj1;
	 * 
	 * loginPage.clickOnSignIn(); String title =
	 * allCredLogPage.allCredLogin(testData); System.out.println("The Title is:" +
	 * title); WebElement logout =
	 * driver.findElement(By.partialLinkText("Log-Out")); logout.click();
	 * 
	 * }
	 */

	@Test(dataProvider = "institute")
	public void loginInstituteAfterOnboardRegistration(Object obj1) throws Exception {
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		System.out.println(testData);
		
		loginPage.naviagte_clickOnSignIn();
		
		allCredLogPage.allCredLogin(testData);
		
		instituteDashBoard.ClickOnFaculty();
		
		 String title1 = instituteFacultyCreation.InstituteFacultyCreation(testData);
		 System.out.println("The Ttitle is " + title1);
		 Thread.sleep(3000);
		 
		WebElement logout = driver.findElement(By.partialLinkText("Log-Out"));
		logout.click();
		
		Thread.sleep(2000);
		
	
		loginPage.clickOnSignIn();
		
		allCredLogPage.LoginAsFacultyCreatedByInstitute(testData);
		Thread.sleep(2000);
		
		WebElement logout1 = driver.findElement(By.partialLinkText("Log-Out"));
		logout.click();
		
	}
	
	
	/*
	 * // Dataprovider method --> return object array
	 * 
	 * @DataProvider(name = "allLogin") public Object[][] testDataSupplier() throws
	 * Exception { Object[][] obj = new Object[excel.getRowCount()][1]; for (int i =
	 * 1; i <= excel.getRowCount(); i++) { HashMap<String, String> testData =
	 * excel.getTestDataInMap(i); obj[i-1][0] = testData; } return obj;
	 * 
	 * }
	 */
	@DataProvider(name = "institute")
	public Object[][] testDataSupplier1() throws Exception {
		Object[][] obj = new Object[excelInstiuteSheet.getRowCount()][1];
		for (int i = 1; i <= excelInstiuteSheet.getRowCount(); i++) {
			HashMap<String, String> testData = excelInstiuteSheet.getTestDataInMap(i);
			obj[i-1][0] = testData;
			System.out.println(testData);
		}
		
	
		return obj;
	}
	
	

	

	
	


}