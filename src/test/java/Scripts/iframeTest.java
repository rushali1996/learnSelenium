package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframeTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		String strlabel= driver.findElement(By.xpath("//label/span")).getText();
		System.out.println("text : "+ strlabel);
		driver.switchTo().frame("frame1");
		
		WebElement topic= driver.findElement(By.xpath("//input[@type='text']"));
		 topic.sendKeys("RushaliVerma");
		 Thread.sleep(1000);
		 //fram1 to frame 3
		 driver.switchTo().frame("frame3");
		 driver.findElement(By.id("a")).click();
		 
		 //frame 3 to frame 1
		 driver.switchTo().parentFrame();
		 driver.findElement(By.xpath("//input[@type='text']")).clear();
		 driver.findElement(By.xpath("//input[@type='text']"))
		 .sendKeys("Welcome Back Rushali Verma");
		 
		 //any frame to main page
		 driver.switchTo().defaultContent();
		 
		 //main page to frame 2
		 System.out.println(driver.findElement(By.xpath("//label/span")).getText());
		 driver.switchTo().frame("frame2");
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		 Select select = new Select(animal);
		 select.selectByVisibleText("Baby Cat");
		 //
	
		 
		 
		 

	}

}
