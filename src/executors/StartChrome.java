package executors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;	


public class StartChrome {
	public static void main(String[] args) {
		// chromedriver (in fact server) must be downloaded and placed anywhere
		// also directory of chromedriver added to PATH-environment variable
		// https://sites.google.com/a/chromium.org/chromedriver/getting-started 
				
		System.setProperty("webdriver.chrome.driver", "c:/devenv/chromeserver/chromedriver.exe");
		WebDriver driver 		= new ChromeDriver();
		
		String appUrl 			= "https://accounts.google.com";
	
		driver.get(appUrl);
		driver.manage().window().maximize();
		
		String actualTitle	= driver.getTitle();
		System.out.println("Actual:   |" + actualTitle + "|");
						
		//driver.close();
		//System.exit(0);
	}
	
	
}

	

