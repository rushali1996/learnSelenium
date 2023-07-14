package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toolTipTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		Actions actions = new Actions(driver);
		
		driver.get("https://jqueryui.com/tooltip");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(
				driver.findElement((By.cssSelector(".demo-frame"))));
		
		WebElement age= driver.findElement(By.id("age"));
		actions.moveToElement(age).perform();
		
		String strTxt= driver.findElement(By.cssSelector
				(".ui-tooltip-content")).getText();
		System.out.println(strTxt);
		
		
		
				

	}

}
