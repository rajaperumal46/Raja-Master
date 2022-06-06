package basicProgram;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement homepage = driver.findElement(By.xpath("//*[@id=\'home\']"));
		homepage.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newwindow : handles) {
			driver.switchTo().window(newwindow);
		}
		
		WebElement editlink = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a"));
		editlink.click();
		
		WebElement emailtxtbox = driver.findElement(By.id("email"));
		emailtxtbox.sendKeys("Raja");
		
		driver.switchTo().window(oldwindow);
		
		homepage.click();
		
		
		
		
		
		
	}

}
