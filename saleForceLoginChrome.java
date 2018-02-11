package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saleForceLoginChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("mona.monica08@gmail.com");
        driver.findElement(By.id("password")).sendKeys("1028skP@8");;
        //driver.findElement(By.className("button r4 wide primary")).click();
        //driver.findElement(By.linkText("Forgot Your Password?")).click();
        driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
        System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	}

}
