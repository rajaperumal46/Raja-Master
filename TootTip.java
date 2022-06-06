package basicProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TootTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");

		WebElement nametxtbox = driver.findElement(By.id("age"));
		String tooltiptxt = nametxtbox.getAttribute("title");
		System.out.println(tooltiptxt);


		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwMU02T1JgNGB0YPBiS8_PT89JBQBASQXT&q=google&rlz=1C1GCEB_enUS950US950&oq=goo&aqs=chrome.1.69i57j46i131i199i433i465i512j0i433i512l3j0i131i433i512j0i433i512j69i60.4675j0j7&sourceid=chrome&ie=UTF-8&safe=active");

		WebElement nametxtbox2 = driver.findElement(By.id("logo"));
		String tooltiptxt2 = nametxtbox2.getAttribute("title");
		System.out.println(tooltiptxt2);

	}

}
