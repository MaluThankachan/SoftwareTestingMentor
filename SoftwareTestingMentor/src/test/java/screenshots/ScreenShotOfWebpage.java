package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfWebpage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Date currentdate = new Date();
		System.out.println(currentdate);
		String screenshotdate = currentdate.toString().replace(" ", "-").replace(":", "-");
		
		File screnshotfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		
		FileUtils.copyFile(screnshotfile, new File(".//screenshot//"+screenshotdate+".png"));//in this case evrytime the screen shot overrides
		//So to avoid that we can use date class so that each time screenshot wont be replaced and new ll be there

	}

}
