package com.sgtesting.basicscenario;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class BasicAssigTNG1 {

	public static WebDriver oBrowser=null;

	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			oBrowser.manage().window().maximize();
			oBrowser.get("http://localhost:82/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority=3,dataProvider="logindetails")
	private static void login(String User,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(User);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4,dataProvider="createuserdetails")
	private static void createUser(String fname,String lname,String mailid,String uname,String pass,String repass)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
			oBrowser.findElement(By.name("lastName")).sendKeys(lname);
			oBrowser.findElement(By.name("email")).sendKeys(mailid);
			oBrowser.findElement(By.name("username")).sendKeys(uname);
			oBrowser.findElement(By.name("password")).sendKeys(pass);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(repass);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=7)
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
			System.out.println("---------------------END OF BASIC SCENARIO_1------------------");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider(name="logindetails")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};		
	}
	
	@DataProvider(name="createuserdetails")
	public Object[][] getCreateUserData()
	{
		return new Object[][] {{"demo","User1","demouser1@gmail.com","demouser1","welcome123","welcome123"}};
	}
}


