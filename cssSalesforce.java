package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.salesforce.com/");
       driver.findElement(By.linkText("Login")).click();
       driver.findElement(By.cssSelector("input[id='username']")).sendKeys("mounicaravoori");
       driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("1234567");
       driver.findElement(By.cssSelector("input[id='Login']")).click();
       System.out.println(driver.findElement(By.cssSelector("div[id='error']")).getText());
       
	}

}
