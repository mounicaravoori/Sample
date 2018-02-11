package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchingAFlight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      driver.manage().window().maximize();
      driver.get("https://www.travelocity.com/");
      driver.findElement(By.xpath("//button[@id='tab-flight-tab-hp']")).click();
      driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).click();

      driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys("MSP");
      driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).sendKeys("CHI");
      driver.findElement(By.xpath("//*[@id=\"flight-departing-hp-flight\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[5]/td[4]/button")).click();

      driver.findElement(By.id("flight-returning-hp-flight")).click();
     driver.findElement(By.xpath("//*[@id=\"flight-returning-wrapper-hp-flight\"]/div/div/div[3]/table/tbody/tr[1]/td[6]/button")).click();
	 Select s1 = new Select(driver.findElement(By.id("flight-adults-hp-flight")));
	 s1.selectByValue("2");
	 Select s2 = new Select(driver.findElement(By.id("flight-children-hp-flight")));
	 s2.selectByIndex(1);
	 Select s5 = new Select(driver.findElement(By.id("flight-age-select-1-hp-flight")));
	 s5.selectByVisibleText("Under 1");
	 driver.findElement(By.xpath("//input[@id='flight-children-in-seat-hp-flight']")).click();
	 driver.findElement(By.id("flight-advanced-options-hp-flight")).click();
	 driver.findElement(By.id("advanced-flight-refundable-label-hp-flight")).click();
	 driver.findElement(By.id("advanced-flight-nonstop-label-hp-flight")).click();
	 Select s3 = new Select(driver.findElement(By.id("flight-advanced-preferred-airline-hp-flight")));
	 s3.selectByVisibleText("Garuda Indonesia");
	 Select s4 = new Select(driver.findElement(By.id("flight-advanced-preferred-class-hp-flight")));
	 s4.selectByValue("first");
	 driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[8]/label/button")).click();
	 System.out.println("Search for flights is Done!");
	}

}
