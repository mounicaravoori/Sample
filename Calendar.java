package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
         driver.get("https://www.path2usa.com/travel-companions");
         driver.findElement(By.id("travel_date")).click();
	}

}
