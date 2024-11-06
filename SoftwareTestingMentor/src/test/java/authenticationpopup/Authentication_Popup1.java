package authenticationpopup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_Popup1 {
/*public static String username = "admin"; //read from excel
public static String password = "password"; //read from excel*/
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//to handle any authentication we can handle in the url itself
		//https://the-internet.herokuapp.com/basic_auth
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//if reading from excel sheet 
		//"https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth"
		
	}

}
