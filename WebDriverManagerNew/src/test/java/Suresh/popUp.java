package Suresh;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class popUp {
	
	public void HandlingpouUP() {
		WebDriver suresh=WebDriverManager.chromedriver().create();
		suresh.get("https://www.spicejet.com/");
	}

}
