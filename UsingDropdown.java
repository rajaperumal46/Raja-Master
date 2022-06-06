package basicProgram;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);

		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select2 = new Select(dropdown2);
		select2.selectByVisibleText("Appium");

		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("3");
		
		WebElement dropdown4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select select4 = new Select(dropdown4);
		java.util.List<WebElement> listOfOptions = select4.getOptions();
		int size = listOfOptions.size();
		System.out.println(size);

		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropdown5.sendKeys("Loadrunner");
		
		Select select5 = new Select(dropdown4);
		java.util.List<WebElement> listOfOptions2 = select5.getOptions();
		int count = listOfOptions2.size();
		for (int i = 0; i < count; i++) {
			System.out.println(listOfOptions2.get(i).getText());
			
		WebElement dropdown6 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		Select select6 = new Select(dropdown6);
		select6.selectByIndex(1);
		select6.selectByIndex(2);
		select6.selectByIndex(3);
		
		Thread.sleep(4000);
		
		driver.close();
			
		}
		




	}

}
