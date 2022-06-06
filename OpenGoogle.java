package basicProgram;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("raja@gmail.co");
		WebElement append = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		append.sendKeys("Raja");
		WebElement name1 = driver.findElement(By.name("username"));
		String gettext = name1.getAttribute("value");
		System.out.println(gettext);
		WebElement clearname = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearname.clear();
		WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disabledbox.isEnabled();
		if (enabled) {
			System.out.println("enabled");
		} else {
			System.out.println("Disabled");
		}
		
		
		
		
	}

}
