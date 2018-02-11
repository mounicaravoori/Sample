package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLoginXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://facebook.com");
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nityask16@gmail.com");
       driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("5074206n73");
		 driver.findElement(By.id("loginbutton")).click();
       System.out.println(driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText());
	}

}
