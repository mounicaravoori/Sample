package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//login testcases
		/*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("mona.monica08@gmail.com");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("789789789");
		driver.findElement(By.cssSelector("input[value='Go']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div[2]/div[4]/div")).getText());*/
		//creating new account
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com/");
		driver.findElement(By.linkText("Create a Rediffmail account")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("mounica ravoori");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("mona.monica08");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		System.out.println(driver.findElement(By.cssSelector("#check_availability > font > b")).getText());
		
		

	}

}
