package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		
		
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable")); 
		WebElement end = driver.findElement(By.id("mydiv"));
		Actions move = new Actions(driver);
		move.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		Thread.sleep(3000);
		Actions last = new Actions(driver);
		last.clickAndHold(to).moveToElement(end).release(end).build().perform();
		
		
		
		

	}

}
