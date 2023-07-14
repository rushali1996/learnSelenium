package Scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlesTest {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.stqatools.com/demo/Windows.php");
			driver.manage().window().maximize();
			String parentWindow= driver.getWindowHandle();
			System.out.println("parent window: "+ parentWindow);
			WebElement button1= driver.findElement(By.xpath
					("(//button[@class='btn btn-info'])[1]"));
			button1.click();
			
			Set<String> tabs= driver.getWindowHandles();
			System.out.println("no of windows= "+ tabs.size());
			
			for(String childWindow:tabs) {
				System.out.println("child window: "  + childWindow);
				if(!childWindow.equalsIgnoreCase(parentWindow))
				{
					driver.switchTo().window(childWindow);
					WebElement check= driver.findElement(By.xpath
							("(//span[@class='menu-text'])[2]"));
					check.click();
				}	
			}
	        driver.close(); //if we use this it will give no such window exception
			driver.switchTo().window(parentWindow);
			
			WebElement button2= driver.findElement(By.xpath
					("(//button[@class='btn btn-info'])[2]"));
			button2.click();
			Set<String> tabs2= driver.getWindowHandles();
			System.out.println("no of windows= "+ tabs2.size());
			
			for(String childWindow1:tabs2) {
				System.out.println("child window: "  + childWindow1);
				if(!childWindow1.equalsIgnoreCase(parentWindow))
				{
					driver.switchTo().window(childWindow1);
					WebElement check= driver.findElement(By.xpath
							("//span[@class='navbar-toggler-icon']"));
					check.click();
				}	
			}
			 driver.close(); 
		    driver.switchTo().window(parentWindow);
				
//			driver.switchTo().window(parentWindow);
//			WebElement button3= driver.findElement(By.xpath
//					("(//button[@class='btn btn-info'])[2]"));
//			button3.click();
//			driver.close();
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.navigate().to("https://www.selenium.dev");
		    driver.quit();
			

	}

	}
