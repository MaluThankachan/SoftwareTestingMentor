import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSUsingSubstring {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/elf-v2-login/?d=70130000000Enus");
		WebElement jobtittleprefix = driver.findElement(By.cssSelector("input[name^='UserT']"));
		jobtittleprefix.sendKeys("Engineerprefix");
		jobtittleprefix.clear();
		WebElement jobtittlesuffix = driver.findElement(By.cssSelector("input[name$='Title']"));
		jobtittlesuffix.sendKeys("Engineersuffix");
		WebElement firstusernamesubstring = driver.findElement(By.cssSelector("input[name*='UserFirst']"));
		firstusernamesubstring.sendKeys("Malu");

	}

}
