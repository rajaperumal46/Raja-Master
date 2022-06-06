package basicProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://www.leafground.com/pages/autoComplete.html");
//		
//		WebElement coursetxtbx = driver.findElement(By.id("tags"));
//		coursetxtbx.sendKeys("s");
//		Thread.sleep(1000);
//		
//		List<WebElement> allcourse = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
//		
//		for (WebElement webElement : allcourse) {
//			if (webElement.getText().equals("Selenium")) {
//				webElement.click();
//				
//			}
//			break;
//			
//		}
//		
//		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement searchtxtbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchtxtbox.sendKeys("Raja");
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li"));
		
		for (WebElement webElement : list) {
			
			if(webElement.getText().equals("rajang")) {
				webElement.click();
				break;
			}
			
		}
				
				
		
	}
		

}
	
