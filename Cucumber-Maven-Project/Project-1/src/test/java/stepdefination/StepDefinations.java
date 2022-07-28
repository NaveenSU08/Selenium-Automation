package com.sgtesting.actitime.stepdefination;

import org.junit.Assert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	public static WebDriver oBrowser=null;
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Given("^I launch the chrome browser$")
	public void I_launch_the_chrome_browser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I navigate the URL of the application$")
	public void I_navigate_the_URL_of_the_application()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:82/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the usename in username text field$")
	public void I_enter_the_usename_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter the password in password text field$")
	public void I_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on Login button$")
	public void I_click_on_Login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Then("^I find the Home Page$")
	public void I_find_the_Home_Page()
	{
		try
		{
			Assert.assertTrue(oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']")).isDisplayed());
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */

	@Given("^I find User link button$")
	public void I_find_User_link_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter User Details$")
	public void I_enter_User_Details()
	{
		try
		{	
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demouser1@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on CreateUser$")
	public void  I_click_on_CreateUser()
	{
		try
		{	
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I find the user$")
	public void  I_find_the_user()
	{
		try
		{	
			oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Then("^I modify the user$")
	public void  I_modify_the_user()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Given("^I find User Name$")
	public void  I_find_User_Name()
	{
		try
		{	
			oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I click Delete button$")
	public void  I_click_Delete_button()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */

	@Given("^I find the logout link in Home Page$")
	public void I_find_the_logout_link_in_Home_Page()
	{
		String expected="Logout";
		try
		{
			String actual=oBrowser.findElement(By.linkText("Logout")).getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@When("^I click on Logout link$")
	public void I_click_on_Logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page()
	{
		String expected="actiTIME - Login";
		try
		{
			String actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I close Application$")
	public void I_close_Application()
	{
		try
		{
			oBrowser.quit();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Given("^I find the Tasks button$")
	public void I_find_the_Tasks_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Then("^I add new customer$")
	public void I_add_new_customer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[12]/div[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I enter customer name and create customer$")
	public void I_enter_customer_name_and_create_customer()
	{
		try
		{
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("TestUser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Given("^I select customer$")
	public void I_select_customer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@And("^I Delete customer$")
	public void I_Delete_customer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Given("^I find the Customer$")
	public void Given_I_find_the_Customer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input")).clear();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Parameters:
	 * Return Type:
	 * Purpose:
	 * Description:
	 */
	@Then ("^I modify the Customer$")
	public void I_modify_the_Customer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[3]/div/div[2]/input")).sendKeys("Modify Customer");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

