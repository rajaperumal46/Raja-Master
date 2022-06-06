package basicProgram;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		
//		java.util.List<WebElement> select = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
//		int listsize = select.size();
//		System.out.println(listsize);
//	
//		Actions action = new Actions(driver);
//		action.keyDown(Keys.CONTROL).click(select.get(0)).click(select.get(1)).click(select.get(2)).build().perform();
		
//		java.util.List<WebElement> select = driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
//		WebElement select1 = driver.findElement(By.xpath("//*[@id=\'selectable\']/li[1]"));
//		WebElement select2 = driver.findElement(By.xpath("//*[@id=\'selectable\']/li[2]"));
//		WebElement select3 = driver.findElement(By.xpath("//*[@id=\'selectable\']/li[3]"));
//		int listsize = select.size();
//		System.out.println(listsize);
//	
//		Actions action = new Actions(driver);
//		action.keyDown(Keys.CONTROL).click(select1).click(select2).click(select3).build().perform();
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\'selectable\']/li[1]"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\'selectable\']/li[3]"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
		
	}

}
