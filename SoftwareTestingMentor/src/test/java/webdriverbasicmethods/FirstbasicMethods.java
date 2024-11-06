package webdriverbasicmethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstbasicMethods {

	public static void main(String[] args) {
		
		
	        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();

	        // Print title and current URL
	        String title = driver.getTitle();
	        System.out.println(title);
	        String currentUrl = driver.getCurrentUrl();
	        System.out.println(currentUrl);

	        // Print page source
	        String pageSource = driver.getPageSource();
	        System.out.println(pageSource);

	        // Log in
	        WebElement username = driver.findElement(By.id("user-name"));
	        username.sendKeys("standard_user");
	        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	        password.sendKeys("secret_sauce");
	        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
	        loginButton.click();

	        // Find all inventory items
	        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='inventory_list']/div"));
	        System.out.println(elements);

	        // Navigate to a different URL
	        driver.navigate().to("https://testrigor.com/");

	        // Get current window handle
	        String originalWindow = driver.getWindowHandle();
	        System.out.println("Original window handle: " + originalWindow);

	        // Click a link to open a new window
	        driver.findElement(By.xpath("//div[@class='menu-tr-drop-down-container']//ul[@id='menu-tr-drop-down']//li[@id='menu-item-2616']/a")).click();

	        // Add a wait to ensure the new window is opened
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        String originalWindow2 = driver.getWindowHandle();
	        System.out.println("secnd window handle: " + originalWindow2);

	        // Get all window handles
	        Set<String> allHandles = driver.getWindowHandles();
	        System.out.println("All window handles: " + allHandles);
	}

}
