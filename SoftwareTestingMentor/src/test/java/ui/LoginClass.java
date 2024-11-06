package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		// now to check username we need to get id of username from inspect
		driver.findElement(By.id("user-name")).sendKeys("standard_user"); // now selenium can find the username textbox
																			// using given id
		//ND to check test we need to use sendkeys inside that valid username
		driver.findElement(By.id("password")).sendKeys("secret_sauce");//to fet password field and give password
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		//driver.close();
		//OR
		//driver.findElement(By.id("login-button")).click();
	}

}
