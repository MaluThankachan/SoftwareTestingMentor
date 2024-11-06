package xpathfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AndandOrInXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		WebElement serachbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More' and @name='q']"));
		serachbox.sendKeys("Mobiles");

	}

}
