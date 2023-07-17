package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsExecutorTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://https://demo.opencart.com/");
		driver.manage().window().maximize();
		
        // Click on "My Account" link
        driver.findElement(By.xpath("//span[text()='My Account']")).click();

        // Click on "Register" option
        driver.findElement(By.linkText("Register")).click();

        // Fill in the registration form
        driver.findElement(By.id("input-firstname")).sendKeys("Rushali");
        driver.findElement(By.id("input-lastname")).sendKeys("Verma");
        driver.findElement(By.id("input-email")).sendKeys("rushaliverma@example.com");
        driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
        driver.findElement(By.id("input-password")).sendKeys("your_password");
        driver.findElement(By.id("input-confirm")).sendKeys("your_password");

        
        JavascriptExecutor js= (JavascriptExecutor)driver;
       // js.executeScript("alert('Welcome')");
        String strTitle= (String)js.executeScript("return document.title");
        System.out.println(strTitle);
        js.executeScript("window.scrollBy(10,500)");
        js.executeScript("window.scrollBy(10,document.boy.scrollHeight)");
        
        WebElement srcBox= (WebElement)js.executeScript("return document.getelementsByName('search')[0]");
        js.executeScript("history.go(0)");
        
        // Click on the "Privacy Policy" checkbox
        WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
        if (!privacyPolicyCheckbox.isSelected()) {
            privacyPolicyCheckbox.click();
        }

        // Click on the "Continue" button to register
        driver.findElement(By.cssSelector("input[value='Continue']")).click();


	}

}
