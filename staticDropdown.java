package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("http://spicejet.com/");
      Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
      s.selectByIndex(4);
      s.selectByValue("7");
      s.selectByVisibleText("9");
    //  System.out.println(s.getAllSelectedOptions());
      
	}

}
