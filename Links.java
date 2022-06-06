package basicProgram;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement homepagelnk = driver.findElement(By.linkText("Go to Home Page"));
		homepagelnk.click();
		
		driver.navigate().back();
		
		WebElement wheretogo = driver.findElement(By.partialLinkText("Find where"));
		String wherelnk = wheretogo.getAttribute("href");
		System.out.println("this is link is going to : " + wherelnk);
		
		WebElement brokenlnk = driver.findElement(By.linkText("Verify am I broken?"));
		brokenlnk.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("This link is broken");	
		}
		driver.navigate().back();
		
		WebElement duplicatelnk = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a"));
		duplicatelnk.click();
		driver.navigate().back();
		
		java.util.List<WebElement> total = driver.findElements(By.tagName("a"));
		int count = total.size();
		System.out.println("total links in this page is : " + count);
		

	}

}
