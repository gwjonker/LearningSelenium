package fixtures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
	
	//Constructor / non-static
	SearchGoogle() {
		System.out.println("Instantiated SearchGoogle");
	}
	
	// non-static so to be instantiated
	// Start server for Chrome and return webdriver object 
	private WebDriver StartChrome() {
		System.setProperty("webdriver.chrome.driver", "c:/devenv/chromeserver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	private static void gotoUrl(WebDriver d, String u) {
		System.out.println("Go to URL: " + u);
		d.get(u);
	}
	
	
	//static so can be called directly
	private static String getTitle(WebDriver d) {
		return d.getTitle();
	}
	
	
	private static void setSearchText(WebDriver d, String searchText) {
		// TODO Auto-generated method stub
		
		 WebElement searchField = d.findElement(By.id("q"));
		 searchField.clear();
		 searchField.sendKeys(searchText);
	}	
	
	
	//main program
	public static void main(String[] args) {
		final String appUrl 	= "http://www.google.com";
		final String searchText = "automated testing";
		
		//Start Chrome
		SearchGoogle s = new SearchGoogle();	
		WebDriver d = s.StartChrome();
		
		//Go to URL
		SearchGoogle.gotoUrl(d, appUrl);
		
		//Get Title
		String r = SearchGoogle.getTitle(d);
		System.out.println("Title: " + r);
		
		//setSearch text
		SearchGoogle.setSearchText(d, searchText);
		
		
		
		//driver.close();
		//System.exit(0);
		
	}

	
		
		
}
