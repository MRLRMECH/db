package Launching;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanunch {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\RAM\\OneDrive\\Desktop\\java selenium\\chromedriver_win32\\chromedriver.exe" );
	    WebDriverManager.chromedriver().setup();
		ChromeDriverManager driver = new ChromeDriverManager();
	    
	    
	   
		//System.setProperty("webdriver.gecko.driver", "C:/Users/RAM/OneDrive/Desktop/java selenium/geckodriver-v0.30.0-win64/geckodriver.exe");
		 WebDriverManager.firefoxdriver().setup();
		FirefoxDriverManager driver1 = new  FirefoxDriverManager();
		

	}

}
