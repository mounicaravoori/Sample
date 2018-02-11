package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://www.echoecho.com/htmlforms10.htm");
      // driver.findElement(By.xpath("//input[@value='Cheese']")).click();
      //size() comes with findElements() only
       // System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size()); 
       int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
       System.out.println(count);
       for (int i=0;i<count;i++) {
    	  // driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
    	  String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
          System.out.println(text);

    	  if(text.equals("Cheese")) {
    		  driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
    	  }
       }
	}

}
