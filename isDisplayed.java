package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://us.makemytrip.com/");

		//System.out.println(driver.findElement(By.cssSelector("label[for='trip_type_multicity']")).isDisplayed());
		//System.out.println("Before selecting radio button");
		driver.findElement(By.cssSelector("label[for='trip_type_multicity']")).click();

		
			

	}

}
