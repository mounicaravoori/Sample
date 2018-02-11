package Basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EbayColumnLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		WebElement col = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul"));
		int num = col.findElements(By.tagName("a")).size();
		System.out.println("Number of links in this section are: "+num);
		
		//initializing variables
		String BeforeClick = null;
		String AfterClick;

		BeforeClick = driver.getTitle();
           System.out.println("title before clicking link "+BeforeClick );
		for(int i=0;i<=num;i++) {
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());
			if(col.findElements(By.tagName("a")).get(i).getText().contains("See all companies")) {

				col.findElements(By.tagName("a")).get(i).click();
				break;

			}
		}
		  //using explicit wait as the title name is not displayed
          Thread.sleep(5000L);	
		AfterClick = driver.getTitle();
		   System.out.println("title After clicking link "+AfterClick);
		
		//validating that both page titles are not same
		if(BeforeClick!= AfterClick) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}


	}
}
