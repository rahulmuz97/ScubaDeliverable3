package com.test.pages;
 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.test.pageobjects.OrangeHRM;
public class PersonalContactDetails 
{
	//WebDriver driver;

	public PersonalContactDetails(WebDriver driver) 
	{
		super(driver);
	}	
	By infoTab=By.xpath("//b[contains(text(),'My Info')]");
	By Edit=By.id("btnSave");
	 By eMPLOYEID=By.cssSelector("input#personal_txtEmployeeId");
	 By driverLicence=By.cssSelector("input#personal_txtLicenNo");
	 By ssnNumber=By.cssSelector("input#personal_txtNICNo");
	 By name=By.cssSelector("input#personal_txtEmpNickName");
	 By SSsNumber=By.id("personal_txtNICNo");
	 By savebutton=By.xpath(" //input[@value=\"Save\"]");
	 
	 
	
public void  VerifyInfoTab() 
	{
driver.findElement(infoTab).click();
}

public void verifyEdit()
{
driver.findElement(Edit).click();
	}
public void  employeid ()
{
driver.findElement(eMPLOYEID).sendKeys("1233456");
}
public void personalid ()
{
driver.findElement( driverLicence).sendKeys("52146123");
	}
public void Sscnumber()
{
driver.findElement(SSsNumber).sendKeys("5321153");
	}

public void savebutton()
{
driver.findElement(savebutton).click();
}
	}


	









public class PersonalContactDetails {

}
