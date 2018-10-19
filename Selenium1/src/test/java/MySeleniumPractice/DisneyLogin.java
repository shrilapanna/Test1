package MySeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisneyLogin {

	public static void main(String[] args) {
		//Open Browser
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shrila\\git\\Test1\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://www.yahoo.com");	
		
		
		
		
		//Navigate the Browser/back/Refresh
		
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		

	}

}
