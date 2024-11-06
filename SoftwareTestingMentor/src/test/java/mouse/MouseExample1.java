package mouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseExample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		WebElement electronics = driver.findElement(By.xpath("//li[@data-hover-track='p4375194.m1380.l6435']//a[@_sp='p4375194.m1380.l3250' and contains(text(),'Electronics')  ]"));
		
		//TO DO MOUSE ACTIONS WE NEED ACTIONS CLASS
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(electronics).build().perform();
		Thread.sleep(3000);
		action.click().build().perform();

	}

}
