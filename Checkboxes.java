package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://www.spicejet.com/");
       System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
       driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
       System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).isSelected());
	}

}
