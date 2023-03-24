package AdminModuleTestCase;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class InstituteDashBoard_Test extends TestBase  {
	
	String fileName = "//src//test//resources//testData//AllCredsLogins_TestData.xlsx";
	
	ExcelOperations excelInstiuteSheet = new ExcelOperations(fileName , "OnboardingRegisteredInstitute");
	
	
	
	
	
	
	@Test(dataProvider = "InstituteLogin")
	public void login(Object obj1) throws Exception {
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		System.out.println(testData);
		loginPage.clickOnSignIn();
		allCredLogPage.allCredLogin(testData);
		instituteDashBoard.ClickOnFaculty();
		
		
	}
	@DataProvider(name = "InstituteLogin")
	public Object[][] testDataSupplier1() throws Exception {
		Object[][] obj = new Object[excelInstiuteSheet.getRowCount()][1];
		for (int i = 1; i <= excelInstiuteSheet.getRowCount(); i++) {
			HashMap<String, String> testData = excelInstiuteSheet.getTestDataInMap(i);
			obj[i-1][0] = testData;
		}
		return obj;

	}
}
