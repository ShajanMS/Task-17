package guvSele;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_17 {

	public static void main(String[] args) {
		
		// Set the path to the ChromeDriver executable
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		
		// Initialize a new instance of the ChromeDriver
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			// Navigate to Snapdeal
			
			driver.get("http://www.snapdeal.com");
			
			// Maximize the browser window
			
			driver.manage().window().maximize();
			
			// Wait until the Sign In button is visible
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			
			WebElement Sign = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")));
			
			// Move the cursor to the Sign In button and click it
			
			Actions action = new Actions(driver);
			
			action.moveToElement(Sign).perform();
			
			Sign.click();
			
			// Click on the login button that appears after hovering over Sign In
			
			WebElement Login = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a")));
			
			Login.click();
			
			 // Switch to the login frame
			
			WebElement loginFrame = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginIframe")));
			
			driver.switchTo().frame(loginFrame);
		
			 // Enter the valid Email Id in the Email Id field
			
			WebElement emailfield = driver.findElement(By.id("userName"));
			
			emailfield.click();
			
			emailfield.sendKeys("hcat12123@gmail.com");
			
			// Click on the Continue button
			
			WebElement Continue = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkUser")));
			
			Continue.click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}

}
