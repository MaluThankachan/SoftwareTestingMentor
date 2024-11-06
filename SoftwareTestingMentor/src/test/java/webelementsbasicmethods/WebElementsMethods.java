package webelementsbasicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	        WebElement username = driver.findElement(By.id("user-name"));
	        username.sendKeys("standard_user");
	        username.clear();
	        System.out.println(username.getAttribute("class"));
	        WebElement password = driver.findElement(By.id("password"));
	        password.sendKeys("secret_user");
	        WebElement loginbtn = driver.findElement(By.id("login-button"));
	        System.out.println(loginbtn.getCssValue("background-color"));
	        System.out.println(loginbtn.getCssValue("color"));
	        System.out.println(loginbtn.getCssValue("font-size"));
	        System.out.println(loginbtn.getCssValue("font-style"));
	        System.out.println(loginbtn.getLocation().getX());
	        System.out.println(loginbtn.getLocation().getY());
	        System.out.println(loginbtn.getSize());
	        System.out.println(loginbtn.getTagName());
	        System.out.println(loginbtn.isDisplayed());
	        System.out.println(loginbtn.isEnabled());      
	        loginbtn.click();
	        
	        

	}

}
