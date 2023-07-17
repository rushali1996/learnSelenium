package Scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitTest {

	public waitTest() {
		
	}

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement schBox =driver.findElement(By.name
				("qa"));
		schBox.sendKeys("java test");
		
		
	}

}
