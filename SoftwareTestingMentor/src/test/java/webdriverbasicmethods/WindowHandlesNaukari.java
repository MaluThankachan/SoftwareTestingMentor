package webdriverbasicmethods;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesNaukari {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gad_source=1&gclid=CjwKCAjwjsi4BhB5EiwAFAL0YNEGPKVsEUonqlHCwFYLIx7yoMFNMFQ-FgNoNW6c4IixVbcEBD9aghoCMjoQAvD_BwE&gclsrc=aw.ds");

        // Get the current window handle
        String originalWindow = driver.getWindowHandle();
        System.out.println("Original window handle: " + originalWindow);
        
      WebElement clicks = driver.findElement(By.xpath("//button[@class='socialbtn google resman-btn-tertiary resman-btn-medium']"));
      clicks.click();
        
        Set<String> parentchildwindowhandles = driver.getWindowHandles();
        System.out.println("New Window Handles: " + parentchildwindowhandles);
        
        

       

	}

}
