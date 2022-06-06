package basicProgram;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-L7480\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement homepage = driver.findElement(By.id("home"));
		//
		
		WebElement getposition = driver.findElement(By.id("position"));
		org.openqa.selenium.Point xyvalue = getposition.getLocation();
		int xvalue = xyvalue.getX();
		int yvalue = xyvalue.getY();
		System.out.println("X value -"+ xvalue + "Y value" + yvalue);
		
		WebElement colorbutton = driver.findElement(By.id("color"));
		String color = colorbutton.getCssValue("background-color");
		System.out.println("bg color is"  + color);
		
		WebElement sizebutton = driver.findElement(By.id("size"));
		int height = sizebutton.getSize().getHeight();
		int width = sizebutton.getSize().getWidth();
		System.out.println("Height is " + height + "Width is" + width);
		
		homepage.click();
	}

}
