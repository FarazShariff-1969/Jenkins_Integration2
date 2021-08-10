
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args)
	{

		System.out.println(" Welcome to Java Selenium ");
		
		System.setProperty("webdriver.chrome.driver","./driver2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	    driver.manage().window().maximize();

	    String url = "https://accounts.google.com/signin";

	    driver.get(url);

	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	    WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));

	    email_phone.sendKeys("farazenquero@gmail.com");

	    driver.findElement(By.id("identifierNext")).click();
	}

}
