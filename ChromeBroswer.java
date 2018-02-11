package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
      /* driver.get("http://google.com");
       System.out.println(driver.getTitle());
       System.out.println(driver.getPageSource());
       System.out.println(driver.getCurrentUrl());
       driver.close();*/
       driver.get("http://facebook.com");
       driver.findElement(By.id("email")).sendKeys("nityask16@gmail.com");
       driver.findElement(By.id("pass")).sendKeys("5074206773");
     //  driver.findElement(By.cssSelector("#u_0_a")).click();
       //driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
      // driver.findElement(By.linkText("Forgot account?")).click();
       //forgot account xpath in facebook
       driver.findElement(By.cssSelector("input#u_0_2")).click();
       System.out.println("Successfully logged into Facebook home");
	}

}
