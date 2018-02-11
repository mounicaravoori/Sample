package Basics;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.com");
	       driver.findElement(By.id("searchDropdownBox")).click();
	       java.util.List<WebElement> ddlist = driver.findElements(By.tagName("option"));
	       int n = ddlist.size();
	       for(int i=0;i<n;i++) {
	    	   System.out.println(ddlist.get(i).getText());   	   
	       }
	}
	}
