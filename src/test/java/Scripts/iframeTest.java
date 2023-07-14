package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		String strlabel= driver.findElement(By.xpath("//label/span")).getText();
		System.out.println("text : "+ strlabel);
		//driver.switchTo()
		//WebElement topic= driver.findElement(By.xpath("//b[@id='topic']"));
		 //topic.sendKeys("RushaliVerma");

	}

}
