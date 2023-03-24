package AdminModuleTestCase;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class InstituteFacultyPage_Test extends TestBase {
	
	String fileName = "//src//test//resources//testData//FacultyDetailsCreatedByInstitute.xlsx";
	
	ExcelOperations excelFacultySheet = new ExcelOperations(fileName , "FacultyDetails");
	
	String fileName1 = "//src//test//resources//testData//AllCredsLogins_TestData.xlsx";
	
	ExcelOperations excelInstiuteSheet = new ExcelOperations(fileName1 , "OnboardingRegisteredInstitute");
	
	
	@Test(dataProvider = "InstituteLogin")
	public void login(Object obj1) throws Exception {
		HashMap<String, String> testData1 = (HashMap<String, String>) obj1;
		System.out.println(testData1);
		loginPage.clickOnSignIn();
		allCredLogPage.allCredLogin(testData1);
		instituteDashBoard.ClickOnFaculty();
		
		
	}
	@DataProvider(name = "InstituteLogin")
	public Object[][] testDataSupplier() throws Exception {
		Object[][] obj = new Object[excelInstiuteSheet.getRowCount()][1];
		for (int i = 1; i <= excelInstiuteSheet.getRowCount(); i++) {
			HashMap<String, String> testData1 = excelInstiuteSheet.getTestDataInMap(i);
			obj[i-1][0] = testData1;
		}
		return obj;

	}

	@Test(dataProvider = "FacultyCreationDetails")
	public void FacultyCreationByInstitute(Object obj1) throws Exception {
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		System.out.println(testData);
		
		instituteFacultyCreation.InstituteFacultyCreation(testData);
		
	}
	@DataProvider(name = "FacultyCreationDetails")
	public Object[][] testDataSupplier1() throws Exception {
		Object[][] obj = new Object[excelFacultySheet.getRowCount()][1];
		for (int i = 1; i <= excelFacultySheet.getRowCount(); i++) {
			HashMap<String, String> testData = excelFacultySheet.getTestDataInMap(i);
			obj[i-1][0] = testData;
		}
		return obj;

	}
}


