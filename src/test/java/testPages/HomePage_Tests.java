package AdminModuleTestCase;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import reusableComponents.ExcelOperations;
import testBase.TestBase;

public class HomePage_Tests extends TestBase{
	
	@Test
	public void homePage() throws Exception {
		homePage.clickOnSignIn();	
		
	}
	

	
}
