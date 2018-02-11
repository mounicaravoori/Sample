package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
	       driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();

	       System.out.println( driver.switchTo().alert().getText());
	        driver.switchTo().alert().accept(); //for ok, yes, sure, done
	        //driver.switchTo().alert().dismiss(); //for negative responses
	        //to get the text question in popbox
	}

}
