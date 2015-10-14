package executors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class StartFirefox {
	public static void main(String[] args) {
		WebDriver driver 		= new FirefoxDriver();
		
		String appUrl 			= "https://accounts.google.com";
			
		driver.get(appUrl);
		
		driver.manage().window().maximize();
		
		String actualTitle	= driver.getTitle();
		System.out.println("Actual:   |" + actualTitle + "|");
		
		//driver.close();
		//System.exit(0);
	}
	
	
}

	

