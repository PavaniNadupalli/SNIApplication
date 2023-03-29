package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class HomePageObjects extends TestBase {
	//only page objects + respective methods
	
	@FindBy(xpath = "//a[@class='sign-in-btn']")
	WebElement sign_in;
	
	@FindBy(id="showDetails")
	WebElement show_details;
	
	@FindBy(xpath ="//a[@class ='link-foreground']")
	WebElement wish;
	
	
	@FindBy(id ="details-button")
	WebElement Advanced;
	
	@FindBy(id = "proceed-link" )
	WebElement Proceed;
	
	@FindBy(xpath = "//button[text()='Onboarding']")
	WebElement onboardinglink;
	
	@FindBy (partialLinkText = "Insti")
	WebElement institutionslink;
	
	@FindBy (xpath = "//p[text()='Log-Out']")
	WebElement logout;
	


	
	//constructor - to use initElement method
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	//Navigating to home page
	public void homepage() throws InterruptedException {
		System.out.println(driver);
		Advanced.click();
	    Proceed.click();	
	    Thread.sleep(4000);
	  
	    
	}
	//navigating to home page and click on sign in button
	public void naviagte_clickOnSignIn() throws InterruptedException{
		System.out.println(driver);
		this.homepage();
		sign_in.click();
	}
	
	// clicking on sign in
		public void clickOnSignIn() throws InterruptedException {
			System.out.println(driver);
			sign_in.click();
		}	
	// navigating to home page and click on on boarding in menu
	public void OnboardingButton()  throws InterruptedException
	{
		System.out.println(driver);
		onboardinglink.click();
	}
	// navigating to home page and click on on boarding in menu , and click on institutions link 
	public void InstitutionsSelect() throws InterruptedException{
		System.out.println(driver);
		this.homepage();
		this.OnboardingButton();
		institutionslink.click();
	}
	
	public void logoutButton() {
		System.out.println(driver);
		logout.click();
	}
}
