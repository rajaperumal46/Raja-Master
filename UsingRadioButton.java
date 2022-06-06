package basicProgram;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement yes = driver.findElement(By.xpath("//*[@id='yes']"));
		//WebElement no = driver.findElement(By.xpath("//*[@id=\'no\']"));
		
		yes.click();
		
		
		
	}

}
