package basicProgram;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement btn1 = driver.findElement(By.id("Click"));
		btn1.click();
		
		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement btn2 = driver.findElement(By.id("Click1"));
		btn2.click();
		
		String text2 = driver.findElement(By.id("Click1")).getText();
		System.out.println(text2);
		
		
		driver.switchTo().defaultContent();
		List<WebElement> TotalFrame = driver.findElements(By.tagName("iframe"));
		int size = TotalFrame.size();
		System.out.println(size);
	}

}
