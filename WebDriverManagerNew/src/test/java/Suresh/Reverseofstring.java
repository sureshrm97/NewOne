package Suresh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reverseofstring {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.opencart.com/");
		/*driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("FlipKart");
		
		for(int i=0;i<=5;i++) {
			driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);

		}
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);*/

		
		
		
		}

}
