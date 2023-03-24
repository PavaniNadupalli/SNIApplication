package AdminModuleTestCase;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class LoginPage_Tests extends TestBase{
	
	@Test
	public void loginPage() throws Exception {
		loginPage.clickOnSignIn();	
		
	}
	

	
}
