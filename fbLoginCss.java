package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLoginCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://facebook.com");
       driver.findElement(By.cssSelector("input[id='email']")).sendKeys("nityask16@gmail.com");
       driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("50742067h3");
       driver.findElement(By.cssSelector("input[id='u_0_2']")).click();
       System.out.println(driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText());
	}
}
