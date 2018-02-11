package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.com");
	       WebElement sBox =  driver.findElement(By.id("twotabsearchtextbox"));
	       sBox.sendKeys("Dell");
	       sBox.submit();
	      WebElement cBox = driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[2]/div/li/span/span/div/label/input"));
	      cBox.click();
	      System.out.println(cBox.isSelected());
	      //verifying if the checkbooks is checked or not
	       
	       
	}
	

}
