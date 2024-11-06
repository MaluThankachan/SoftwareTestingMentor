package xpathfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithFunctionInXpath {
	//starts-with mainly used to find dynamic web elements that is those elements has static portion nd dynamic which may change in every refreshing

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/demo/product-demos/?d=7013y000002ExnFAAS&nc=7013y000002EyZiAAK&utm_content=7013y000002ExnFAAS&utm_source=google&utm_medium=paid_search&utm_campaign=21138460510&utm_adgroup=158697144125&utm_term=salesforce%20software&utm_matchtype=p&gad_source=1&gclid=CjwKCAjw3624BhBAEiwAkxgTOmOKctmf1qpY-q6UxXHH8XdxZH797Y_9TS8c0yRQvK5XIlW9-zVQ8BoCoigQAvD_BwE&gclsrc=aw.ds");
		WebElement lname = driver.findElement(By.xpath("//input[starts-with(@id,'UserLastName-')]"));
		lname.click();
		lname.sendKeys("Testing");
	}
	
}

