package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       //implicit wait below
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	
	       driver.get("https://www.alaskaair.com/");
	      driver.findElement(By.id("tab-hotels")).click();
          driver.findElement(By.xpath("//*[@id=\"hotelOnlyToLocation\"]")).sendKeys("msp");
          //driver.findElement(By.xpath("//*[@id=\\\"hotelOnlyToLocation\\\"]")).sendKeys(Keys.TAB);
         //driver.findElement(By.xpath("//*[@id=\\\"hotelOnlyToLocation\\\"]")).sendKeys(Keys.ENTER);
         driver.findElement(By.id("FindHotels")).click();
       //expilicit wait below
         WebDriverWait d = new WebDriverWait(driver, 10);
	       d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@target='663057']")));

         driver.findElement(By.xpath("//*[@target='663057']")).click();

}

}
