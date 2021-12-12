package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactDetails 
{
WebDriver driver;
By contactDetail=By.linkText("Contact Details");
By editcontact=By.cssSelector("input#btnSave");
By addresssteet1=By.cssSelector("input#contact_street1");
By cityName=By.xpath("//input[@name='contact[city]']");
By mobileNumber=By.xpath("//input[@name='contact[emp_mobile]']");
By mailId=By.xpath("//label[text()='Work Email']//following-sibling::input[1]");
By savebutton=By.xpath("//input[@value=\"Save\"]");

public ContactDetails(WebDriver driver)
{
	this.driver=driver;
}

public void verifcontactdetails()
{
driver.findElement(contactDetail).click();
}
public  void verifycontact()
{
driver.findElement(editcontact)	.click();
	}

public void verifyAddresstreect()
{
driver.findElement(addresssteet1).sendKeys("Marathhalli");	
}

public void verifycityNAME()
{
driver.findElement(cityName).sendKeys("Bangaluru");
}
public void verifymobileNumber ()
{
driver.findElement(mobileNumber).sendKeys("9848525525");
}
public void  VerfymailId ()
{
driver.findElement(mailId).sendKeys("rahulmuz97@gmail.com");
}
public void verifysavebutton()
{
driver.findElement(savebutton).click();
	}

}


