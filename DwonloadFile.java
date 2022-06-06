package basicProgram;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DwonloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement download = driver.findElement(By.linkText("Download Excel"));
		download.click();
		
		Thread.sleep(5000);
		
		File filelocation = new File("C:\\Users\\d65821\\Downloads");
		
		File[] allfiles = filelocation.listFiles();
		
		for (File file : allfiles) {
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("File is downloaded " + file.getName());
				break;
				
			}
			
			
		}
		
		
		
		

	}

}
