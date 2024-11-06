package relativelocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class AboveRelativeLocator1 
{
	 public static void main(String[] args)
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com");

	        // Find a reference element
	        WebElement passwordfield = driver.findElement(By.id("password"));

	        // Use a relative locator to find an element
	        WebElement usernamefield = driver.findElement(RelativeLocator.with(By.tagName("input")).above(passwordfield));
	        usernamefield.sendKeys("testuser");
 
		

       
    }
}
