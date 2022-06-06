package basicProgram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertbox1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		alertbox1.click();
		Alert alert1= driver.switchTo().alert();
		alert1.accept();
		
		
		WebElement confirmbtn = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbtn.click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Raja");
		alert3.accept();
		
		
		
			
		
		
	}

}
