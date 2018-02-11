package Basics;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayLinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		System.out.println("the links count in entire page");
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    WebElement footer = driver.findElement(By.id("glbfooter"));
	    System.out.println("the links count in footer section");
	    System.out.println( footer.findElements(By.tagName("a")).size());
	    

	  	}

}
