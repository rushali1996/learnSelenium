package Scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		//first
		WebElement Button1=driver.findElement(By.xpath
				("//button[@class='btn btn-default']"));
		Button1.click();
        Alert alert= driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        //second
        WebElement Button2=driver.findElement(By.xpath
				("(//button[@class='btn btn-default btn-lg'])[1]"));
        Button2.click();
        System.out.println(alert.getText());
        alert.accept();
        //third
        WebElement Button3=driver.findElement(By.xpath
				("(//button[@class='btn btn-default btn-lg'])[2]"));
        Button3.click();
        System.out.println(alert.getText());
        alert.sendKeys("Rushali");
        alert.accept();
        WebElement test=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
        System.out.println( test.getText());
	}

}
