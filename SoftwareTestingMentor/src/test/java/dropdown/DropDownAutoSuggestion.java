package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// FINDING FROM AIRPORT
		WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		
		WebElement toinputtextfield = driver.findElement(By.xpath("//input[@placeholder='From']"));
		toinputtextfield.sendKeys("San Francisco, United States");
		Thread.sleep(2000);
		toinputtextfield.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		toinputtextfield.sendKeys(Keys.ENTER);
		
		//FINDING TO AIRPORT
		Thread.sleep(2000);
		WebElement to = driver
				.findElement(By.xpath("//span[@class='lbl_input appendBottom10' and contains(text(),'To')]"));
		Thread.sleep(2000);
		to.click();
		WebElement inputfieldtext = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		inputfieldtext.sendKeys("Mumbai");
		Thread.sleep(2000);
		inputfieldtext.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		inputfieldtext.sendKeys(Keys.ENTER);

	}

}
