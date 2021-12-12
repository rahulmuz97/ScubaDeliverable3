package com.test.pageobjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import com.test.packages.Contactdetails;
	import com.test.packages.EmergencyContace;
	import com.test.packages.Loginpage;
	import com.test.packages.Personaldetails;

	import io.github.bonigarcia.wdm.WebDriverManager;



	
	public class OrangeHRM 
	{
		@Test
		public void VerifyValidLogin() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");

			// LoginPage object creation - parameter driver is passed here
	Loginpage login = new Loginpage(driver);
			login.typeUserName();
			login.typePassword();
			login.clickOnLoginButton();
			
			
			
	// personaldetails information
	Personaldetails s=new Personaldetails(driver);

			s.VerifyInfoTab();
			s.verifyEdit();
			s.employeid();
			s. personalid();
			s.Sscnumber();
			
	//contactdetails inforamtion
	Contactdetails d=new Contactdetails(driver);
			d.verifcontactdetails();
			d. verifycontact();
			d.verifyAddresstreect();
			d.verifycityNAME();
			d.verifymobileNumber();
			d.VerfymailId();
		//emergencycontact details	
	EmergencyContact k= new EmergencyContact(driver);
			k. VerifyEmergencyContact();
			k.VerifyAddButton();
			k.VerifyNameOfPerson();
			k. VerifyRelation();
			k. VerifyPhoneNumber();
			k.verifyWorkTelephone();
			driver.quit();


	}


		}

