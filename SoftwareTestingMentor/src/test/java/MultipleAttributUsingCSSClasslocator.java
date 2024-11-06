import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAttributUsingCSSClasslocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		WebElement startfreetrailbutton = driver.findElement(By.cssSelector(".submit.btn.btn-lg.btn-primary.salesforce-sans-regular.btn-full[type='submit'][name='start my free trial'"));
		startfreetrailbutton.click();

	}

}
