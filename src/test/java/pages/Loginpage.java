package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class Loginpage {

	WebDriver driver = BaseClass.driver;
	ExtentTest test = BaseClass.test;
	
	//===============Webelement==============================================================
	
	@FindBy(className = "login")
	WebElement LoginLink;
	@FindBy(name = "user_login")
	WebElement UserName;
	@FindBy(id = "password")
	WebElement Password ;
	@FindBy(name = "btn_login")
	WebElement LoginBtn;
	@FindBy(className = "rememberMe")
	WebElement RememberMe;

	
	public Loginpage()  {

		PageFactory.initElements(driver, this);
	}
	
	//=======================================functions==================================================	
	public void LoginFunction(String UserNameVal,String PasswordVal) {	
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	    UserName.sendKeys("xyz@abc.com");
	    test.log(LogStatus.PASS, "Enter UserName", "Name Entered  successfully");
		Password.sendKeys("Abc@12345");
		test.log(LogStatus.PASS, "Enter Password", "Password Entered  successfully");
		RememberMe.click();
		test.log(LogStatus.PASS, "Click on Remember Me", "RememberMe Clicked  successfully");
		LoginBtn.click();
		test.log(LogStatus.PASS, "Click on LoginBtn", " LoginBtn Clicked successfully");
		
	}
}


