package Basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


				System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//a[@id='terms-link']")).click();
				System.out.println(driver.getTitle());
				Set<String> ids=driver.getWindowHandles();
				java.util.Iterator<String> it=ids.iterator();
				String parendid = it.next();
				String childid = it.next();
				driver.switchTo().window(childid);
				System.out.println(driver.getTitle());
				driver.switchTo().window(parendid);
				System.out.println(driver.getTitle());


			}


}
