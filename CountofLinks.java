package Basics;
import java.util.List;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountofLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com");
	       List<WebElement> links = driver.findElements(By.tagName("a"));
	       links.removeAll(Collections.singleton(null));
	       int n = links.size();
	     
	       for(int i=0; i<n; i++)
	       {
	         String linknames = links.get(i).getText();

		       
		    	   System.out.println("The linkname at index "+i+" are "+linknames);
		      
	         	       }
	    	   
	}
}
