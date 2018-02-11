package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class internerExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe");
       WebDriver driver = new InternetExplorerDriver();
       driver.get("http://www.google.com");
	}

}
