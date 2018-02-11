package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //for Firefox

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());
        System.out.println(driver.getCurrentUrl());
        driver.close();
	}

}
