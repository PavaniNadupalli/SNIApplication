package testPages;


import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.InstituteOnboardingRegistrationObjects;
import pageObjects.HomePageObjects;
import reusableComponents.ExcelOperations;
import reusableComponents.PropertiesOperations;
import testBase.TestBase;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Institute_Onboarding_Page_Test  extends TestBase{
String fileName = "//src//test//resources//testData//RegistrationAsInstituteThroughOnborading.xlsx";
	
	ExcelOperations excel = new ExcelOperations(fileName,"RegistrationforInsitute");
	
	@Test (dataProvider = "RegisterInstitute")
	public void RegisterInstitute(Object obj1) throws Exception {
		
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		System.out.println(testData);
	
		homePage.InstitutionsSelect();  
		OnboardingInstituionRegistration.onboardingInstituteRegistration(testData);
		
		
		
		

	}
	//Dataprovider method --> return object array
		@DataProvider (name = "RegisterInstitute")
		public Object[][] testDataSupplier() throws Exception {
			Object[][] obj = new Object[excel.getRowCount()][1];
			for (int i = 1; i <= excel.getRowCount(); i++) {
				HashMap<String, String> testData = excel.getTestDataInMap(i);
				obj[i-1][0] = testData;
				
			}
			


			for(int i =0;i<obj.length;i++) {
				for(int j = 0;j<obj[i].length;j++) {
					System.out.println(obj[i][j]);
				}
			}
		
			return obj;
			
		}
	

	

}
