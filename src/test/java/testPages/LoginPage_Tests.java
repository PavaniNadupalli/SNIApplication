package testPages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.CustomListener;
import reusableComponents.CommonConstants;
import reusableComponents.ExcelOperations;
import testBase.ObjectsRepo;
import testBase.TestBase;


@Listeners(CustomListener.class)
public class LoginPage_Tests extends TestBase {

	String fileName = "//src//test//resources//testData//AllCredsLogins_TestData.xlsx";

	ExcelOperations excel = new ExcelOperations(fileName, "AllRoleLogins");



	@Test(dataProvider = "allLogin")
	public void login(Object obj1) throws Exception {
		HashMap<String, String> testData = (HashMap<String, String>) obj1;
		System.out.println("In login method");
		homePage.naviagte_clickOnSignIn();
		System.out.println("after click on sign in");
		String title = commonLoginPage.login(testData);
		System.out.println("The Title is:" + title);
		WebElement logout = driver.findElement(By.partialLinkText("Log-Out"));
		logout.click();
	

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


}