package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaClickAcademyTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");      
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/index.php");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[4]/a")).click();
		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		
	}

}
