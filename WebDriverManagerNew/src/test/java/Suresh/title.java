package Suresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class title {
	
	public static void main(String[] args) {
		//open url using Headless
		/*ChromeOptions co=new ChromeOptions();
		co.setHeadless(true);
		WebDriver driver=WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();*/
		
		
		//opening url
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.quit();
		
		
	}

}
