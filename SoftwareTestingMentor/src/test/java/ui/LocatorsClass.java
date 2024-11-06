package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.saucedemo.com");
		//driver.findElement(By.id("user-name")).sendKeys("Testing");
		//driver.findElement(By.name("user-name")).sendKeys("Testing");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing");
		//driver.findElement(By.tagName("input")).sendKeys("Testing");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("Testing");*/
		driver.get("https://www.selenium.dev/documentation/overview/");
		driver.findElement(By.linkText("Components")).click();
	}

}
