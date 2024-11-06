package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//JSE IS USED TO COMMUNICATE WITH JS CODES. SOMETIMES BUTTON MAY CREATED USING JS INSTEAD 
//OF FINDING BY XPATH WE CAN USE JSE.
//WE CAN SCROLL THE PAGE, GET TITLE, DELETE CACHE.
public class JSE_1 {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		System.out.println(jse.executeScript("return document.title;").toString()); //to get title of webpage
		//searching
		
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Search our tutorials, e.g. HTML']"));
		jse.executeScript("arguments[0].scrollIntoView();", searchbox);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].value = 'Java';", searchbox);
		Thread.sleep(2000);
		
		WebElement searchbtn = driver.findElement(By.xpath("//button[@onclick='click_learntocode_search_btn()']"));
		jse.executeScript("arguments[0].scrollIntoView();", searchbtn);
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", searchbtn);
		
		

	}

}
