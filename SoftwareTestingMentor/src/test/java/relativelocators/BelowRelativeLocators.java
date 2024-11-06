package relativelocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class BelowRelativeLocators {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.saucedemo.com");
		//Test case 1 :- username not entered
		 /*
		WebElement usernamefield = driver.findElement(By.id("user-name"));
		WebElement passwordfield = driver.findElement(RelativeLocator.with(By.tagName("input")).below(usernamefield));
		passwordfield.sendKeys("testpasswordusingbelowlocator");
		WebElement loginfield = driver.findElement(RelativeLocator.with(By.id("login-button")).below(passwordfield));
		loginfield.click();*/
		 
		//Test case 2 :- password not entered
		/*
		WebElement usernamefield2 = driver.findElement(By.id("user-name"));
		WebElement passwordfield2 = driver.findElement(RelativeLocator.with(By.tagName("input")).below(usernamefield2));
		usernamefield2.sendKeys("testusernameusingbelowlocator");
		WebElement loginfield2 = driver.findElement(RelativeLocator.with(By.id("login-button")).below(passwordfield2));
		loginfield2.click();*/
		
		//Test Case 3 :- both username and password not entered
		/*
		WebElement usernamefield3 = driver.findElement(By.id("user-name"));
		WebElement passwordfield3 = driver.findElement(RelativeLocator.with(By.tagName("input")).below(usernamefield3));
		WebElement loginfield3 = driver.findElement(RelativeLocator.with(By.id("login-button")).below(passwordfield3));
		loginfield3.click();*/
		 
		 //Test case 4 : - bothusername and password enterd valid
		 WebElement usernamefield4 = driver.findElement(By.id("user-name"));
		 usernamefield4.sendKeys("standard_user");
		 WebElement passwordfield4 = driver.findElement(RelativeLocator.with(By.tagName("input")).below(usernamefield4));
		passwordfield4.sendKeys("secret_sauce");
		WebElement loginfield4 = driver.findElement(RelativeLocator.with(By.id("login-button")).below(passwordfield4));
		loginfield4.click();
		
		
	}

}
